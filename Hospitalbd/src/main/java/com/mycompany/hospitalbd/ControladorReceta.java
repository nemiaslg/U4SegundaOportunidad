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
public class ControladorReceta {

    private RecetaDAO recetaDAO;

    public ControladorReceta() {
        recetaDAO = new RecetaDAO();
    }

    public String obtenerNombrePaciente(int idReceta) {
        return recetaDAO.obtenerNombrePacientePorReceta(idReceta);
    }

    // Registrar receta
    public int guardarReceta(Receta receta) {
        return recetaDAO.insertar(receta);
    }

    // Obtener todas las recetas
    public List<Receta> obtenerRecetas() {
        return recetaDAO.listar();
    }

    // Buscar receta por consulta
    public Receta obtenerRecetaPorConsulta(int idConsulta) {
        return recetaDAO.buscarPorConsulta(idConsulta);
    }

    // Actualizar receta
    public boolean actualizarReceta(Receta receta) {
        return recetaDAO.actualizar(receta);
    }

    // Eliminar receta
    public boolean eliminarReceta(int idReceta) {
        return recetaDAO.eliminar(idReceta);
    }
}
