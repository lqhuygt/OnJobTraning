package GameBanGa;

import GameBanGa.Loader;
import GameBanGa.MyFrame;

import java.awt.*;

public class Plane {
    int x;
    int y;
    Image image = Loader.getImage("10.png");
    int score;
    int hp;

    public Plane(){
        x = MyFrame.W_FRAME - image.getWidth(null);
        x /= 2;
        y = MyFrame.H_FRMAE - image.getHeight(null);
        hp=3;
    }

    void draw(Graphics2D g2d) {
        g2d.drawImage(image, x, y, null);
    }

    void move (int newX,int newY){
        int xR = x;
        int yR = y;
        x = newX;
        y= newY;
        if(x <=0 || x >= MyFrame.W_FRAME - image.getWidth(null)){ // case: chuot tran ra ben ngoai
            x = xR;
        }
        if(y<= 0 || y >= MyFrame.H_FRMAE - image.getHeight(null)){
            y = yR;
        }
    }
}
