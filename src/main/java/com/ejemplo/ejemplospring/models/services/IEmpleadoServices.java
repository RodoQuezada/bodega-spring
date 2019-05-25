package com.ejemplo.ejemplospring.models.services;

import com.ejemplo.ejemplospring.models.entitys.Empleado;

import java.util.List;

public interface IEmpleadoServices {
    List<Empleado> getAll();

    Empleado save(Empleado empleado);
}
