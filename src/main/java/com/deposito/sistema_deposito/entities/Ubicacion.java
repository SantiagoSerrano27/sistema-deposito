package com.deposito.sistema_deposito.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ubicaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,  unique = true)
    private String codigoPosicional;
    private String zona; //opcional: poco uso tmb, pero seria mas q nada para depositos grandes (zona caliente, templada, fria)

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoUbicacion estado;

}
