package com.example.proyecto3.Modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "empleado")

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @Column(name = "profile", length = 50)
    private Profile profile;

    @Column(name = "role", length = 50)
    private Enum_roleName role;

    @Column(name = "enterprice", length = 50)
    private Empresa enterprice;

    @Column(name = "transactions")
    private Transaccion transactions;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;


    public Empleado(Long id, String email, Profile profile, Enum_roleName role, Empresa enterprice, Transaccion transactions, Date createdAt, Date updateAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprice = enterprice;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
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
