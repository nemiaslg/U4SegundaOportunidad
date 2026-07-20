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
public class Cita {
     private int idCita;
    private int idPaciente;

    private Timestamp fechaCita;
    private String motivoCita;
    private String observaciones;
    private Timestamp fechaRegistro;

    public Cita()
    {
    }

    public Cita(int idCita, int idPaciente, Timestamp fechaCita,
                String motivoCita, String observaciones,
                Timestamp fechaRegistro)
    {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.fechaCita = fechaCita;
        this.motivoCita = motivoCita;
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCita()
    {
        return idCita;
    }

    public void setIdCita(int idCita)
    {
        this.idCita = idCita;
    }

    public int getIdPaciente()
    {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente)
    {
        this.idPaciente = idPaciente;
    }

    public Timestamp getFechaCita()
    {
        return fechaCita;
    }

    public void setFechaCita(Timestamp fechaCita)
    {
        this.fechaCita = fechaCita;
    }

    public String getMotivoCita()
    {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita)
    {
        this.motivoCita = motivoCita;
    }

    public String getObservaciones()
    {
        return observaciones;
    }

    public void setObservaciones(String observaciones)
    {
        this.observaciones = observaciones;
    }

    public Timestamp getFechaRegistro()
    {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro)
    {
        this.fechaRegistro = fechaRegistro;
    }
}
