package com.example.proyecto3.Modelo;

import javax.persistence.*;

@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @ManyToOne

    @Column(name = "Usuario", length = 50)
    private Usuario usuario;
    
    @Column(name = "nombre", length = 100, unique = true)
    private String nombre;

    @Column(name = "Tipo", length = 50)
    private Enum_TipoMascota tipo;

    @Column(name = "Tamano", length = 50)
    private Enum_Tamano tamano;


    public Mascota(long id, Usuario usuario, String nombre, Enum_TipoMascota tipo, Enum_Tamano tamano) {
        this.id = id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum_TipoMascota getTipo() {
        return this.tipo;
    }

    public void setTipo(Enum_TipoMascota tipo) {
        this.tipo = tipo;
    }

    public Enum_Tamano getTamano() {
        return this.tamano;
    }

    public void setTamano(Enum_Tamano tamano) {
        this.tamano = tamano;
    }



}
