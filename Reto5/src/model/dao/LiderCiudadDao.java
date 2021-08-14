package model.dao;

import java.util.ArrayList;

//Librer�as para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexi�n
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.LiderCiudad;

public class LiderCiudadDao {

    public ArrayList<LiderCiudad> rankingLiderCiudad() throws SQLException {

        ArrayList<LiderCiudad> respuesta = new ArrayList<LiderCiudad>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT "
                    + "l.Nombre || ' ' ||l.Primer_Apellido || ' ' ||l.Segundo_Apellido AS 'Nombre L�der' "
                    + "FROM Lider l " + "WHERE l.Ciudad_Residencia = 'Paris';";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                LiderCiudad liderCiudad = new LiderCiudad();
                liderCiudad.setNombreLider(resultSet.getString("Nombre L�der"));
                respuesta.add(liderCiudad);
            }
            resultSet.close();
            statement.close();
            
        } catch (SQLException e) {
            System.err.println("Error en la consulta: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;
    }
}