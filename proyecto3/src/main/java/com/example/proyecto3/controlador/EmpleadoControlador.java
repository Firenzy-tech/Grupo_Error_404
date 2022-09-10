package com.example.proyecto3.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto3.repositorio.EmpleadoRepositorio;
import com.example.proyecto3.Modelo.*;

@RestController
@RequestMapping("/empleado")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Empleado> listar() {

        return repositorio.findAll();
    }

}
