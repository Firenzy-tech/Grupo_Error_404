package com.example.proyecto3.Modelo;


import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "transaccion")

public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private float amount;

    /*@Column(name = "user")
    private User user;

    @Column(name = "enterprise")
    private Enterprise enterprise;*/

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    public Transaccion(Long id, String concept, float amount) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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