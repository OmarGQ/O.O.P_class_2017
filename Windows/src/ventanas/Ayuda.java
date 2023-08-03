/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import static java.awt.AWTEventMulticaster.add;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Omar xv
 */
public class Ayuda extends JFrame{
    private Menu padre;
    public Ayuda(Menu padre)
    {
        super();
        this.padre=padre;
        setSize(600,400);
        setLocation(100,100);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we) {
                getPadre().setVisible(true);
            }

        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
      public Menu getPadre()
    {
        return padre;
    } 
}
