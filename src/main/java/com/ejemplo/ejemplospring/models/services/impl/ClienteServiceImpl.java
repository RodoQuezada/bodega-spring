package com.ejemplo.ejemplospring.models.services.impl;

import com.ejemplo.ejemplospring.models.entitys.Cliente;
import com.ejemplo.ejemplospring.models.repository.IClienteRepository;
import com.ejemplo.ejemplospring.models.services.IClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteServices {

    @Autowired
    private IClienteRepository repository;

    @Override
    public List<Cliente> getAll() {
        return (List<Cliente>) repository.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        System.out.println("--- servicio" + cliente);
        return repository.save(cliente);
    }
}
