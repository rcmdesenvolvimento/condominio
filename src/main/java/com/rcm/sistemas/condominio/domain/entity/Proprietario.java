package com.rcm.sistemas.condominio.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Nome", nullable = false, columnDefinition = "VARCHAR(50)")
    private String nome;

    @Column(name = "SobreNome", nullable = false, columnDefinition = "VARCHAR(70)")
    private String sobreNome;

    @Column(name = "Cpf", nullable = false, columnDefinition = "VARCHAR(12)")
    private String cpf;

    @Column(name = "Identidade", nullable = false, columnDefinition = "VARCHAR(12)")
    private String identidade;

    @Column(name = "Titulo_Eleitor", nullable = false, columnDefinition = "VARCHAR(10)")
    private String titEleitor;

}
