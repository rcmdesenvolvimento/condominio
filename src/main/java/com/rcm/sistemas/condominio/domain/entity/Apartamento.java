package com.rcm.sistemas.condominio.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Apartamento {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Bloco", nullable = false, columnDefinition = "VARCHAR(5)")
    private String bloco;

    @Column(name = "Andar", nullable = false, columnDefinition = "VARCHAR(5)")
    private String Andar;

    @Column(name = "Apartamento", nullable = false, columnDefinition = "VARCHAR(5)")
    private String Apartamento;

    @OneToMany(mappedBy = "apartamento")
    private List<Proprietario> proprietario = new ArrayList<>();
}
