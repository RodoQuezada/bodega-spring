package com.ejemplo.ejemplospring.controllers;


import com.ejemplo.ejemplospring.models.entitys.Empleado;
import com.ejemplo.ejemplospring.models.services.IEmpleadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoServices empleadoServices;

    @GetMapping
    public List<Empleado> getAll(){
        return empleadoServices.getAll();
    }

    @PostMapping
    public Empleado save(@RequestBody @Valid Empleado empleado){
        System.out.println("---controllador"+empleado);
        return empleadoServices.save(empleado);
    }
}
