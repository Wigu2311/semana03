package com.example.semana03.repository;

import com.example.semana03.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productosrepository extends JpaRepository<Productos, Integer> {
}
