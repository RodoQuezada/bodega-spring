package com.ejemplo.ejemplospring.models.services;

import com.ejemplo.ejemplospring.models.entitys.Venta;

import java.util.List;

public interface IVentaServices {

    List<Venta> getAll();

    Venta save(Venta venta);

    Venta findById(int id);
}
