package com.deposito.sistema_deposito.repositories;

import com.deposito.sistema_deposito.entities.StockPorUbicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPorUbicacionRepository extends JpaRepository<StockPorUbicacion, Long> {
}
