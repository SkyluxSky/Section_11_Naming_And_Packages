package com.skyluxsky;

import java.awt.*;//AWT = abstract window toolkit!
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    //Constructor
    public MyWindow(String title) {
        super(title);
        setSize(500,140);//Window Size

        //When you click on the close icon it will close out of the program.
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //Method that draws the screen.
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);//Sets Fonts
        g.drawString("I am typing in a program on GNU/Gentoo Linux", 60,60);//Draws on Window

        g.setFont(sansSerifSmall);//Sets Fonts
        g.drawString("This is my favorite thing to do in Computer Programming", 60,100);//Draws on Window
    }
}
