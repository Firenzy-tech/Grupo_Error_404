package com.example.proyecto3.ServiciosFront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.proyecto3.Modelo.Empresa;
import com.example.proyecto3.Repositorios.EmpresaRepositorio;

@Service
public class EmpresaServicioFront {

    @Autowired
    private EmpresaRepositorio repositorio;

    public List<Empresa> listaEmpresa(){
        return repositorio.findAll();
    }

    public Empresa guardaEmpresa(Empresa empresa){
        return repositorio.save(empresa);
    }

    public Empresa obtenerEmpresaId(Long id){
        return repositorio.findById(id).get();
    }
    public Empresa actualizarEmpresa(Empresa empresa){
        return repositorio.save(empresa);
    }
    public void eliminarEmpresa(Long id){
        repositorio.deleteById(id);
    }
    

}
