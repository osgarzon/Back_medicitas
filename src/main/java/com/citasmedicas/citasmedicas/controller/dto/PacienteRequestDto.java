package com.citasmedicas.citasmedicas.controller.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PacienteRequestDto {
    private Long id;

    private String nombre;
    private String apellido;
    private String cedula;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento; 
    private String telefono;
    private String Genero;
    private String EPS;
    
    public PacienteRequestDto(String nombre, String apellido, String cedula, LocalDate fechaNacimiento, String telefono, String Genero, String EPS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.Genero = Genero;
        this.EPS = EPS;
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
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    public String getEPS() {
        return EPS;
    }
    public void setEPS(String EPS) {
        this.EPS = EPS;
    }
}
