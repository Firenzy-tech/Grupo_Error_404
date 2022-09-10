package com.example.proyecto3.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto3.modelo.Transaccion;
import com.example.proyecto3.repositorio.transaccionRepositorio;


@Service
public class transaccionServicios {

    @Autowired
    private transaccionRepositorio transRepositorio;

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
