package br.senac.sp.projetoInicial.Faculdade.resources;

import br.senac.sp.projetoInicial.Faculdade.entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.services.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/faculdade")
public class FaculdadeResources {

    @Autowired
    FaculdadeService faculdadeService;

    @GetMapping(value = "/{ra}")
    public ResponseEntity<Aluno> findById(@PathVariable Integer ra){
        Aluno aluno = faculdadeService.findById(ra);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping(value = "/abertos")
    public ResponseEntity<List<Aluno>> listarAberto(){
        List<Aluno> alunos = faculdadeService.listarTodosAbertos();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/fechados")
    public ResponseEntity<List<Aluno>> listarFechado(){
        List<Aluno> alunos = faculdadeService.listarTodosFechados();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/listar")
    public ResponseEntity<List<Aluno>> listarTodos(){
        List<Aluno> alunos = faculdadeService.listarTodos();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<Aluno> findByNome(@PathVariable String nome){
        Aluno aluno = faculdadeService.findByNome(nome);
        return  ResponseEntity.ok().body(aluno);
    }

    @PostMapping
    public ResponseEntity<Aluno> gravarAluno(@RequestBody Aluno aluno) {
        aluno =  faculdadeService.gravarAluno(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ra}")
        .buildAndExpand(aluno.getRa()).toUri();

        return ResponseEntity.created(uri).body(aluno);
    }

    @DeleteMapping(value = "/{ra}")
    public ResponseEntity<Void> deletar(@PathVariable Integer ra) {
        faculdadeService.deletar(ra);

        return  ResponseEntity.noContent().build();
        
    }

    @PutMapping(value = "/{ra}")
    public ResponseEntity<Aluno> update(@PathVariable Integer ra, @RequestBody Aluno aluno){
        Aluno alterado = faculdadeService.updateAluno(ra, aluno);
        return ResponseEntity.ok().body(alterado);
    }    

}
