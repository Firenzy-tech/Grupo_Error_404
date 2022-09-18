package com.example.proyecto3.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto3.Modelo.Transaccion;

@Repository
public interface TransaccionRepositorio extends JpaRepository<Transaccion, Long>{
    
}
