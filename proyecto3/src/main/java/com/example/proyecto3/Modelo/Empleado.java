package com.example.proyecto3.Modelo;

import java.util.*;

import javax.persistence.*;

import com.example.proyecto3.Enum.Enum_roleName;


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
    
    @Enumerated(EnumType.STRING)
    private Enum_roleName rol;

    @OneToOne
    private Perfil perfil;
	
    private Date updateAt;
	private Date createdAt;
    
    public Empleado(){}

    public Empleado(Long id, String email, Empresa empresa,
            List<Transaccion> transaccion, Enum_roleName rol, Perfil perfil, Date updateAt, Date createdAt) {
      
        this.email = email;
        this.empresa = empresa;
        this.rol = rol;
        this.perfil = perfil;
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

    public Enum_roleName getRol() {
        return rol;
    }

    public void setRol(Enum_roleName rol) {
        this.rol = rol;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

   
    
}