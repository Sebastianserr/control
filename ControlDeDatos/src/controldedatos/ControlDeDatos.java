/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldedatos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author User
 */
public class ControlDeDatos extends JFrame implements ActionListener{
    private JLabel lbll,lblN,lblG,lblE,lblT,lblCE,lblC;
    private JTextField txtN,txtCE;
    private JButton btnG,btnL;       
    private JToggleButton btnM,btnF;       
    private JSpinner spnEdad;       
    private JFormattedTextField ftxtTel;      
    private JPasswordField pfl;       
    private JTextArea txtal;
    private String genero;

    public ControlDeDatos (){
       //crear instacias de controles y propiedades
       lbll= new JLabel("Ingresar lo siguientes");
       lbll.setBounds(15,15,160,30);
       add(lbll);
       
       lblN=new JLabel("NOMBRE:  ");
       lblN.setBounds(100,50,120,30);
       add(lblN);
       
       txtN=new JTextField("GENERA:  ");
     
                                                                                                                                                                                                           
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

  
    
}
