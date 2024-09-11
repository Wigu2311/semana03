package com.example.semana03.service;

import com.example.semana03.repository.Productosrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productosservice {
    @Autowired
    private Productosrepository repository;

    public Productos saveProductos(Productos productos){

       return repository.save(Productos);
    }

    public List<Productos> saveProductos1(List<Productos> productos1){

        return repository.saveAll(productos1);
    }

    public List<Productos> getProductos1(){

        return repository.findAll();
    }

    public List<Productos> getProductosById(int id_producto){

        return repository.findById(id_producto).orElse(null);
    }





}
