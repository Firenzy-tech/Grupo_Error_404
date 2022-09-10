package com.example.proyecto3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto3.modelo.Transaccion;

@Repository
public interface transaccionRepositorio extends JpaRepository<Transaccion, Long>{
    
}
