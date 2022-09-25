package com.example.proyecto3.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.proyecto3.Modelo.Usuarios;

@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuarios, Long>{
  public Usuarios findByEmail(String email);
}
