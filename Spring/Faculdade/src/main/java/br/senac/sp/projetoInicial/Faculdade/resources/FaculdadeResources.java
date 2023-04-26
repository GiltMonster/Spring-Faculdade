package br.senac.sp.projetoInicial.Faculdade.resources;

import br.senac.sp.projetoInicial.Faculdade.entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.services.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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

}
