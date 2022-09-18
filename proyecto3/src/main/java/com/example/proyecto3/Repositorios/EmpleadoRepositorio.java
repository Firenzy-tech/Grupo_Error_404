package com.example.proyecto3.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto3.Modelo.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository <Empleado, Long> {

   
    
}
