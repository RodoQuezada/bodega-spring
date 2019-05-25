package com.ejemplo.ejemplospring.models.services.impl;


import com.ejemplo.ejemplospring.models.entitys.Vendedor;
import com.ejemplo.ejemplospring.models.repository.IVendedorRepository;
import com.ejemplo.ejemplospring.models.services.IVendedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendedorServiceImpl implements IVendedorServices{

    @Autowired
    private IVendedorRepository repository;

    @Override
    public Vendedor save(Vendedor vendedor) {
        return repository.save(vendedor);
    }

    @Override
    public List<Vendedor> getAll() {
        return (List<Vendedor>)repository.findAll();
    }


}
