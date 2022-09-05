package com.example.proyecto3.Modelo;

import javax.persistence.PrimaryKeyJoinColumn;

import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name = "Usuario")

@PrimaryKeyJoinColumn(referencedColumnName = "nombre")
public class Usuario extends Profile{

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "role", length = 50)
    private Enum_roleName role;

    @OneToMany
    @JoinColumn(name = "UsuarioTran", referencedColumnName = "id")
    private Transaccion transaccion;

    public Usuario(Long id, String documento, String telefono, String movil, String direccion, String correo,
            Date createdAt, Date updateAt, Empresa enterprice, String nombre, Enum_roleName role,
            Transaccion transaccion) {
        super(id, documento, telefono, movil, direccion, correo, createdAt, updateAt, enterprice);
        this.nombre = nombre;
        this.role = role;
        this.transaccion = transaccion;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum_roleName getRole() {
        return this.role;
    }

    public void setRole(Enum_roleName role) {
        this.role = role;
    }

    public Transaccion getTransaccion() {
        return this.transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

  



    
}
