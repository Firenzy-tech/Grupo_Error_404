package com.example.proyecto3.Modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Servicios")

public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "IdMascota", referencedColumnName = "id")
    private Mascota mascota;

    @Column(name = "IdEmpleado", length = 50)
    private Empleado empleado;

    @Column(name = "ClaseServicio", length = 50)
    private Enum_Servicio claseServicio;

    @Column(name = "Precio")
    private float precio;

    @Column(name = "createdAt")
    private Date createdAt;


    public Servicios(Long id, Mascota mascota, Empleado empleado, Enum_Servicio claseServicio, float precio, Date createdAt) {
        this.id = id;
        this.mascota = mascota;
        this.empleado = empleado;
        this.claseServicio = claseServicio;
        this.precio = precio;
        this.createdAt = createdAt;
    }



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return this.mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Enum_Servicio getClaseServicio() {
        return this.claseServicio;
    }

    public void setClaseServicio(Enum_Servicio claseServicio) {
        this.claseServicio = claseServicio;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


}
