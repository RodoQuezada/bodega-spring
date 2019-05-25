package com.ejemplo.ejemplospring.models.repository;

import com.ejemplo.ejemplospring.models.entitys.Venta;
import org.springframework.data.repository.CrudRepository;

public interface IVentaRepository extends CrudRepository<Venta,Integer> {
}
