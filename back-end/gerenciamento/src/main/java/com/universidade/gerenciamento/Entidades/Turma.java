package com.universidade.gerenciamento.Entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id;

    @Column(name = "Sala")
    private String Sala;

    @Column(name = "Disciplina")
    private String Disciplina;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Professor> professor = new ArrayList<>();

    public String getSala() {
        return Sala;
    }

    public void setSala(String sala) {
        Sala = sala;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    
}
