package com.ejemplo.ejemplospring.models.repository;

import com.ejemplo.ejemplospring.models.entitys.Vendedor;
import org.springframework.data.repository.CrudRepository;

public interface IVendedorRepository extends CrudRepository<Vendedor,Integer> {
}
