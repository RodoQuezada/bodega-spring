package com.ejemplo.ejemplospring.models.services;

import com.ejemplo.ejemplospring.models.entitys.Producto;

import java.util.List;

public interface IProductoServices {

    List<Producto> getAll();

    Producto save(Producto producto);


}
