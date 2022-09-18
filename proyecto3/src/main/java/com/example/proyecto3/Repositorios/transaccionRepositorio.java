package com.example.proyecto3.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto3.Modelo.Transaccion;

@Repository
public interface transaccionRepositorio extends JpaRepository<Transaccion, Long>{
    
}
