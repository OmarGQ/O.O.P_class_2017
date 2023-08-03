/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Alumnos
 */
public class calculadora extends JFrame
{
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,btnPunto, btnMas, btnMenos, btnPor, btnEntre, btnIgual, btnC;
    private JTextField txtpantalla;
    private boolean banOperation, banPunto;
    private int operacion;
    private double a, b;
    public double resolver()
    {
        b=Double.parseDouble(txtpantalla.getText());
        switch(operacion)
        {
            case 1: return a+b;
            case 2: return a-b;
            case 3: return a*b;
            case 4: return a/b;
            case 0: return a;
        }
        return -1;
    }
    public calculadora ()
    {
        super ();
        banOperation=true;
        banPunto=true;
        operacion=0;
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btn0=new JButton("0");
        txtpantalla=new JTextField("0.0");
        btnPunto=new JButton(".");
        btnMas=new JButton("+");
        btnMenos=new JButton("-");
        btnPor=new JButton("*");
        btnEntre=new JButton("%");
        btnIgual=new JButton("=");
        btnC=new JButton("c");
        btn1.setSize(50,50);
        btn1.setLocation(10,100);
        btn2.setSize(50,50);
        btn2.setLocation(70,100);
        btn3.setSize(50,50);
        btn3.setLocation(130,100);
        btn4.setSize(50,50);
        btn4.setLocation(10,160);
        btn5.setSize(50,50);
        btn5.setLocation(70,160);
        btn6.setSize(50,50);
        btn6.setLocation(130,160);
        btn7.setSize(50,50);
        btn7.setLocation(10,220);
        btn8.setSize(50,50);
        btn8.setLocation(70,220);
        btn9.setSize(50,50);
        btn9.setLocation(130,220);
        btn0.setSize(110,50);
        btn0.setLocation(10,280);
        btnPunto.setSize(50,50);
        btnPunto.setLocation(130,280);
        btnMas.setSize(50,50);
        btnMas.setLocation(190,100);
        btnMenos.setSize(50,50);
        btnMenos.setLocation(190,160);
        btnPor.setSize(50,50);
        btnPor.setLocation(190,220);
        btnEntre.setSize(50,50);
        btnEntre.setLocation(190,280);
        btnIgual.setSize(170,50);
        btnIgual.setLocation(10,340);
        btnC.setSize(50,50);
        btnC.setLocation(190,340);
        txtpantalla.setSize (230,70);
        txtpantalla.setLocation(10,10);
        txtpantalla.setFont(new Font("Arial",Font.PLAIN,30));
        btn1.addActionListener(new ActionListener()//agregar acciones a los botones
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"1");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("1");
                    banOperation=false;
                }
            } 
        });
        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"2");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("2");
                    banOperation=false;
                }
            } 
        });
       btn3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"3");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("3");
                    banOperation=false;
                }
            } 
        });
       btn4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"4");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("4");
                    banOperation=false;
                }
            } 
        });
       btn5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"5");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("5");
                    banOperation=false;
                }
            } 
        });
       btn6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"6");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("6");
                    banOperation=false;
                }
            } 
        });
       btn7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"7");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("7");
                    banOperation=false;
                }
            } 
        });
       btn8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"8");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("8");
                    banOperation=false;
                }
            } 
        });
       btn9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"9");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("9");
                    banOperation=false;
                }
            } 
        });
       btn0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()>12)
                    return;
                if(banOperation==false)
                txtpantalla.setText(txtpantalla.getText()+"0");
                else
                {
                    banPunto=false;
                    txtpantalla.setText("0");
                    banOperation=true;
                }
            } 
        });
       btnPunto.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpantalla.getText().length()==0)
                    return;
                if(banPunto==false)
                {
                    banPunto=true;
                    txtpantalla.setText(txtpantalla.getText()+".");
                    if(txtpantalla.getText().equals("0."))
                     banOperation=false;   
                }
            }
        });
       btnMas.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(operacion==0)
                   a=Double.parseDouble(txtpantalla.getText());
               else
               {
                   a=resolver();
                   txtpantalla.setText(String.valueOf(a));
               }
               banOperation=true;
               operacion=1;
            } 
        });
       btnMenos.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(operacion==0)
                   a=Double.parseDouble(txtpantalla.getText());
               else
               {
                   a=resolver();
                   txtpantalla.setText(String.valueOf(a));
               }
               banOperation=true;
               operacion=2;
            } 
        });
       btnPor.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operacion==0)
                   a=Double.parseDouble(txtpantalla.getText());
               else
               {
                   a=resolver();
                   txtpantalla.setText(String.valueOf(a));
               }
               banOperation=true;
               operacion=3;
            } 
        });
       btnEntre.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operacion==0)
                   a=Double.parseDouble(txtpantalla.getText());
               else
               {
                   a=resolver();
                   txtpantalla.setText(String.valueOf(a));
               }
               banOperation=true;
               operacion=4;
            } 
        });
       btnIgual.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operacion==0)
                   a=Double.parseDouble(txtpantalla.getText());
               else
               {
                   a=resolver();
                   txtpantalla.setText(String.valueOf(a));
               }
               banOperation=true;
               operacion=0;
            } 
        });
       btnC.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
               operacion=0; 
               a=0;
               b=0;
               banOperation=true;
               banPunto=true;
               txtpantalla.setText("0.0");
            } 
        });
        setLayout(null);
        add(btn1);//agregar obgetos a la pantala
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        add(btnPunto);
        add(btnMas);
        add(btnMenos);
        add(btnPor);
        add(btnEntre);
        add(btnIgual);
        add(btnC);
        add(txtpantalla);
        setSize(260,450);//tamano de la pantalla
        Toolkit tk;
        tk=Toolkit.getDefaultToolkit ();
        Dimension tamPant=tk.getScreenSize();
        setLocation((tamPant.width-getSize().width)/2,(tamPant.height-getSize().height)/2);
        txtpantalla.setEnabled(false);
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
