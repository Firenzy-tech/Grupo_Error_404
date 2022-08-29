package com.example.proyecto3.Modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Transaccion")

public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "concept", length = 100)
    private String concept;

    @Column(name = "amount", length = 300)
    private float amount;

    @OneToMany
    @JoinColumn(name = "users", referencedColumnName = "id")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "IdEnterprice", referencedColumnName = "id")
    private Empresa enterprice;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    public Transaccion(long id, String concept, float amount, Empleado empleado, Empresa enterprice, Date createdAt,
            Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.empleado = empleado;
        this.enterprice = enterprice;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return this.concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEnterprice() {
        return this.enterprice;
    }

    public void setEnterprice(Empresa enterprice) {
        this.enterprice = enterprice;
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

}
