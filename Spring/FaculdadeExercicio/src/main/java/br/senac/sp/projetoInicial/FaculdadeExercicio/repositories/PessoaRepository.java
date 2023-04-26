package br.senac.sp.projetoInicial.FaculdadeExercicio.repositories;

import br.senac.sp.projetoInicial.FaculdadeExercicio.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}