/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Omar xv
 */
public class Splash extends JFrame{
    private Menu padre;
    private Timer tmrTiempo;
    public Splash (Menu padre)
    {
        super ();
        this.padre=padre;
        setSize(600,400);
        setLocation(100,100);
        tmrTiempo=new Timer(2000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                getPadre().setVisible(true);
                tmrTiempo.stop();
                getMe().dispose();
        }});
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tmrTiempo.start();
        setVisible(true);
    }
    public Splash getMe()
    {
        return this;
    }
    public Menu getPadre()
    {
        return padre;
    }
}
