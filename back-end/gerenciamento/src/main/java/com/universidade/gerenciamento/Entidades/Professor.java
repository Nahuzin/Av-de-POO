package com.universidade.gerenciamento.Entidades;


import com.universidade.gerenciamento.Configuracao.Endereco;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Professores")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Registro", unique = true)
    private Long registro;

    @Column(name = "PrimeiroNome" , length = 20)
    private String primeiroNome;

    @Column(name = "sobreNome", length = 20)
    private String sobreNome;

    @Column(name = "Formação")
    private String formacao;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Telefone", length = 10)
    private String telefone;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

   @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Professor(String primeiroNome, String sobreNome, String formacao, String email, String telefone,
        Endereco endereco) {
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;
        this.formacao = formacao;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
