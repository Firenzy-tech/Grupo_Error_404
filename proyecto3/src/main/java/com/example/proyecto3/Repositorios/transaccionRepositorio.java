package com.example.proyecto3.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.proyecto3.Modelo.Transaccion;

@Service
public interface TransaccionRepositorio extends JpaRepository <Transaccion, Long>{
    
}