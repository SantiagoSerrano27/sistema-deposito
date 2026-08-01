package com.deposito.sistema_deposito.repositories;

import com.deposito.sistema_deposito.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {



}
