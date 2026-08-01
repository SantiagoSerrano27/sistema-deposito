package com.deposito.sistema_deposito.repositories;

import com.deposito.sistema_deposito.entities.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteRepository extends JpaRepository<Lote, Long> {
}
