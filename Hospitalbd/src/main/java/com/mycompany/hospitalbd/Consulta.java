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
public class Consulta {
    private int idConsulta;
    private int idCita;

    private Timestamp fechaIngreso;
    private Timestamp fechaSalida;

    private String diagnostico;
    private String observacionesConsulta;
    private String observacionesSalida;

    private double temperatura;
    private String presionArterial;
    private String tratamiento;

    private String estadoConsulta;


    public Consulta()
    {
    }


    public Consulta(int idConsulta, int idCita,
                    Timestamp fechaIngreso, Timestamp fechaSalida,
                    String diagnostico, String observacionesConsulta,
                    String observacionesSalida, double temperatura,
                    String presionArterial, String tratamiento,
                    String estadoConsulta)
    {
        this.idConsulta = idConsulta;
        this.idCita = idCita;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.diagnostico = diagnostico;
        this.observacionesConsulta = observacionesConsulta;
        this.observacionesSalida = observacionesSalida;
        this.temperatura = temperatura;
        this.presionArterial = presionArterial;
        this.tratamiento = tratamiento;
        this.estadoConsulta = estadoConsulta;
    }


    public int getIdConsulta()
    {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta)
    {
        this.idConsulta = idConsulta;
    }


    public int getIdCita()
    {
        return idCita;
    }

    public void setIdCita(int idCita)
    {
        this.idCita = idCita;
    }


    public Timestamp getFechaIngreso()
    {
        return fechaIngreso;
    }

    public void setFechaIngreso(Timestamp fechaIngreso)
    {
        this.fechaIngreso = fechaIngreso;
    }


    public Timestamp getFechaSalida()
    {
        return fechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida)
    {
        this.fechaSalida = fechaSalida;
    }


    public String getDiagnostico()
    {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }


    public String getObservacionesConsulta()
    {
        return observacionesConsulta;
    }

    public void setObservacionesConsulta(String observacionesConsulta)
    {
        this.observacionesConsulta = observacionesConsulta;
    }


    public String getObservacionesSalida()
    {
        return observacionesSalida;
    }

    public void setObservacionesSalida(String observacionesSalida)
    {
        this.observacionesSalida = observacionesSalida;
    }


    public double getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(double temperatura)
    {
        this.temperatura = temperatura;
    }


    public String getPresionArterial()
    {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial)
    {
        this.presionArterial = presionArterial;
    }


    public String getTratamiento()
    {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento)
    {
        this.tratamiento = tratamiento;
    }


    public String getEstadoConsulta()
    {
        return estadoConsulta;
    }

    public void setEstadoConsulta(String estadoConsulta)
    {
        this.estadoConsulta = estadoConsulta;
    }
}
