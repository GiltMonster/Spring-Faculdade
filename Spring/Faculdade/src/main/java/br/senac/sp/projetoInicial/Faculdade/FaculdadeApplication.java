package br.senac.sp.projetoInicial.Faculdade;

import br.senac.sp.projetoInicial.Faculdade.entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class FaculdadeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FaculdadeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
	}
}