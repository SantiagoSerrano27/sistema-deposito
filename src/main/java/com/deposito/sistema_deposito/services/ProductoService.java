package com.deposito.sistema_deposito.services;

import com.deposito.sistema_deposito.entities.Producto;
import com.deposito.sistema_deposito.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;


    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }

    public Producto crearProducto(Producto producto){
        return productoRepository.save(producto);
    }

}
