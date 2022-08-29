package com.example.proyecto3.Modelo;

import java.sql.Date;
import java.util.List;

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

    @Column(name = "users")
    private List<Empleado> user;

    @Column(name = "enterprice", length = 50)
    private Empresa enterprice;
    
    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;


    public Transaccion(long id, String concept, float amount, List<Empleado> user, Empresa enterprice, Date createdAt, Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
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

    public List<Empleado> getUser() {
        return this.user;
    }

    public void setUser(List<Empleado> user) {
        this.user = user;
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
