package com.deposito.sistema_deposito.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="lotes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "producto_id", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private LocalDate fechaIngreso;

    private String numeroLote;
    private LocalDate vencimento;
    private String numeroRemito;
    private String proveedor;
}
