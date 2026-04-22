package ProgramacionTema7.ejercicioPrueba;

import java.sql.*;

public class InstitutoDBDAO {

    Connection conexion;

    public void mostrarAlumnos() {
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.err.println("Error al mostrar los alumnos, " + e.getMessage());
        }
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(Constants.URL, Constants.USUARIO, Constants.PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("No se ha encontrado el driver de MySQL, " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de SQL al conectar, " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error de SQL al desconectar, " + e.getMessage());
        }
    }

    public void registrarAlumno(String nombre, String email) {
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO Alumnos(nombre, email) VALUES (?, ?)");
            statement.setString(1, nombre);
            statement.setString(2, email);
            int filas = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al instertar un alumno, " + e.getMessage());
        }
    }

    public void matricularAlumno(int idAlumno, int idAsignatura) {
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO matriculas(id_alumno, id_asignatura) VALUES (?, ?)");
            statement.setInt(1, idAlumno);
            statement.setInt(2, idAsignatura);
            int filas = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al instertar la matricula, " + e.getMessage());
        }
    }

}
