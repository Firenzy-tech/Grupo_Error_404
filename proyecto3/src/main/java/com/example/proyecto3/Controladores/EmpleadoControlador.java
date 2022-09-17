package com.example.proyecto3.Controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto3.Modelo.Empleado;
import com.example.proyecto3.Repositorios.EmpleadoRepositorio;

@RestController
@RequestMapping("/empleado")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorioEmpleado;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Empleado> listar() {

        return repositorioEmpleado.findAll();

    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Empleado obtenerId(@PathVariable long id) {

        return repositorioEmpleado.findById(id).get();

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Empleado agregaEmpleado(@RequestBody Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }


    @RequestMapping(value = "/modify", method = RequestMethod.PATCH)
    public Empleado patch(@RequestBody Empleado empleado, @PathVariable long id){
        return repositorioEmpleado.save(empleado);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void eliminarEmpresa(@PathVariable long id){
        repositorioEmpleado.deleteById(id);
    }


}
