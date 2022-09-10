package com.example.proyecto3.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto3.modelo.Empleado;
import com.example.proyecto3.repositorio.empleadoRepositorio;

@Service
public class empleadoServicios {

	@Autowired
    private empleadoRepositorio empleaRepositorio;

	public Empleado create(Empleado empleado){
		return empleaRepositorio.save(empleado);
	}

	public List<Empleado> getAllEmpleados (){
		return empleaRepositorio.findAll();
	}

	public void delete(Empleado empleado){
		empleaRepositorio.delete(empleado);
	}

	public Optional<Empleado> porId(Long id){
		return empleaRepositorio.findById(id);

	}

}
