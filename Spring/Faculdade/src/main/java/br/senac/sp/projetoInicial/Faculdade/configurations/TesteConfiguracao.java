package br.senac.sp.projetoInicial.Faculdade.configurations;

import br.senac.sp.projetoInicial.Faculdade.services.DBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("teste")
public class TesteConfiguracao {
    @Autowired
    DBservice dbService;

    private boolean instanciar() throws ParseException{
        this.dbService.instanciarDB();
        return true;
    }
}
