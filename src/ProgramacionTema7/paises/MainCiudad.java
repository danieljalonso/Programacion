package ProgramacionTema7.paises;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class MainCiudad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CiudadDAO logica = new CiudadDAO();
        Connection conn = CiudadDAO.conexion;

        System.out.print("Introduce continente: ");
        String continente = sc.nextLine();

        String sqlConsulta =
                """SELECT c.nombre, p.nombre AS pais, c.poblacion
                FROM ciudades c JOIN paises p ON c.id_pais = p.id JOIN continentes ct ON p.id_continente = ct.id
                WHERE ct.nombre = ?""";

        try {
            PreparedStatement ps = conn.prepareStatement(sqlConsulta);

            ps.setString(1, continente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Ciudad: " + rs.getString("nombre") + ", País: " + rs.getString("pais") + ", Población: " + rs.getInt("poblacion") + " habitantes");
            }

        } catch (SQLException e) {
            System.err.println("Error al mostrar las ciudades :: " + e.getMessage());
        }

        try {
            conn.setAutoCommit(false);

            String updateMadrid = "UPDATE ciudades SET poblacion = poblacion + 50000 WHERE nombre = 'Madrid'";

            String updateBarcelona = "UPDATE ciudades SET poblacion = poblacion - 50000 WHERE nombre = 'Barcelona'";

            try {
                Statement st = conn.createStatement();

                st.executeUpdate(updateMadrid);
                st.executeUpdate(updateBarcelona);

                conn.commit();
            } catch (SQLException e) {
                System.err.println("Error al movilizar los habitantes :: " + e.getMessage());
            }

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                System.err.println("No se ha podido hacer un rolback :: " + e.getMessage());
            }
        }

        try {

            CallableStatement cs = conn.prepareCall("{call calcular_poblacion_continente(?, ?)}");

            cs.setString(1, "Asia");
            cs.registerOutParameter(2, Types.INTEGER);

            cs.execute();

            int total = cs.getInt(2);

            System.out.println("Población total de Asia: " + total);

        } catch (SQLException e) {
            System.err.println("No se ha podido calcular la poblacion total del continente :: " + e.getMessage());
        }

        List<Ciudad> ciudadesBrasil = logica.obtenerCiudadesPorPais(4);

        System.out.println("-----------------------------------");
        System.out.println("Ciudades de Brasil:");

        for (Ciudad c : ciudadesBrasil) {
            System.out.println(c);
        }

        sc.close();
    }
}
