package com.ejemplo.ejemplospring.models.services;

import com.ejemplo.ejemplospring.models.entitys.Cliente;
import java.util.List;
public interface IClienteServices {
    List<Cliente> getAll();

    Cliente save(Cliente cliente);
}
