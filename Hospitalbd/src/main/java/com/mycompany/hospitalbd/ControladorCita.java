/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalbd;

import java.util.List;

/**
 *
 * @author nemia
 */
public class ControladorCita {
    private CitaDAO citaDAO;


    public ControladorCita()
    {
        citaDAO = new CitaDAO();
    }


    // Registrar cita
    public boolean guardarCita(Cita cita)
    {
        return citaDAO.insertar(cita);
    }


    // Obtener todas las citas
    public List<Cita> obtenerCitas()
    {
        return citaDAO.listar();
    }


    // Buscar citas de un paciente específico
    public List<Cita> obtenerCitasPorPaciente(int idPaciente)
    {
        return citaDAO.buscarPorPaciente(idPaciente);
    }


    // Actualizar cita
    public boolean actualizarCita(Cita cita)
    {
        return citaDAO.actualizar(cita);
    }


    // Eliminar cita
    public boolean eliminarCita(int idCita)
    {
        return citaDAO.eliminar(idCita);
    }
}
