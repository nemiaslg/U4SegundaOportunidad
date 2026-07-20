package com.mycompany.hospitalbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = 
            "jdbc:postgresql://localhost:5432/hospital";

    private static final String USER = "postgres";

    private static final String PASSWORD = "negra02lula";


    // Método para probar la conexión
    public static void main(String[] args) {

        try {

            Connection conexion = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Conexion exitosa con la base de datos Hospital");

            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error de conexion: " + e.getMessage());

        }
    }


    // Método que utilizarán tus CRUD
    public static Connection conectar() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch (SQLException e) {

            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}