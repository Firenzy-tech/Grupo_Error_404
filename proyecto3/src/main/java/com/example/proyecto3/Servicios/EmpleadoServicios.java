package com.example.proyecto3.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto3.Modelo.Empleado;
import com.example.proyecto3.Repositorios.EmpleadoRepositorio;


@Service
public class EmpleadoServicios {
    @Autowired
    private EmpleadoRepositorio empleaRepositorio;

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
