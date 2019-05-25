package com.ejemplo.ejemplospring.controllers;

import com.ejemplo.ejemplospring.models.entitys.Producto;
import com.ejemplo.ejemplospring.models.entitys.Venta;
import com.ejemplo.ejemplospring.models.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private IProductoServices productoServices;

    @GetMapping
    public List<Producto> getAll(){
        return productoServices.getAll();
    }


    @GetMapping("/load")  // creo esta clase para cargar datos de prueba
    public List<Producto> load(){

        Venta venta = new Venta();
        venta.setCliente(null);
        venta.setVendedor(null);
        venta.setFechaEmision(new Date());
        venta.setNumVenta(1);

        Producto pro = new Producto();
        pro.setId(1);
        pro.setPrecio(100);
        pro.setDescripcion("blabla");
      //  pro.getVentaList().add(venta);

        pro.setVentaList(Collections.singletonList(venta));
        productoServices.save(pro);

        return productoServices.getAll();
    }


    @PostMapping
    public Producto save(@RequestBody @Valid Producto producto){
        System.out.println("--- controllador" + producto);
        return productoServices.save(producto);
    }

}
