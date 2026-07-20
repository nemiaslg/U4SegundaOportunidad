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
public class ControladorPaciente {
    private PacienteDAO pacienteDAO;

    public ControladorPaciente()
    {
        pacienteDAO = new PacienteDAO();
    }


    // Registrar paciente
    public boolean guardarPaciente(Paciente paciente)
    {
        return pacienteDAO.insertar(paciente);
    }


    // Obtener todos los pacientes
    public List<Paciente> obtenerPacientes()
    {
        return pacienteDAO.listar();
    }


    // Actualizar paciente
    public boolean actualizarPaciente(Paciente paciente)
    {
        return pacienteDAO.actualizar(paciente);
    }


    // Eliminar paciente
    public boolean eliminarPaciente(int idPaciente)
    {
        return pacienteDAO.eliminar(idPaciente);
    }
    
}
