package com.example.proyecto3.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto3.Modelo.Empleado;


public interface EmpleadoRepositorio extends JpaRepository <Empleado, Long> {

   
    
}
