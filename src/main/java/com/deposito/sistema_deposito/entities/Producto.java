package com.deposito.sistema_deposito.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false, unique = true)
    private String codigo;

    private String descripcion;

    @Column (nullable = false)
    private String nombre;

    private String zonaPreferida; // nose q tanto uso tendra, puede ser nula

    @Column (nullable = false)
    private boolean requiereLote;

}
