package com.example.proyecto3.controlador;


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

import com.example.proyecto3.modelo.Empleado;
import com.example.proyecto3.servicios.empleadoServicios;

@RestController
@RequestMapping ("/empleados")
public class empleadoControlador {
    
    @Autowired
	private empleadoServicios empleaServicios;

	@PostMapping
	private Empleado guardar(@RequestBody Empleado empleado){
		return this.empleaServicios.create(empleado);

	}

	@GetMapping("/empleados")
	public List<Empleado> listarTodosLosEmpleados (){
		return this.empleaServicios.getAllEmpleados();
	}

	@DeleteMapping
	public void eliminarTransaccion(@RequestBody Empleado empleado) {
		empleaServicios.delete(empleado);
		
	}

	@GetMapping(value = "{id}")
	public Optional<Empleado> listaPorId (@PathVariable ("id") Long id){
		return this.empleaServicios.porId(id);
	}

	public empleadoServicios getEmpleaServicios() {
		return empleaServicios;
	}

	public void setEmpleaServicios(empleadoServicios empleaServicios) {
		this.empleaServicios = empleaServicios;
	}

	
}
