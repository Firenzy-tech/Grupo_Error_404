package com.example.proyecto3.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyecto3.modelo.Transaccion;
import com.example.proyecto3.servicios.transaccionServicios;

@RestController
@RequestMapping("/transacciones")
public class transaccionControlador {
    
    @Autowired
	private transaccionServicios transServicios;

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
