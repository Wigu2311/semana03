package com.example.semana03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Productos_TBL")
public class Productos {

    @Id
    @GeneratedValue
    private int id_producto;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private String categoria;
    private Integer stock;
    private String proveedor;
    private LocalDate fecha_adquisicion;
    private BigDecimal descuento;
    private String imagen;
    private BigDecimal peso;
    private String dimensiones;
    private LocalDate fecha_expiracion;
    private String estado;
    private String codigo_barras;


}
