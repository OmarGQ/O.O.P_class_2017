
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;

/**
 *
 * @author Redes
 */
public class cal extends JFrame
{
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,btnPunto, btnMas, btnMenos, btnPor, btnEntre, btnIgual, btnC, binario,octal,decimal,hexadecimal;
    private JTextField txtpantalla;
    private boolean banOperation, banPunto, banExtra;
    private int operacion, bin, cd, i;
    private double a, b;
    String c="";
    public String extras ()
    {
        if(banExtra==true)
        {
        bin=Integer.parseInt(txtpantalla.getText());
        cd=bin;
        switch(i)
        {
            case 1: return Integer.toBinaryString(bin);
            case 2: return Integer.toOctalString(bin);
            case 3: return Integer.toHexString(bin);
            case 4: return String.valueOf(bin);
        }
        }
        switch(i)
        {
            case 1: return Integer.toBinaryString(cd);
            case 2: return Integer.toOctalString(cd);
            case 3: return Integer.toHexString(cd);
            case 4: return String.valueOf(cd);
        }
        return "";
    }
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
    public cal ()
    {
        super ();
        i = 4;
        banOperation=true;
        banPunto=true;
        banExtra=true;
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
        binario=new JButton("binario");
        octal=new JButton("octal");
        decimal=new JButton("decimal");
        hexadecimal=new JButton("hexadecimal");
        
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
        binario.setSize(140,50);
        binario.setLocation(250,100);
        octal.setSize(140,50);
        octal.setLocation(250,160);
        decimal.setSize(140,50);
        decimal.setLocation(250,280);
        hexadecimal.setSize(140,50);
        hexadecimal.setLocation(250,220);
        txtpantalla.setSize (380,70);
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
               c="";
               i=0;
               banOperation=true;
               banPunto=true;
               banExtra=true;
               txtpantalla.setText("0.0");
            } 
        });
       binario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
              i=1;
              c=extras();
              banExtra=false;
              txtpantalla.setText(String.valueOf(c));
              btn0.setEnabled(true);
              btn1.setEnabled(true);
              btn2.setEnabled(false);
              btn3.setEnabled(false);
              btn4.setEnabled(false);
              btn5.setEnabled(false);
              btn6.setEnabled(false);
              btn7.setEnabled(false);
              btn8.setEnabled(false);
              btn9.setEnabled(false);
              btnMas.setEnabled(false);
              btnMenos.setEnabled(false);
              btnPor.setEnabled(false);
              btnEntre.setEnabled(false);
              btnPunto.setEnabled(false);
              btnIgual.setEnabled(false);
            }    
       });
       octal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                i=2;
                c=extras();
                banExtra=false;
                txtpantalla.setText(String.valueOf(c));
                btn0.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btnMas.setEnabled(false);
                btnMenos.setEnabled(false);
                btnPor.setEnabled(false);
                btnEntre.setEnabled(false);
                btnPunto.setEnabled(false);
                btnIgual.setEnabled(false);
            }
            
        });
       hexadecimal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
              i=3;
              c=extras();
              banExtra=false;
              txtpantalla.setText(String.valueOf(c));
              btn0.setEnabled(true);
              btn1.setEnabled(true);
              btn2.setEnabled(true);
              btn3.setEnabled(true);
              btn4.setEnabled(true);
              btn5.setEnabled(true);
              btn6.setEnabled(true);
              btn7.setEnabled(true);
              btn8.setEnabled(true);
              btn9.setEnabled(true);
              btnMas.setEnabled(false);
              btnMenos.setEnabled(false);
              btnPor.setEnabled(false);
              btnEntre.setEnabled(false);
              btnPunto.setEnabled(false);
              btnIgual.setEnabled(false);
            } 
        });
         decimal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               banExtra=true;
               i=4;
               txtpantalla.setText(String.valueOf(cd));
               btn0.setEnabled(true);
               btn1.setEnabled(true);
               btn2.setEnabled(true);
               btn3.setEnabled(true);
               btn4.setEnabled(true);
               btn5.setEnabled(true);
               btn6.setEnabled(true);
               btn7.setEnabled(true);
               btn8.setEnabled(true);
               btn9.setEnabled(true);
               btnMas.setEnabled(true);
               btnMenos.setEnabled(true);
               btnPor.setEnabled(true);
               btnEntre.setEnabled(true);
               btnPunto.setEnabled(true);
               btnIgual.setEnabled(true);
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
        add(binario);
        add(octal);
        add(decimal);
        add(hexadecimal);
        add(txtpantalla);
        setSize(400,450);//tamano de la pantalla
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
