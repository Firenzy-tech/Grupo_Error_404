package com.example.proyecto3.Modelo;


import java.sql.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
=======
import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name = "Transaccion")


public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_transaccion")
    @GenericGenerator(name = "secuencia_transaccion", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "concept", length = 100)
    private String concept;

    @Column(name = "amount", length = 300)
    private float amount;

    @ManyToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "id")
    private Empresa enterprice;

    @ManyToOne
    @JoinColumn(name = "idempleado", referencedColumnName = "id")
    private Empleado usuario;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    public Transaccion(long id, String concept, float amount, Empresa enterprice, Empleado usuario, Date createdAt,
=======

public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String concept;
    private float amount;

    @ManyToOne
    @JoinColumn(name="idEmpleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

    private Date createdAt;
    private Date updateAt;

    public Transaccion(){}

    public Transaccion(long id, String concept, float amount, Empleado empleado, Empresa empresa, Date createdAt,

            Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.enterprice = enterprice;
        this.usuario = usuario;
=======
        this.empleado = empleado;
        this.empresa = empresa;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {

        return this.id;
=======
        return id;

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {

        return this.concept;
=======
        return concept;

    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {

        return this.amount;
=======
        return amount;

    }

    public void setAmount(float amount) {
        this.amount = amount;
    }


    public Empresa getEnterprice() {
        return this.enterprice;
    }

    public void setEnterprice(Empresa enterprice) {
        this.enterprice = enterprice;
    }

    public Empleado getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public Date getCreatedAt() {
        return this.createdAt;
=======
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreatedAt() {
        return createdAt;

    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {

        return this.updateAt;
=======
        return updateAt;

    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }


=======
    

}
