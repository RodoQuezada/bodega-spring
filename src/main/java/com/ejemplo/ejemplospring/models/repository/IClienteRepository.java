package com.ejemplo.ejemplospring.models.repository;

import org.springframework.data.repository.CrudRepository;
import com.ejemplo.ejemplospring.models.entitys.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Integer> {
}
