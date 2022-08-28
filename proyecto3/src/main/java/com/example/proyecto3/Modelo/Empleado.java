package com.example.proyecto3.Modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/* 
id tipo long @id 
email tipo string @unique
profile tipo profile
role tipo Enum_RoleName
enterprice tipo Enterprice
transactions tipo transaction[]
updateAt tipo Date
createdAt tipo Date
*/

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
    private List<Transaccion> transactions;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updateAt;

    
}
