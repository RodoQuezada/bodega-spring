package com.ejemplo.ejemplospring.controllers;

import com.ejemplo.ejemplospring.models.entitys.Venta;
import com.ejemplo.ejemplospring.models.services.IVentaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/venta")
public class VentaController {

    @Autowired
    private IVentaServices ventaServices;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Venta> getAll(){
        System.out.println("--Venta Controlador getAll. ");
        return ventaServices.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Venta save(@RequestBody Venta venta){
        System.out.println("---controllador save:"+ venta);
     return ventaServices.save(venta);
    }

   /* @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.UPGRADE_REQUIRED)
    public Venta updateVenta(@PathVariable(value = "id")int id, @RequestBody @Valid Venta venta){
        System.out.println("--Habitacion Controlador updateHabitacion: " + venta.toString()+ "id: "+ id);
        Venta newVenta=ventaServices.findById(id);
        newVenta.setCliente(venta.getCliente());
        newVenta.setProducto(venta.getProducto());
        newVenta.setVendedor(venta.getVendedor());
        newVenta.setFechaEmision(venta.getFechaEmision());
        ventaServices.save(newVenta);
        return newVenta;
    }
*/
}
