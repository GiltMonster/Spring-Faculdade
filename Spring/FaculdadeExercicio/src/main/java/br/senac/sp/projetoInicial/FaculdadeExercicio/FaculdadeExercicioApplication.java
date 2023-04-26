package br.senac.sp.projetoInicial.FaculdadeExercicio;

import br.senac.sp.projetoInicial.FaculdadeExercicio.entities.Pessoa;
import br.senac.sp.projetoInicial.FaculdadeExercicio.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class FaculdadeExercicioApplication implements CommandLineRunner {
	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(FaculdadeExercicioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Pessoa pessoa1 = new Pessoa("Rodrigo", "rodrigo@senac.com.br", "123456789-12", LocalDateTime.parse("25/04/1984 08:30", formato));
		Pessoa pessoa2 = new Pessoa("Tânia", "tania@senac.com.br", "987654321-98", LocalDateTime.parse("17/12/1984 08:30", formato));
		pessoaRepository.saveAll(Arrays.asList(pessoa1, pessoa2));
	}
}
