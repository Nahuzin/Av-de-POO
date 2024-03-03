package com.universidade.gerenciamento.Entidades;
import com.universidade.gerenciamento.Configuracao.Endereco;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alunos")
public class Aluno{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RA", unique = true)
    private Long RA;

    @Column(name = "PrimeiroNome")
    private String primiroNome;

    @Column(name = "SegundoNome")
    private String sobreNome;

    @Column(name = "Email", unique = true)
    private String email;

    @Column(name = "Telefone", unique  = true)
    private String telefone;

    @OneToOne(cascade =  CascadeType.ALL)
    private Endereco endereco;

    public Aluno(String primiroNome, String sobreNome, String email, String telefone,Endereco endereco) {
        this.primiroNome = primiroNome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getPrimiroNome() {
        return primiroNome;
    }

    public void setPrimiroNome(String primiroNome) {
        this.primiroNome = primiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getRA() {
        return RA;
    }
}
