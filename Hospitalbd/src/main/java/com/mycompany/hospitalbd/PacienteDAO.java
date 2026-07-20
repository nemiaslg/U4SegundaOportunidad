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
public class PacienteDAO {
    private Connection conexion;

    public PacienteDAO()
    {
        conexion = Conexion.conectar();
    }


    // CREATE
    public boolean insertar(Paciente paciente)
    {
        String sql = "INSERT INTO pacientes(nombre, app, apm, genero, fechanacimiento, edad, peso, fecharegistro, activo, fechasalida) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApp());
            ps.setString(3, paciente.getApm());
            ps.setString(4, paciente.getGenero());
            ps.setDate(5, paciente.getFechaNacimiento());
            ps.setInt(6, paciente.getEdad());
            ps.setDouble(7, paciente.getPeso());
            ps.setTimestamp(8, paciente.getFechaRegistro());
            ps.setBoolean(9, paciente.isActivo());
            ps.setTimestamp(10, paciente.getFechaSalida());

            ps.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al insertar paciente: " + e.getMessage());
            return false;
        }
    }


    // READ
    public List<Paciente> listar()
    {
        List<Paciente> pacientes = new ArrayList<>();

        String sql = "SELECT * FROM pacientes";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Paciente p = new Paciente();

                p.setIdPaciente(rs.getInt("idpaciente"));
                p.setNombre(rs.getString("nombre"));
                p.setApp(rs.getString("app"));
                p.setApm(rs.getString("apm"));
                p.setGenero(rs.getString("genero"));
                p.setFechaNacimiento(rs.getDate("fechanacimiento"));
                p.setEdad(rs.getInt("edad"));
                p.setPeso(rs.getDouble("peso"));
                p.setFechaRegistro(rs.getTimestamp("fecharegistro"));
                p.setActivo(rs.getBoolean("activo"));
                p.setFechaSalida(rs.getTimestamp("fechasalida"));

                pacientes.add(p);
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error al listar pacientes: " + e.getMessage());
        }

        return pacientes;
    }


    // UPDATE
    public boolean actualizar(Paciente paciente)
    {
        String sql = "UPDATE pacientes SET nombre=?, app=?, apm=?, genero=?, "
                   + "fechanacimiento=?, edad=?, peso=?, activo=?, fechasalida=? "
                   + "WHERE idpaciente=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApp());
            ps.setString(3, paciente.getApm());
            ps.setString(4, paciente.getGenero());
            ps.setDate(5, paciente.getFechaNacimiento());
            ps.setInt(6, paciente.getEdad());
            ps.setDouble(7, paciente.getPeso());
            ps.setBoolean(8, paciente.isActivo());
            ps.setTimestamp(9, paciente.getFechaSalida());
            ps.setInt(10, paciente.getIdPaciente());

            ps.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al actualizar paciente: " + e.getMessage());
            return false;
        }
    }


    // DELETE
    public boolean eliminar(int idPaciente)
    {
        String sql = "DELETE FROM pacientes WHERE idpaciente=?";

        try
        {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idPaciente);

            ps.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error al eliminar paciente: " + e.getMessage());
            return false;
        }
    }
    
}
