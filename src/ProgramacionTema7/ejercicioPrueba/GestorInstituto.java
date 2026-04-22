package ProgramacionTema7.ejercicioPrueba;

import java.sql.*;

public class GestorInstituto {

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

        InstitutoDBDAO logica = new InstitutoDBDAO();
        // Aquí iremos probando los métodos paso a paso

        logica.conectar();
        System.out.println("Estamos conectados a la base de datos");

        try {
            logica.conexion.setAutoCommit(false);
            logica.registrarAlumno("Rafa", "rafa@educa.jcyl.es");
            logica.registrarAlumno("Laura", "laura@educa.jcyl.es");
            logica.registrarAlumno("Blanca", "blanca@educa.jcyl.es");
            logica.conexion.commit();
        } catch (SQLException e) {
            System.err.println("Error al insertar los alumnos, " + e.getMessage());
            try {
                logica.conexion.rollback();
            } catch (SQLException ex) {
                System.err.println("Error al hacer rollback, " + ex.getMessage());
            }
        }

        try {
            logica.conexion.setAutoCommit(false);
            logica.matricularAlumno(3, 1);
            logica.conexion.commit();
        } catch (SQLException e) {
            System.err.println("Error al insertar la matricula, " + e.getMessage());
            try {
                logica.conexion.rollback();
            } catch (SQLException ex) {
                System.err.println("Error al hacer rollback, " + ex.getMessage());
            }
        }

        logica.mostrarAlumnos();

        logica.desconectar();
    }

}
