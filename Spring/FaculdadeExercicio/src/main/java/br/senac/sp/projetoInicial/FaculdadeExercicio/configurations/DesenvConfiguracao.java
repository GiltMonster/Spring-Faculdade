package br.senac.sp.projetoInicial.FaculdadeExercicio.configurations;

import br.senac.sp.projetoInicial.FaculdadeExercicio.services.DBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("desenv")
public class DesenvConfiguracao {
    @Autowired
    DBservice dbService;

    private boolean instanciar() throws ParseException{
        this.dbService.instanciarDB();
        return true;
    }
}
