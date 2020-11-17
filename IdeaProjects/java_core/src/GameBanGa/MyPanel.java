package GameBanGa;

import GameBanGa.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyPanel extends JPanel {
    GameManager manager = new GameManager();

    public MyPanel(){
        manager.initGame();
        Thread t = new Thread(run);
        t.start();
        addMouseMotionListener(motion);
    }


    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d); // de ve
            manager.draw(g2d);
        }

    MouseMotionListener motion = new MouseMotionListener() {
        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            manager.plane.move(e.getX(),e.getY()); // de chuot dieu khiem may bay
        }
    };

    Runnable run = new Runnable() {
        @Override
        public void run() {
            while(true){
                manager.AI();
                repaint(); // cap nhat la vi tri ga
                try {
                    Thread.sleep(10); // ham speed cua ga
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    };
}
