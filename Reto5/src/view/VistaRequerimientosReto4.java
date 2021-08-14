package view;

import controller.ControladorRequerimientosReto4;
import model.vo.LiderCiudad;
import model.vo.SumaProveedor;
import model.vo.ProyectoCiudad;
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static String requerimiento1() {
    	
    	String texto = "";       
        try {
            ArrayList<ProyectoCiudad> rankingProyectoCiudad = controlador.consultarProyectoCiudad();            
            texto += "Constructora - Fecha_Inicio - Clasificación\n\n";
            for (ProyectoCiudad proyectoCiudad : rankingProyectoCiudad) {
                texto += proyectoCiudad.getConstructora() + " - " + proyectoCiudad.getFechaInicio() + " - " +
                        proyectoCiudad.getClasificacion() + "\n";
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
        return texto;
    }

    public static String requerimiento3() {
    	
    	String texto = "";
        try {
            ArrayList<SumaProveedor> rankingSumaProveedor = controlador.consultarSumaProveedor();
            texto += "Suma Cantidades\n\n";
            for (SumaProveedor suma : rankingSumaProveedor) {                
                texto += suma.getCantidad() + "\n";
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
        return texto;
    }

    public static String requerimiento4() {
    	
    	String texto = "";
        try {
            ArrayList<LiderCiudad> rankingLiderCiudad = controlador.consultarLiderCiudad();
            texto += "Nombre Líder\n\n";            
            for (LiderCiudad lider : rankingLiderCiudad) {                
                texto += lider.getNombreLider() + "\n";
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
        return texto;
    }
}