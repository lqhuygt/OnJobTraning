package Game_RanSanMoi;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel implements Runnable {

    int a = 0;
    Thread thread;

    public GameScreen() {
        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,500,500);
        g.setColor(Color.BLACK);
        g.fillRect(a, 10, 100, 100);
    }

    public void run() {
        while (true) {
            a++;
            repaint();
            try {
                thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }
}

