package com.example.proyecto3.Modelo;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "Transaccion")


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
        this.empleado = empleado;
        this.empresa = empresa;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

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
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    
}
