package com.example.proyecto3.Modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "transaccion")

public class Transaccion{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private float amount;

    @Column(name = "user")
    private User user;

    @Column(name = "enterprise")
    private Enterprise enterprise;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

   
    
}
