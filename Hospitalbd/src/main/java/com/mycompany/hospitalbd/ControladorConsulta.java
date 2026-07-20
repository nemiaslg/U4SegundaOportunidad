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
public class ControladorConsulta {
    private ConsultaDAO consultaDAO;


    public ControladorConsulta()
    {
        consultaDAO = new ConsultaDAO();
    }


    // Registrar consulta
    public boolean guardarConsulta(Consulta consulta)
    {
        return consultaDAO.insertar(consulta);
    }


    // Obtener todas las consultas
    public List<Consulta> obtenerConsultas()
    {
        return consultaDAO.listar();
    }


    // Buscar consulta por cita
    public Consulta obtenerConsultaPorCita(int idCita)
    {
        return consultaDAO.buscarPorCita(idCita);
    }


    // Actualizar consulta
    public boolean actualizarConsulta(Consulta consulta)
    {
        return consultaDAO.actualizar(consulta);
    }


    // Eliminar consulta
    public boolean eliminarConsulta(int idConsulta)
    {
        return consultaDAO.eliminar(idConsulta);
    }
}
