package com.example.proyecto3.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto3.Modelo.Empresa;
import com.example.proyecto3.Repositorios.EmpresaRepositorio;

@RestController
@RequestMapping("/empresa")
public class EmpresaControlador {

    @Autowired
    private EmpresaRepositorio repositorioEmpresa;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Empresa> listar() {
        return repositorioEmpresa.findAll();

    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Empresa obtenerId(@PathVariable Long id) {
        return repositorioEmpresa.findById(id).get();

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Empresa agregaEmpresa(@RequestBody Empresa empresa) {
        return repositorioEmpresa.save(empresa);
    }

    @RequestMapping(value = "/modify", method = RequestMethod.PATCH)
    public Empresa patch(@RequestBody Empresa empresa, @PathVariable Long id) {
        return repositorioEmpresa.save(empresa);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void eliminarEmpresa(@PathVariable Long id) {
       repositorioEmpresa.deleteById(id);

    }
    

}
