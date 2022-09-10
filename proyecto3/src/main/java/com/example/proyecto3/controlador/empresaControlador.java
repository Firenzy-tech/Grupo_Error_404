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

import com.example.proyecto3.modelo.Empresa;
import com.example.proyecto3.servicios.empresaServicios;

@RestController
@RequestMapping ("/empresas/")
public class empresaControlador {

    @Autowired
	private empresaServicios empreServicios;

	@PostMapping
	private Empresa guardar(@RequestBody Empresa empresa){
		return this.empreServicios.create(empresa);

	}

	@GetMapping("/empresas")
	public List<Empresa> listarTodosLasEmpresas (){
		return this.empreServicios.getAllEmpresa();
	}

	@DeleteMapping
	public void eliminarTransaccion(@RequestBody Empresa empresa) {
		empreServicios.delete(empresa);
		
	}

	@GetMapping(value = "{id}")
	public Optional<Empresa> listaPorId (@PathVariable ("id") Long id){
		return this.empreServicios.porId(id);
	}
    
}