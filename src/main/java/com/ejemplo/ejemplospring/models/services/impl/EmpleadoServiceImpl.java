package com.ejemplo.ejemplospring.models.services.impl;

import com.ejemplo.ejemplospring.models.entitys.Empleado;
import com.ejemplo.ejemplospring.models.repository.IEmpleadoRepository;
import com.ejemplo.ejemplospring.models.services.IEmpleadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoServices {

    @Autowired
    private IEmpleadoRepository repository;

    @Override
    public List<Empleado> getAll() {
        return (List<Empleado>) repository.findAll();
    }

    @Override
    public Empleado save(Empleado empleado) {
        System.out.println("--- servicio"+empleado);
        return repository.save(empleado);
    }
}
