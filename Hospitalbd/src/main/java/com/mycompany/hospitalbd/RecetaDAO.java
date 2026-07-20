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
public class RecetaDAO {

    private Connection conexion;

    public RecetaDAO() {
        conexion = Conexion.conectar();
    }

    // CREATE
    public int insertar(Receta receta) {

        String sql
                = "INSERT INTO recetas("
                + "idconsulta, medicamento, dosis, frecuencia, "
                + "duracion, indicaciones) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conexion.prepareStatement(
                sql,
                Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, receta.getIdConsulta());
            ps.setString(2, receta.getMedicamento());
            ps.setString(3, receta.getDosis());
            ps.setString(4, receta.getFrecuencia());
            ps.setString(5, receta.getDuracion());
            ps.setString(6, receta.getIndicaciones());

            int filas = ps.executeUpdate();

            if (filas > 0) {

                try (ResultSet rs = ps.getGeneratedKeys()) {

                    if (rs.next()) {
                        return rs.getInt(1);
                    }
                }
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error al insertar receta: "
                    + e.getMessage()
            );
        }

        return -1;
    }

    // READ
    public List<Receta> listar() {
        List<Receta> recetas = new ArrayList<>();

        String sql = "SELECT * FROM recetas";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Receta r = new Receta();

                r.setIdReceta(rs.getInt("idreceta"));
                r.setIdConsulta(rs.getInt("idconsulta"));

                r.setMedicamento(rs.getString("medicamento"));
                r.setDosis(rs.getString("dosis"));
                r.setFrecuencia(rs.getString("frecuencia"));
                r.setDuracion(rs.getString("duracion"));
                r.setIndicaciones(rs.getString("indicaciones"));

                r.setFechaEmision(rs.getTimestamp("fechaemision"));

                recetas.add(r);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar recetas: " + e.getMessage());
        }

        return recetas;
    }

    // BUSCAR POR CONSULTA
    public Receta buscarPorConsulta(int idConsulta) {
        Receta receta = null;

        String sql = "SELECT * FROM recetas WHERE idconsulta=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idConsulta);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                receta = new Receta();

                receta.setIdReceta(rs.getInt("idreceta"));
                receta.setIdConsulta(rs.getInt("idconsulta"));

                receta.setMedicamento(rs.getString("medicamento"));
                receta.setDosis(rs.getString("dosis"));
                receta.setFrecuencia(rs.getString("frecuencia"));
                receta.setDuracion(rs.getString("duracion"));
                receta.setIndicaciones(rs.getString("indicaciones"));

                receta.setFechaEmision(rs.getTimestamp("fechaemision"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar receta: " + e.getMessage());
        }

        return receta;
    }

    // UPDATE
    public boolean actualizar(Receta receta) {
        String sql = "UPDATE recetas SET medicamento=?, dosis=?, "
                + "frecuencia=?, duracion=?, indicaciones=? "
                + "WHERE idreceta=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, receta.getMedicamento());
            ps.setString(2, receta.getDosis());
            ps.setString(3, receta.getFrecuencia());
            ps.setString(4, receta.getDuracion());
            ps.setString(5, receta.getIndicaciones());
            ps.setInt(6, receta.getIdReceta());

            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar receta: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean eliminar(int idReceta) {
        String sql = "DELETE FROM recetas WHERE idreceta=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idReceta);

            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar receta: " + e.getMessage());
            return false;
        }
    }

    public String obtenerNombrePacientePorReceta(int idReceta) {

        String nombreCompleto = null;

        String sql
                = "SELECT p.nombre, p.app, p.apm "
                + "FROM recetas r "
                + "INNER JOIN consultas co "
                + "ON r.idconsulta = co.idconsulta "
                + "INNER JOIN citas ci "
                + "ON co.idcita = ci.idcita "
                + "INNER JOIN pacientes p "
                + "ON ci.idpaciente = p.idpaciente "
                + "WHERE r.idreceta = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idReceta);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    nombreCompleto
                            = rs.getString("nombre")
                            + " "
                            + rs.getString("app")
                            + " "
                            + rs.getString("apm");
                }
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error al obtener el paciente de la receta: "
                    + e.getMessage()
            );
        }

        return nombreCompleto;
    }

}
