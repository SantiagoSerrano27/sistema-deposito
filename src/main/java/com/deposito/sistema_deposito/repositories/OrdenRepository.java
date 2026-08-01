package com.deposito.sistema_deposito.repositories;

import com.deposito.sistema_deposito.entities.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}
