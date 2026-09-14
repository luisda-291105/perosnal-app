package com.luisda.personalapp.springboot.personal_app.Modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class mUsuario {
    @Id
    @Column(length = 15, nullable = false)
    private String idContabilidad;
    @Column(length = 50, nullable = false)
    private  String nombre;
    @Column(length = 255, nullable = false)
    private  String correo;
    @Column(length = 15, nullable = false)
    private  String contrasena;
    @Column(length = 255, nullable = false)
    private  String direccion;
    @Column(nullable = false)
    private LocalDate fechaCreacion;

    public mUsuario(String idContabilidad, String nombre, String correo, String contrasena, String direccion, LocalDate fechaCreacion) {
        this.idContabilidad = idContabilidad;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
    }

    public mUsuario() {
    }

    public String getIdContabilidad() {
        return idContabilidad;
    }

    public void setIdContabilidad(String idContabilidad) {
        this.idContabilidad = idContabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
