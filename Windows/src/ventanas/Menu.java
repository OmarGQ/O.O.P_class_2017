/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Omar xv
 */
public class Menu extends JFrame{
    private JButton btn1;
    public Menu()
    {
        super();
        btn1=new JButton();
        btn1.setLocation(100,100);
        btn1.setSize(50,50);
        setLayout(null);
        btn1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                getMe().setVisible(false);
                new Ayuda(getMe());
            }
            
        });
        add(btn1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocation(100,100);
        new Splash(this);
    }
    public Menu getMe()
    {
        return this;
    }
}