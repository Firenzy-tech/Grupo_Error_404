package com.example.proyecto3.Modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "empresa")

public class Empresa {

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

    @OneToMany
    @JoinColumn(name = "IdUsers", referencedColumnName = "id")
    private Empleado empleado;

    @Column(name = "transactions")
    private List<Transaccion> transactions;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    public Empresa() {

    }

    public Empresa(Long id, String name, String document, String phone, String address, Empleado empleado,
            List<Transaccion> transactions, Date createdAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.empleado = empleado;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Transaccion> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(List<Transaccion> transactions) {
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
