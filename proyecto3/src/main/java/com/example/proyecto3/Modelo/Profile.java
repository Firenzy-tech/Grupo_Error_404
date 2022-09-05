package com.example.proyecto3.Modelo;

import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name = "Profile")
@Inheritance (strategy = InheritanceType.JOINED) //anotacion para hacerla padre
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "documento", length = 50)
    private String documento;

    @Column(name = "telefono", nullable = true, length = 20)
    private String telefono;

    @Column(name = "movil", nullable = true, length = 20)
    private String movil;

    @Column(name = "direccion", nullable = true, length = 100)
    private String direccion;

    @Column(name = "correo", nullable = true, length = 100)
    private String correo;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    @Column(name = "enterprice", length = 50)
    private Empresa enterprice;

    public Profile(Long id, String documento, String telefono, String movil, String direccion, String correo, Date createdAt, Date updateAt, Empresa enterprice) {
        this.id = id;
        this.documento = documento;
        this.telefono = telefono;
        this.movil = movil;
        this.direccion = direccion;
        this.correo = correo;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.enterprice = enterprice;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return this.movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Empresa getEnterprice() {
        return this.enterprice;
    }

    public void setEnterprice(Empresa enterprice) {
        this.enterprice = enterprice;
    }



}
