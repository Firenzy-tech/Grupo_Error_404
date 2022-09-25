package com.example.proyecto3.Modelo;

import java.sql.Date;

import javax.persistence.*;



@Entity
@Table(name = "Transaccion")

public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
            Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.enterprice = enterprice;
        this.usuario = usuario;
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
