package GameBanGa;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Chicken {
    int x;
    int y;
    Image[] images = {
            Loader.getImage("1.png"),
            Loader.getImage("2.png"),
            Loader.getImage("3.png"),
            Loader.getImage("4.png"),
            Loader.getImage("5.png")
    };
    int index = 0;
    int instance = 1; // van toc move cua ga
    int a;
    int count;
    int countCreate;

    public Chicken() {
        y = - images[index].getHeight(null);
        Random rd = new Random();
        x = MyFrame.W_FRAME - images[index].getWidth(null);
        x = rd.nextInt(x);
        a = rd.nextInt(3) + 1;
    }
    void draw(Graphics2D g2d){
        g2d.drawImage(images[index],x,y,null); // ve phuong thuc move
    }

    void move(){
        count++;
        if(count >= 5){
            index++;
            if(index >= images.length){
                index = 0;
            }
            count = 0;
        }

        y+= a;
        x += instance * a; // doi chieu
        if(y > MyFrame.H_FRMAE){
            y = - images[index].getHeight(null);
        }
        if(x <= 0 || x > MyFrame.W_FRAME - images[index].getWidth(null)){
            instance = instance * -1; //dao chieu
        }
    }

    void createMoney(ArrayList<Money> arrMoney){
        countCreate++;
        if(countCreate < 10){
            return;
        }
        countCreate = 0;
        int xT = x + images[index].getWidth(null) / 2;
        int yT = y + images[index].getHeight(null);
        arrMoney.add(new Money(xT,yT)); // tao ra vi tri ban dau cua tien
    }
}
