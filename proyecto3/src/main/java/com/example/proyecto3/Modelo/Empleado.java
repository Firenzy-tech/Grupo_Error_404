package com.example.proyecto3.Modelo;

import java.sql.Date;

import javax.persistence.*;



@Entity
@Table(name = "empleado")

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "id")
    private Empresa empresa;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    public Empleado(Long id, String email, Empresa enterprice, Date createdAt,
            Date updateAt) {
        this.id = id;
        this.email = email;
        this.empresa = enterprice;
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

    public Empresa getEnterprice() {
        return this.empresa;
    }

    public void setEnterprice(Empresa enterprice) {
        this.empresa = enterprice;
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
