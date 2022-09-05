package com.example.proyecto3.Modelo;



import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "empleado")

@PrimaryKeyJoinColumn(referencedColumnName = "nombre")
public class Empleado extends Profile {

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "role", length = 50)
    private Enum_roleName role;

    @Column(name = "enterprice", length = 50)
    private Empresa enterprice;

    @ManyToOne
    @JoinColumn(name = "IdTransactions", columnDefinition = "id")
    private Transaccion transactions;



    public Empleado(Long id, String documento, String telefono, String movil, String direccion, String correo,
            Date createdAt, Date updateAt, Empresa enterprice, String nombre, Enum_roleName role, Empresa enterprice2,
            Transaccion transactions) {
        super(id, documento, telefono, movil, direccion, correo, createdAt, updateAt, enterprice);
        this.nombre = nombre;
        this.role = role;
        enterprice = enterprice2;
        this.transactions = transactions;
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

    public Empresa getEnterprice() {
        return this.enterprice;
    }

    public void setEnterprice(Empresa enterprice) {
        this.enterprice = enterprice;
    }

    public Transaccion getTransactions() {
        return this.transactions;
    }

    public void setTransactions(Transaccion transactions) {
        this.transactions = transactions;
    }
 
   
}
