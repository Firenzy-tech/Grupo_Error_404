package com.example.proyecto3.Modelo;


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




}
