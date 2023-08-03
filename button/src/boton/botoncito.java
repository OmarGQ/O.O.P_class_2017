/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boton;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Redes
 */
public class botoncito extends JFrame 
{
    private JPanel pan, fon;
    private JButton btnNorte,btnSur,btnEste,btnOeste,btnCentro,Reiniciar,Salir,Boton;
    private int banX, x, y, a;
    public botoncito ()
    {
        super ();
        banX=0;
        x=0;
        y=0;
        a=20;
        pan=new JPanel();
        fon=new JPanel();
        btnNorte=new JButton("^");
        btnSur=new JButton("V");
        btnEste=new JButton(">");
        btnOeste=new JButton("<");
        btnCentro=new JButton();
        Reiniciar=new JButton("Reiniciar");
        Salir=new JButton("Salir");
        Boton=new JButton();
        
        pan.setSize(150,120);
        pan.setLocation(450,240);
        pan.setLayout(new BorderLayout());
        fon.setSize(600,240);
        fon.setLocation(0,0);
        fon.setBackground(Color.GRAY);
        btnNorte.setSize(0,0);
        btnSur.setSize(0,0);
        btnEste.setSize(0,0);
        btnOeste.setSize(0,0);
        btnCentro.setSize(0,0);
        Reiniciar.setSize(120,60);
        Reiniciar.setLocation(270,280);
        Salir.setSize(120,60);
        Salir.setLocation(100,280);
        Boton.setSize(a,a);
        Boton.setLocation(x,y);
        Boton.setBackground(Color.white);
        
        btnNorte.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(y>0)
                {
                    y-=10;
                    Boton.setLocation(x,y);
                }
            }
        });
        btnSur.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(y+a<240)
                {
                    y+=10;
                    Boton.setLocation(x,y);
                }
            }
        });
        btnEste.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x+a<600)
                {
                    x+=10;
                    Boton.setLocation(x,y);
                }
            }
        });
        btnOeste.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x>0)
                {
                    x-=10;
                    Boton.setLocation(x,y);
                }
            }
        });
        btnCentro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                a+=10;
                if(x+a>600)
                {
                    x-=10;
                 
                }
                if(a>=240)
                {
                    a-=10;
                }
                else if(y+a>240)
                {
                    y-=10;
                   
                }
                Boton.setLocation(x,y);
                Boton.setSize(a,a);
            }
        });
        Reiniciar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                Boton.setSize(20,20);
                Boton.setLocation(0,0); 
                x=0;
                y=0;
                a=20;
            }
        });
        Salir.addActionListener(new ActionListener ()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit( 0 ); 
            }
        });
        
        setLayout(null);
        add(fon);
        add(pan);
        pan.add(BorderLayout.NORTH, btnNorte);
        pan.add(BorderLayout.SOUTH, btnSur);
        pan.add(BorderLayout.WEST, btnOeste);
        pan.add(BorderLayout.EAST, btnEste);
        pan.add(BorderLayout.CENTER,btnCentro);
        add(Reiniciar);
        add(Salir);
        fon.setLayout(null);
        fon.add(Boton);
        
        setSize(600,400);//tamano de la pantalla
        Toolkit tk;
        tk=Toolkit.getDefaultToolkit ();
        Dimension tamPant=tk.getScreenSize();
        setLocation((tamPant.width-getSize().width)/2,(tamPant.height-getSize().height)/2);
        setTitle("El boton");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
}
