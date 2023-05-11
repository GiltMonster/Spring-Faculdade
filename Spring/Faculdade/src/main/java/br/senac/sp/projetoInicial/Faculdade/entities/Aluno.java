package br.senac.sp.projetoInicial.Faculdade.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity(name = "Alunos")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RA")
    int ra;

    @Column(name = "Nome")
    String nome;

    @Column
    Date dataCadastro;

    @Column (name = "Ativo")
    boolean ativo;

    public Aluno() {
    }

    public Aluno(String nome, Date dataCadastro, boolean ativo) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        String status;
        if(this.ativo==true)
            status = "Aluno Ativo";
        else
            status = "Aluno Inativo";
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", dataCadastro=" + dataCadastro +
                status +
                '}';
    }
}
