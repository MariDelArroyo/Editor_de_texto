package com.example.editor_de_texto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Instancia única de la conexión (Singleton)
    private static ConexionBD instancia;

    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/patrones_de_disenho?useSSL=false";
    private static final String USUARIO = "Mariana";
    private static final String CONTRASEÑA = "26demayo2004";

    // Objeto de conexión
    private Connection connection;

    // Constructor privado para evitar instanciación directa
    private ConexionBD() {
        try {
            // Establecer conexión a la base de datos
            connection = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Método estático para obtener la instancia única de la conexión
    public static ConexionBD obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    // Método para obtener la conexión a la base de datos
    public Connection obtenerConexion() {
        return connection;
    }
}