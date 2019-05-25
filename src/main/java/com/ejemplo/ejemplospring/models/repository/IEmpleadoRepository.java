package com.ejemplo.ejemplospring.models.repository;

import com.ejemplo.ejemplospring.models.entitys.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Empleado,Integer> {
}
