package com.example.proyecto3.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "empresa")
public class Empresa {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(unique=true)
    private String nombre;

    @Column(unique=true)
    private String identificacion;

    private String telefono;
    private String correo;
    
    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleado;

    @OneToMany(mappedBy = "empresa")
    private List<Transaccion> transaccion;
	
	private Date updateAt;
	private Date createdAt;

    public Empresa(){}

    
    public Empresa(String nombre, String identificacion, String telefono, String correo, List<Empleado> empleado,
            List<Transaccion> transaccion, Date updateAt, Date createdAt) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.empleado = empleado;
        this.transaccion = transaccion;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }


    public List<Empleado> getEmpleado() {
        return empleado;
    }


    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }


    public List<Transaccion> getTransaccion() {
        return transaccion;
    }


    public void setTransaccion(List<Transaccion> transaccion) {
        this.transaccion = transaccion;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
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