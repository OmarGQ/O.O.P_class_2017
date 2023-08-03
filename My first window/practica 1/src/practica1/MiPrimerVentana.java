/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Alumnos
 */

public class MiPrimerVentana extends JFrame
{
  public MiPrimerVentana()
  {
    super();//se declara como superclase
    setSize(500,300);//se define el tamaño de pantalla
    Toolkit tk;
    tk=Toolkit.getDefaultToolkit ();
    Dimension tamPant=tk.getScreenSize();
    setLocation((tamPant.width-getSize().width)/2,(tamPant.height-getSize().height)/2);
    setTitle("MI primer ventana :3");//se define el nombre de la ventana
    setDefaultCloseOperation(EXIT_ON_CLOSE);//se define lo cuando se ciierre la vantana se termine el proceso
    setUndecorated(true);
    setResizable(false);//no permite que el usuario modifique el tamaño de la ventana
    //getContentPane().setBackground(Color.BLUE);//cambiar el color al fondo tambien se puede (new Color(###,##,##));
    setVisible(true);//para que sea visible (siempre va al final
  }
}
