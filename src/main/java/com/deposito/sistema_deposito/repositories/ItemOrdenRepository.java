package com.deposito.sistema_deposito.repositories;


import com.deposito.sistema_deposito.entities.ItemOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemOrdenRepository extends JpaRepository<ItemOrden, Long> {
}
