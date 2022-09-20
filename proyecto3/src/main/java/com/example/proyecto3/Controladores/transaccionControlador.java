package com.example.proyecto3.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto3.Modelo.Transaccion;
import com.example.proyecto3.Servicios.TransaccionServicios;

@RestController
@RequestMapping("/transacciones")
public class TransaccionControlador{
    
    @Autowired
	private TransaccionServicios transServicios;

	@PostMapping
	private Transaccion guardar(@RequestBody Transaccion transaccion){
		return this.transServicios.create(transaccion);

	}

	@GetMapping("/Listas_transacciones")
	public List<Transaccion> listarTodosLasTransacciones (){
		return this.transServicios.getAllTransacciones();
	}

	@PutMapping
	private Transaccion actualizar(@RequestBody Transaccion transaccion){
		return this.transServicios.update(transaccion);

	}

	@DeleteMapping
	public void eliminarTransaccion(@RequestBody Transaccion transaccion) {
		transServicios.delete(transaccion);
		
	}

	@GetMapping(value = "/{id}")
	public Optional<Transaccion> listaPorId (@PathVariable ("id") Long id){
		return this.transServicios.porId(id);
	}

		

}