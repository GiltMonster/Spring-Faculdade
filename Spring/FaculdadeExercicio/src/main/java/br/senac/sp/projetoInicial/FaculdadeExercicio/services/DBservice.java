package br.senac.sp.projetoInicial.FaculdadeExercicio.services;

import br.senac.sp.projetoInicial.FaculdadeExercicio.entities.Pessoa;
import br.senac.sp.projetoInicial.FaculdadeExercicio.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DBservice {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Bean
    public void instanciarDB(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Pessoa pessoa1 = new Pessoa(
                "Rodrigo",
                "rodrigo@email.com.br",
                "123456789-12",
                LocalDateTime.parse("25/04/1984 08:30", formato)
        );

        Pessoa pessoa2 = new Pessoa(
                "Tânia",
                "tania@email.com.br",
                "987654321-12",
                LocalDateTime.parse("17/12/1984 08:30", formato)
        );
    }
}
