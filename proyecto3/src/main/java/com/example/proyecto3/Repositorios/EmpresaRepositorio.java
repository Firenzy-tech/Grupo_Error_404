package com.example.proyecto3.Repositorios;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto3.Modelo.Empresa;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {
    
    /*@Modifying
    @Transactional
    @Query  */

}