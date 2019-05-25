package com.ejemplo.ejemplospring.models.repository;

import com.ejemplo.ejemplospring.models.entitys.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoRepository extends CrudRepository<Producto, Integer> {
}
