package com.example.proyecto3.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto3.Modelo.Transaccion;
import com.example.proyecto3.Repositorios.TransaccionRepositorio;

@Service
public class TransaccionServicios {
    
    @Autowired
    private TransaccionRepositorio transRepositorio;

	public Transaccion create(Transaccion transaccion){
		return transRepositorio.save(transaccion);
	}

	public Transaccion update(Transaccion transaccion){
		return transRepositorio.save(transaccion);
	}

	public List<Transaccion> getAllTransacciones (){
		return transRepositorio.findAll();
	}

	public void delete(Transaccion transaccion){
		transRepositorio.delete(transaccion);
	}

	public Optional<Transaccion> porId(Long id){
		return transRepositorio.findById(id);

	}
}
