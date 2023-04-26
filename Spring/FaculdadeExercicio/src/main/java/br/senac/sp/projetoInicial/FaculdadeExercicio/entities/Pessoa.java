package br.senac.sp.projetoInicial.FaculdadeExercicio.entities;

import jakarta.persistence.Entity;

import java.io.Serializable;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "Pessoas")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    Long id;

    @Column (name = "Nome")
    String nome;

    @Column (name = "Email")
    String email;

    @Column (name = "CPF")
    String cpf;

    @Column (name = "Data_de_nascimento")
    LocalDateTime dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String cpf, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
