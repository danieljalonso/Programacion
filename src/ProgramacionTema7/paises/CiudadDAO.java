package ProgramacionTema7.paises;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/geografia_db";
    private static final String USER = "root";
    private static final String PASS = "";

    static Connection conexion;

    public CiudadDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.err.println("No se ha encontrado el driver de MySQL :: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de SQL al conectar :: " + e.getMessage());
        }
    }

    public List<Ciudad> obtenerCiudadesPorPais(int idPais) {
        List<Ciudad> lista = new ArrayList<>();

        String sql = "SELECT id, nombre, poblacion, id_pais FROM ciudades WHERE id_pais = ?";

        try {
            PreparedStatement pstmt = conexion.prepareStatement(sql);

            pstmt.setInt(1, idPais);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Ciudad c = new Ciudad();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setPoblacion(rs.getInt("poblacion"));
                c.setIdPais(rs.getInt("id_pais"));

                lista.add(c);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener las ciudades :: " + e.getMessage());;
        }

        return lista;
    }
}
