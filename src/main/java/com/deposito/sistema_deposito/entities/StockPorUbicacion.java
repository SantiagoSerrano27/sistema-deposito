package com.deposito.sistema_deposito.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stock_por_ubicaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockPorUbicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="lote_id", nullable = false)
    private Lote lote;

    @ManyToOne
    @JoinColumn(name="ubicacion_id", nullable = false)
    private Ubicacion ubicacion;

    @Column(nullable = false)
    private int cantidad;

}
