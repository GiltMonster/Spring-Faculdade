package br.senac.sp.projetoInicial.Faculdade.services;

import br.senac.sp.projetoInicial.Faculdade.entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaculdadeService {
    @Autowired
    AlunoRepository alunoRepository;

    public Aluno findById(Integer ra){
        Optional<Aluno> aluno = alunoRepository.findById(ra);
        return aluno.orElse(null);
    }

    public List<Aluno> listarTodosAbertos() {
        List<Aluno> alunos = alunoRepository.listarTodosAbertos();
        return alunos;
    }

    public List<Aluno> listarTodosFechados() {
        List<Aluno> alunos = alunoRepository.listarTodosFechados();
        return alunos;
    }

    public List<Aluno> listarTodos(){
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos;
    }

    public Aluno findByNome(String nome) {
        Optional<Aluno> aluno = alunoRepository.findByNome(nome);
        return aluno.orElse(null);
    }

}
