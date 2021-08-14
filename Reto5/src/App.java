import view.VistaRequerimientosReto4;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton boton;
    private JTextArea primero, segundo, tercero;
    private JLabel primeroL, segundoL, terceroL;
    private JLabel datos, datos1, datos2, datos3, datos4;

    public App() {
        
        this.setTitle("Resultados Consultas - Reto 5");
        this.setBounds(0, 0, 500, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        boton = new JButton();
        boton.setText("Ver Resultados Consultas");
        boton.setBounds(10, 10, 460, 30);
        this.add(boton);
        
        primeroL = new JLabel();
        primeroL.setText("Consulta 1 - Proyecto Ciudad");
        primeroL.setBounds(10, 40, 250, 30);
        this.add(primeroL);
        
        primero = new JTextArea();
        primero.setBounds(10, 70, 250, 460);
        primero.setFont(primero.getFont().deriveFont(10f));
        this.add(primero);
        
        segundoL = new JLabel();
        segundoL.setText("Consulta 2 - Suma Cantidades");
        segundoL.setBounds(270, 40, 200, 30);
        this.add(segundoL);
        
        segundo = new JTextArea();
        segundo.setBounds(270, 70, 200, 50);
        segundo.setFont(segundo.getFont().deriveFont(10f));
        this.add(segundo);
        
        terceroL = new JLabel();
        terceroL.setText("Consulta 3 - Líder Ciudad");
        terceroL.setBounds(270, 120, 200, 30);
        this.add(terceroL);
        
        tercero = new JTextArea();
        tercero.setBounds(270, 150, 200, 70);
        tercero.setFont(tercero.getFont().deriveFont(10f));
        this.add(tercero);
        
        datos = new JLabel();
        datos.setText("Realizado por:");
        datos.setBounds(270, 230, 200, 30);
        this.add(datos);
        
        datos1 = new JLabel();
        datos1.setText("Iván Andrés Delgado González");
        datos1.setForeground(Color.blue);
        datos1.setBounds(270, 250, 200, 30);
        this.add(datos1);
        
        datos2 = new JLabel();
        datos2.setText("Grupo No. 62");
        datos2.setForeground(Color.blue);
        datos2.setBounds(270, 270, 200, 30);
        this.add(datos2);
        
        datos3 = new JLabel();
        datos3.setText("Enlace GitHub:");
        datos3.setBounds(10, 530, 200, 30);
        this.add(datos3);
        
        datos4 = new JLabel();
        datos4.setText("https://github.com/ivandelgadog21/programaci-n-java.git");
        datos4.setForeground(Color.blue);
        datos4.setBounds(95, 530, 400, 30);
        this.add(datos4);
        
        boton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
                primero.setText("" + VistaRequerimientosReto4.requerimiento1());
                segundo.setText("" + VistaRequerimientosReto4.requerimiento3());
                tercero.setText("" + VistaRequerimientosReto4.requerimiento4());
            }
        });
    }
    
    public static void main(String[] args) {
    	App ejemplo = new App();
        ejemplo.setVisible(true);       
    }
}