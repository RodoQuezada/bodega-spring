package com.ejemplo.ejemplospring.models.services.impl;

import com.ejemplo.ejemplospring.models.entitys.Producto;
import com.ejemplo.ejemplospring.models.repository.IProductoRepository;
import com.ejemplo.ejemplospring.models.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoServices {

    @Autowired
    private IProductoRepository repository;

    @Override
    public List<Producto> getAll() {
        return (List<Producto>) repository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        System.out.println("--- servicio" + producto);
        return repository.save(producto);
    }
}
