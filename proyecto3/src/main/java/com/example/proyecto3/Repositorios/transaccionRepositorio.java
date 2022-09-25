package com.example.proyecto3.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto3.Modelo.Transaccion;

public interface TransaccionRepositorio extends JpaRepository<Transaccion, Long>{
    
}
