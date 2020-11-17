package GameBanGa;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame { // ke thua cua JFrame
    GraphicsDevice gd = GraphicsEnvironment
            .getLocalGraphicsEnvironment().getDefaultScreenDevice();
    static  int W_FRAME ; //kich thuoc man hinh
    static  int H_FRMAE ;
    {
        W_FRAME = gd.getDisplayMode().getWidth();
        H_FRMAE = gd.getDisplayMode().getHeight();
    }

    public  MyFrame(){
        setTitle("Ban Ga");
        setSize(W_FRAME, H_FRMAE);
        setLocation(100,100);
        setLocationRelativeTo(null); // Set window to center of the screen
        MyPanel p = new MyPanel();
        add(p);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
    }
}
