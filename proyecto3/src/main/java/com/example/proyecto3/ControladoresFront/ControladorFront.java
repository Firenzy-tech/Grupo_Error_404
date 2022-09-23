package com.example.proyecto3.ControladoresFront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.proyecto3.Modelo.Empresa;
import com.example.proyecto3.ServiciosFront.EmpresaServicioFront;

@Controller
public class ControladorFront {

    @Autowired
    private EmpresaServicioFront servicioFront;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/entidad")
    public String entidades(Model model) {
        model.addAttribute("listaEmpresa", servicioFront.listaEmpresa());
        return "entidad";
    }

    @GetMapping("/entidad/agregar")
    public String agregar(Model model) {
        Empresa empresa = new Empresa();
        model.addAttribute("nuevaEmpresa", empresa);
        return "agregar";
    }
    @PostMapping("/entidad")
    public String guardarEmpresa(@ModelAttribute("nuevaEmpresa") Empresa empresa){
        servicioFront.guardaEmpresa(empresa);
        return "redirect:/entidad";

    }
    @GetMapping("/entidad/editar/{id}")
    public String mostarEmpresa(@PathVariable Long id, Model model){
        model.addAttribute("empresa", servicioFront.obtenerEmpresaId(id));
        return "editar";
    }
    @PostMapping("/entidad/editar/{id}")
    public String actualizarEmpresa(@PathVariable Long id, @ModelAttribute("empresa") Empresa empresa, Model model){
        Empresa empresaExistente = servicioFront.obtenerEmpresaId(id);
        empresaExistente.setId(id);
        empresaExistente.setName(empresa.getName());
        empresaExistente.setDocument(empresa.getDocument());
        empresaExistente.setPhone(empresa.getPhone());
        empresaExistente.setAddress(empresa.getAddress());

        servicioFront.actualizarEmpresa(empresaExistente);
        return "redirect:/entidad";
    }

    @GetMapping("/entidad/{id}")
    public String eliminarEmpresa(@PathVariable Long id){
        servicioFront.eliminarEmpresa(id);
        return "redirect:/entidad";

    }



}
