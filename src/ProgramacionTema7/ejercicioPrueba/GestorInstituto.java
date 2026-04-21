package ProgramacionTema7.ejercicioPrueba;

import java.sql.*;

public class GestorInstituto {

    private static final String URL = "jdbc:mysql://localhost:3306/instituto_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; // Que cada alumno ponga la suya
    private static Connection conexion;

    // TODO Paso 1: Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación

    // TODO Paso 2: Crear el método registrarAlumno(String nombre, String email)
    // Alta de un alumno en su tabla correspondiente

    // TODO Paso 3: Crear el método matricularAlumno(int idAlumno, int idAsignatura)
    // Aquí estamos insertando una relación N:N

    // TODO Paso 4: Crear el método mostrarAsignaturasDeAlumno(int idAlumno)
    // Select con join...

    // TODO Paso 5: Crear el método darDeBajaAlumno(int idAlumno)
    // Delete...

    public static void main(String[] args) {
        GestorInstituto gestor = new GestorInstituto();
        // Aquí iremos probando los métodos paso a paso

        Connection conexion = conectar();
        System.out.println("Estamos conectados a la base de datos");
    }

    public static Connection conectar() {
        try {
            Class.forName("com.musql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("No se ha encontrado el driver de MySQL, " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL al conectar, " + e.getMessage());
        }
        return conexion;
    }


}
