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
import model.vo.ProyectoCiudad;

public class ProyectoCiudadDao {

    public ArrayList<ProyectoCiudad> rankingProyectosCiudad() throws SQLException {

        ArrayList<ProyectoCiudad> respuesta = new ArrayList<ProyectoCiudad>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       
            String consulta =   "SELECT Constructora,"+ 
                                "Fecha_Inicio,"+
                                "Clasificacion "+
                        "FROM Proyecto "+
                        "WHERE Ciudad = 'Armenia';";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                ProyectoCiudad proyectoCiudad = new ProyectoCiudad();
                proyectoCiudad.setConstructora(resultSet.getString("Constructora"));
                proyectoCiudad.setFechaInicio(resultSet.getString("Fecha_Inicio"));                
                proyectoCiudad.setClasificacion(resultSet.getString("Clasificacion"));
                respuesta.add(proyectoCiudad);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error en la consulta " + e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }
        return respuesta; 
    }  
}