package com.universidade.gerenciamento.Configuracao;

import com.universidade.gerenciamento.Entidades.Aluno;
import com.universidade.gerenciamento.Entidades.Professor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name  = "Numero")
    private String numero;

    @Column(name = "Rua")
    private String rua;

    @Column(name = "Bairro")
    private String bairro;

    @Column(name = "Cidade")
    private String cidade;

    @OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL)
    private Aluno aluno;

    @OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL)
    private Professor professor;
}
