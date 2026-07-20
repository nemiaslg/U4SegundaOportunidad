/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalbd;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author nemia
 */
public class Paciente {
     private int idPaciente;
    private String nombre;
    private String app;
    private String apm;
    private String genero;
    private Date fechaNacimiento;
    private int edad;
    private double peso;
    private Timestamp fechaRegistro;
    private boolean activo;
    private Timestamp fechaSalida;

    public Paciente()
    {
    }

    public Paciente(int idPaciente, String nombre, String app,
                    String apm, String genero, Date fechaNacimiento,
                    int edad, double peso, Timestamp fechaRegistro,
                    boolean activo, Timestamp fechaSalida)
    {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.peso = peso;
        this.fechaRegistro = fechaRegistro;
        this.activo = activo;
        this.fechaSalida = fechaSalida;
    }

    public int getIdPaciente()
    {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente)
    {
        this.idPaciente = idPaciente;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApp()
    {
        return app;
    }

    public void setApp(String app)
    {
        this.app = app;
    }

    public String getApm()
    {
        return apm;
    }

    public void setApm(String apm)
    {
        this.apm = apm;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public Date getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public Timestamp getFechaRegistro()
    {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro)
    {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActivo()
    {
        return activo;
    }

    public void setActivo(boolean activo)
    {
        this.activo = activo;
    }

    public Timestamp getFechaSalida()
    {
        return fechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida)
    {
        this.fechaSalida = fechaSalida;
    }
}
