package GameBanGa;

import GameBanGa.Loader;

import java.awt.*;

public class Money {
    int x;
    int y;
    Image[] images = {
            Loader.getImage("money_one.png"),
            Loader.getImage("money_two.png")
    };
    int index;
    int count;

    public Money(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(Graphics2D g2d){
        g2d.drawImage(images[index],x,y,null);
    }

    boolean move(){
        count++;
        if( count>= 5){
            index++;
            if(index >= images.length){
                index = 0;
            }
            count = 0;
        }
        y += 5;
        return  y > MyFrame.H_FRMAE;
    }
}
