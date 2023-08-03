/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;

/**
 *
 * @author Omar xv
 */
public class palabra extends JFrame
{
    private JButton c1,c2,c3,c4,c5,l1,l2,l3,l4,N,C,S;
    private JTextField txtPantalla;
    private Map line; 
    public palabra ()
    {
        super ();
        c1=new JButton("rojo");
        c2=new JButton("Verde");
        c3=new JButton("Azul");
        c4=new JButton("Amarillo");
        c5=new JButton("Negro");
        l1=new JButton("Arial");
        l2=new JButton("Sans");
        l3=new JButton("Forte");
        l4=new JButton("Chiller");
        N=new JButton("Negritas");
        C=new JButton("Cursiva");
        S=new JButton("Sunrayado");
        txtPantalla=new JTextField("no se que escribir");
        
        c1.setSize(70,50);
        c1.setLocation(10,150);
        c2.setSize(70,50);
        c2.setLocation(90,150);
        c3.setSize(70,50);
        c3.setLocation(170,150);
        c4.setSize(70,50);
        c4.setLocation(250,150);
        c5.setSize(70,50);
        c5.setLocation(330,150);
        l1.setSize(87,50);
        l1.setLocation(10,250);
        l2.setSize(87,50);
        l2.setLocation(107,250);
        l3.setSize(87,50);
        l3.setLocation(204,250);
        l4.setSize(87,50);
        l4.setLocation(301,250);
        N.setSize(126,50);
        N.setLocation(10,350);
        C.setSize(126,50);
        C.setLocation(146,350);
        S.setSize(116,50);
        S.setLocation(282,350);
        txtPantalla.setSize(390,100);
        txtPantalla.setLocation(10,20);
        txtPantalla.setFont(new Font("Arial",Font.PLAIN,30));

        c1.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setForeground(Color.red);
            }
        });
        c2.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setForeground(Color.green);
            }
        });
        c3.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setForeground(Color.blue);
            }
        });
        c4.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setForeground(Color.yellow);
            }
        });
        c5.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setForeground(Color.black);
            }
        });
        l1.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setFont(new Font("Arial",Font.PLAIN,30));
            }
        });
        l2.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
            }
        });
        l3.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setFont(new Font("Forte",Font.PLAIN,30));
            }
        });
        l4.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setFont(new Font("Chiller",Font.PLAIN,30));
            }
        });
        N.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                 txtPantalla.setFont(txtPantalla.getFont().deriveFont(Font.BOLD,40));
            }
        });
        C.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                   txtPantalla.setFont(txtPantalla.getFont().deriveFont(Font.ITALIC,40));
            }
        });
        S.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                line = txtPantalla.getFont().getAttributes();
                line.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
                txtPantalla.setFont(txtPantalla.getFont().deriveFont(line));
              
            }
        });
        
        setLayout(null);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(N);
        add(C);
        add(S);
        add(txtPantalla);
        
        txtPantalla.setEditable(false);
        
        setSize(410,450);//tamano de la pantalla
        Toolkit tk;
        tk=Toolkit.getDefaultToolkit ();
        Dimension tamPant=tk.getScreenSize();
        setLocation((tamPant.width-getSize().width)/2,(tamPant.height-getSize().height)/2);
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
