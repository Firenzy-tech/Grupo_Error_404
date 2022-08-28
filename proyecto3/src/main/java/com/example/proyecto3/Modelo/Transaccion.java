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

    @Column(name = "name", length = 100, unique = true)
    private String name;

    @Column(name = "document", length = 20, unique = true)
    private String document;

    @Column(name = "phone", length = 30)
    private String phone;

    @Column(name = "address", length = 50)
    private String address;

    @Column(name = "users")
    private List<Empleado> user;

    @Column(name = "transactions")
    private List<Transaccion> transactions;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    public Transaccion(Long id, String name, String document, String phone, String address, List<Empleado> user,
            List<Transaccion> transactions, Date createdAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.user = user;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Empleado> getUser() {
        return user;
    }

    public void setUser(List<Empleado> user) {
        this.user = user;
    }

    public List<Transaccion> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaccion> transactions) {
        this.transactions = transactions;
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


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    


}