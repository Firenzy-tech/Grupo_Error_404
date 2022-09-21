package com.example.proyecto3.ControladoresFront;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ControladorFront {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/entidad")
    public String entidad(){
        return "entidad";
    }

}
