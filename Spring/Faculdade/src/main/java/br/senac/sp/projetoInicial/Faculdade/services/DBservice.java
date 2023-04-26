package br.senac.sp.projetoInicial.Faculdade.services;

import br.senac.sp.projetoInicial.Faculdade.entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBservice {
    @Autowired
    private AlunoRepository alunoRepository;

    @Bean
    public void instanciarDB() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Aluno aluno1 = new Aluno("Lucas Campos",
                formato.parse("01/08/2022"), true);
        Aluno aluno2 = new Aluno("Carol",
                formato.parse("01/03/1991"), false);
        Aluno aluno3 = new Aluno("Rodrigo",
                formato.parse("01/03/1991"), true);
        Aluno aluno4 = new Aluno("Barbara",
                formato.parse("01/03/1991"), true);
        Aluno aluno5 = new Aluno("Eddie",
                formato.parse("01/03/1991"), true);
        Aluno aluno6 = new Aluno("Gustavo",
                formato.parse("01/03/1991"), false);
        Aluno aluno7 = new Aluno("Lucas Frois",
                formato.parse("01/03/1991"), true);
        Aluno aluno8 = new Aluno("Sergio",
                formato.parse("01/03/1991"), false);
        Aluno aluno9 = new Aluno("Erike",
                formato.parse("01/03/1991"), true);
        Aluno aluno10 = new Aluno("Yuri",
                formato.parse("01/03/1991"), false);
        Aluno aluno11 = new Aluno("Vitor",
                formato.parse("01/03/1991"), false);
        Aluno aluno12 = new Aluno("Lucas 03",
                formato.parse("01/03/1991"), false);

        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6,  aluno7, aluno8, aluno9, aluno10 , aluno11 , aluno12));
    }
}
