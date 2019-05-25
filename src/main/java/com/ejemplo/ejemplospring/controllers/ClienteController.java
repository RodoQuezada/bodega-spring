package com.ejemplo.ejemplospring.controllers;


import com.ejemplo.ejemplospring.models.entitys.Cliente;
import com.ejemplo.ejemplospring.models.services.IClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ejemplo.ejemplospring.models.services.IClienteServices;

import java.util.List;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private IClienteServices clienteServices;

    @GetMapping
    public List<Cliente> getAll(){
       return clienteServices.getAll();
    }

    @PostMapping
    public Cliente save(@RequestBody @Valid Cliente cliente){
        System.out.println("--- controllador" + cliente);

        return clienteServices.save(cliente);
    }
}
