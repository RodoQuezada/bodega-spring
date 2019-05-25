package com.ejemplo.ejemplospring.controllers;

import com.ejemplo.ejemplospring.models.entitys.Vendedor;
import com.ejemplo.ejemplospring.models.services.IVendedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/vendedor")
public class VendedorController {

    @Autowired
    private IVendedorServices vendedorServices;

    @GetMapping
    public List<Vendedor> getAll(){

        return vendedorServices.getAll();
    }

    @PostMapping
    public Vendedor save(@RequestBody @Valid Vendedor vendedor){
        System.out.println("--- controllador" + vendedor);
        return vendedorServices.save(vendedor);
    }
}
