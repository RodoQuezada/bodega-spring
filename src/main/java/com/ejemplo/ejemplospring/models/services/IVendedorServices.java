package com.ejemplo.ejemplospring.models.services;

import com.ejemplo.ejemplospring.models.entitys.Vendedor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IVendedorServices {
    List<Vendedor> getAll();

    Vendedor save(Vendedor vendedor);

}
