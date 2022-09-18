package com.example.proyecto3.Modelo;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name = "empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(unique=true)
    private String email;

    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Empresa empresa;
    

    @OneToMany(mappedBy = "empleado")
    private List<Transaccion> transaccion;
	
    private Date updateAt;
	private Date createdAt;
    
    public Empleado(){}

    public Empleado(Long id, String email, Empresa empresa,
            List<Transaccion> transaccion, Date updateAt, Date createdAt) {
      
        this.email = email;
        this.empresa = empresa;
        this.transaccion = transaccion;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Transaccion> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(List<Transaccion> transaccion) {
        this.transaccion = transaccion;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

   
    
}