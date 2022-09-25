package com.example.proyecto3.ServiciosFront;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto3.Modelo.Usuarios;
import com.example.proyecto3.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicioFront {

    @Autowired
    private UsuarioRepositorio repositorio;

    public UsuarioServicioFront(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Usuarios crearUsuario(Usuarios nuevoUsuario) {
        return this.repositorio.save(nuevoUsuario);
    }

    public Usuarios buscaUsuarios(String email) {
        return this.repositorio.findByEmail(email);
    }

    public Usuarios getUsuario(Map<String, Object> userData) {

        String email = (String) userData.get("email");
        Usuarios usuario = buscaUsuarios(email);

        if (usuario == null) {
            String image = (String) userData.get("picture");
            String auth0Id = (String) userData.get("sub");
            String name = (String) userData.get("nickname");

            Usuarios nuevoUsuario = new Usuarios(email, image, auth0Id, name);
            return crearUsuario(nuevoUsuario);
        }
        
        return usuario;

    }

}
