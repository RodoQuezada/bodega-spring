package com.ejemplo.ejemplospring.models.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "vendedores")
public class Vendedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVendedor;
    private String nombre;
    private String cargo;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "vendedor",fetch = FetchType.LAZY)
    private List<Venta> ventaList;
}
