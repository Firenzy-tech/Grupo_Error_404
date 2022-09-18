package com.example.proyecto3.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto3.Modelo.Empresa;
import com.example.proyecto3.Repositorios.EmpresaRepositorio;

@Service
public class EmpresaServicios {
    @Autowired
    private EmpresaRepositorio empreRepositorio;

	public Empresa create(Empresa empresa){
		return empreRepositorio.save(empresa);
	}

	public List<Empresa> getAllEmpresa (){
		return empreRepositorio.findAll();
	}

	public void delete(Empresa empresa){
		empreRepositorio.delete(empresa);
	}

	public Optional<Empresa> porId(Long id){
		return empreRepositorio.findById(id);

	}

}
