package com.deposito.sistema_deposito.repositories;

import com.deposito.sistema_deposito.entities.MovimientoStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoStockRepository extends JpaRepository<MovimientoStock, Long> {
}
