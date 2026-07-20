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
public class ConsultaDAO {
    private Connection conexion;

    public ConsultaDAO()
    {
        conexion = Conexion.conectar();
    }


    // CREATE
    public boolean insertar(Consulta consulta)
    {
        String sql = "INSERT INTO consultas(idcita, fechaingreso, fechasalida, "
                   + "diagnostico, observacionesconsulta, observacionessalida, "
                   + "temperatura, presionarterial, tratamiento, estadoconsulta) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, consulta.getIdCita());
            ps.setTimestamp(2, consulta.getFechaIngreso());
            ps.setTimestamp(3, consulta.getFechaSalida());
            ps.setString(4, consulta.getDiagnostico());
            ps.setString(5, consulta.getObservacionesConsulta());
            ps.setString(6, consulta.getObservacionesSalida());
            ps.setDouble(7, consulta.getTemperatura());
            ps.setString(8, consulta.getPresionArterial());
            ps.setString(9, consulta.getTratamiento());
            ps.setString(10, consulta.getEstadoConsulta());

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al insertar consulta: " + e.getMessage());
            return false;
        }
    }


    // READ
    public List<Consulta> listar()
    {
        List<Consulta> consultas = new ArrayList<>();

        String sql = "SELECT * FROM consultas";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Consulta c = new Consulta();

                c.setIdConsulta(rs.getInt("idconsulta"));
                c.setIdCita(rs.getInt("idcita"));

                c.setFechaIngreso(rs.getTimestamp("fechaingreso"));
                c.setFechaSalida(rs.getTimestamp("fechasalida"));

                c.setDiagnostico(rs.getString("diagnostico"));
                c.setObservacionesConsulta(rs.getString("observacionesconsulta"));
                c.setObservacionesSalida(rs.getString("observacionessalida"));

                c.setTemperatura(rs.getDouble("temperatura"));
                c.setPresionArterial(rs.getString("presionarterial"));
                c.setTratamiento(rs.getString("tratamiento"));

                c.setEstadoConsulta(rs.getString("estadoconsulta"));

                consultas.add(c);
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error al listar consultas: " + e.getMessage());
        }

        return consultas;
    }


    // BUSCAR POR CITA
    public Consulta buscarPorCita(int idCita)
    {
        Consulta consulta = null;

        String sql = "SELECT * FROM consultas WHERE idcita=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idCita);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                consulta = new Consulta();

                consulta.setIdConsulta(rs.getInt("idconsulta"));
                consulta.setIdCita(rs.getInt("idcita"));

                consulta.setFechaIngreso(rs.getTimestamp("fechaingreso"));
                consulta.setFechaSalida(rs.getTimestamp("fechasalida"));

                consulta.setDiagnostico(rs.getString("diagnostico"));
                consulta.setObservacionesConsulta(rs.getString("observacionesconsulta"));
                consulta.setObservacionesSalida(rs.getString("observacionessalida"));

                consulta.setTemperatura(rs.getDouble("temperatura"));
                consulta.setPresionArterial(rs.getString("presionarterial"));
                consulta.setTratamiento(rs.getString("tratamiento"));

                consulta.setEstadoConsulta(rs.getString("estadoconsulta"));
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error al buscar consulta: " + e.getMessage());
        }

        return consulta;
    }


    // UPDATE
    public boolean actualizar(Consulta consulta)
    {
        String sql = "UPDATE consultas SET fechaingreso=?, fechasalida=?, "
                   + "diagnostico=?, observacionesconsulta=?, observacionessalida=?, "
                   + "temperatura=?, presionarterial=?, tratamiento=?, "
                   + "estadoconsulta=? WHERE idconsulta=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setTimestamp(1, consulta.getFechaIngreso());
            ps.setTimestamp(2, consulta.getFechaSalida());
            ps.setString(3, consulta.getDiagnostico());
            ps.setString(4, consulta.getObservacionesConsulta());
            ps.setString(5, consulta.getObservacionesSalida());
            ps.setDouble(6, consulta.getTemperatura());
            ps.setString(7, consulta.getPresionArterial());
            ps.setString(8, consulta.getTratamiento());
            ps.setString(9, consulta.getEstadoConsulta());
            ps.setInt(10, consulta.getIdConsulta());

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al actualizar consulta: " + e.getMessage());
            return false;
        }
    }


    // DELETE
    public boolean eliminar(int idConsulta)
    {
        String sql = "DELETE FROM consultas WHERE idconsulta=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idConsulta);

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al eliminar consulta: " + e.getMessage());
            return false;
        }
    }
}
