package com.ejemplo.ejemplospring.models.services.impl;

import com.ejemplo.ejemplospring.models.entitys.Venta;
import com.ejemplo.ejemplospring.models.repository.IVentaRepository;
import com.ejemplo.ejemplospring.models.services.IVentaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class VentaServiceImpl implements IVentaServices {

    @Autowired
    private IVentaRepository repository;

    @Override
    public List<Venta> getAll() {
        return (List<Venta>)repository.findAll();
    }

    @Override
    public Venta save(Venta venta) {
        System.out.println("--- servicio" + venta);
        return repository.save(venta);
    }

    @Override
    public Venta findById(int id) {
        System.out.println("--Venta Servicio findById. ");
        return repository.findById(Integer.valueOf(id).intValue()).orElseThrow(()-> new EntityNotFoundException());


    }
}
