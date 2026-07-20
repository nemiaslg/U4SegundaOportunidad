/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalbd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nemia
 */
public class CitaDAO {
    private Connection conexion;

    public CitaDAO()
    {
        conexion = Conexion.conectar();
    }


    // CREATE
    public boolean insertar(Cita cita)
    {
        String sql = "INSERT INTO citas(idpaciente, fechacita, motivocita, observaciones) "
                   + "VALUES (?, ?, ?, ?)";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, cita.getIdPaciente());
            ps.setTimestamp(2, cita.getFechaCita());
            ps.setString(3, cita.getMotivoCita());
            ps.setString(4, cita.getObservaciones());

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al insertar cita: " + e.getMessage());
            return false;
        }
    }


    // READ
    public List<Cita> listar()
    {
        List<Cita> citas = new ArrayList<>();

        String sql = "SELECT * FROM citas";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Cita c = new Cita();

                c.setIdCita(rs.getInt("idcita"));
                c.setIdPaciente(rs.getInt("idpaciente"));
                c.setFechaCita(rs.getTimestamp("fechacita"));
                c.setMotivoCita(rs.getString("motivocita"));
                c.setObservaciones(rs.getString("observaciones"));
                c.setFechaRegistro(rs.getTimestamp("fecharegistro"));

                citas.add(c);
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error al listar citas: " + e.getMessage());
        }

        return citas;
    }


    // READ POR PACIENTE
    public List<Cita> buscarPorPaciente(int idPaciente)
    {
        List<Cita> citas = new ArrayList<>();

        String sql = "SELECT * FROM citas WHERE idpaciente=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idPaciente);

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Cita c = new Cita();

                c.setIdCita(rs.getInt("idcita"));
                c.setIdPaciente(rs.getInt("idpaciente"));
                c.setFechaCita(rs.getTimestamp("fechacita"));
                c.setMotivoCita(rs.getString("motivocita"));
                c.setObservaciones(rs.getString("observaciones"));
                c.setFechaRegistro(rs.getTimestamp("fecharegistro"));

                citas.add(c);
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error al buscar citas: " + e.getMessage());
        }

        return citas;
    }


    // UPDATE
    public boolean actualizar(Cita cita)
    {
        String sql = "UPDATE citas SET fechacita=?, motivocita=?, "
                   + "observaciones=? WHERE idcita=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setTimestamp(1, cita.getFechaCita());
            ps.setString(2, cita.getMotivoCita());
            ps.setString(3, cita.getObservaciones());
            ps.setInt(4, cita.getIdCita());

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al actualizar cita: " + e.getMessage());
            return false;
        }
    }


    // DELETE
    public boolean eliminar(int idCita)
    {
        String sql = "DELETE FROM citas WHERE idcita=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idCita);

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al eliminar cita: " + e.getMessage());
            return false;
        }
    }
}
