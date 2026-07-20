/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalbd;

import java.sql.Timestamp;

/**
 *
 * @author nemia
 */
public class Receta {
    private int idReceta;
    private int idConsulta;

    private String medicamento;
    private String dosis;
    private String frecuencia;
    private String duracion;
    private String indicaciones;

    private Timestamp fechaEmision;


    public Receta()
    {
    }


    public Receta(int idReceta, int idConsulta,
                  String medicamento, String dosis,
                  String frecuencia, String duracion,
                  String indicaciones, Timestamp fechaEmision)
    {
        this.idReceta = idReceta;
        this.idConsulta = idConsulta;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
        this.indicaciones = indicaciones;
        this.fechaEmision = fechaEmision;
    }


    public int getIdReceta()
    {
        return idReceta;
    }

    public void setIdReceta(int idReceta)
    {
        this.idReceta = idReceta;
    }


    public int getIdConsulta()
    {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta)
    {
        this.idConsulta = idConsulta;
    }


    public String getMedicamento()
    {
        return medicamento;
    }

    public void setMedicamento(String medicamento)
    {
        this.medicamento = medicamento;
    }


    public String getDosis()
    {
        return dosis;
    }

    public void setDosis(String dosis)
    {
        this.dosis = dosis;
    }


    public String getFrecuencia()
    {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia)
    {
        this.frecuencia = frecuencia;
    }


    public String getDuracion()
    {
        return duracion;
    }

    public void setDuracion(String duracion)
    {
        this.duracion = duracion;
    }


    public String getIndicaciones()
    {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones)
    {
        this.indicaciones = indicaciones;
    }


    public Timestamp getFechaEmision()
    {
        return fechaEmision;
    }

    public void setFechaEmision(Timestamp fechaEmision)
    {
        this.fechaEmision = fechaEmision;
    }
}
