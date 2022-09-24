package com.example.proyecto3.Controlador;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto3.Servicios.EmpleadoServicios;
import com.example.proyecto3.Modelo.Empleado;

@RestController
@RequestMapping ("/usuarios")
public class EmpleadoControlador {
    
    @Autowired
	private EmpleadoServicios empleaServicios;

	@PostMapping
	private Empleado guardar(@RequestBody Empleado empleado){
		return this.empleaServicios.create(empleado);

	}

	@GetMapping (value = "/lista_usuarios")
	public List<Empleado> listarTodosLosEmpleados (){
		return this.empleaServicios.getAllEmpleados();
	}

	@DeleteMapping
	public void eliminarTransaccion(@RequestBody Empleado empleado) {
		empleaServicios.delete(empleado);
		
	}

	@GetMapping(value = "usuario/{id}")
	public Optional<Empleado> listaPorId (@PathVariable ("id") Long id){
		return this.empleaServicios.porId(id);
	}

	public EmpleadoServicios getEmpleaServicios() {
		return empleaServicios;
	}

	public void setEmpleaServicios(EmpleadoServicios empleaServicios) {
		this.empleaServicios = empleaServicios;
	}

	
}
