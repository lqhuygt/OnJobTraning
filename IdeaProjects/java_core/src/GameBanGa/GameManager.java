package GameBanGa;

import GameBanGa.Chicken;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {
    Image background = Loader.getImage("background.png");
    ArrayList<Chicken> arrChiken;
    ArrayList<Money> arrMoney;
    Plane plane;

    void initGame(){ // khoi tao man game
        Loader.playAudio("background.wav"); // dinh dang file audio
        plane = new Plane();
        arrMoney = new ArrayList<>();
        arrChiken = new ArrayList<>();
        initChicken();
    }

    void initChicken(){
        for (int i = 0; i < 6; i++) {
            arrChiken.add(new Chicken());
        }
    }

    void draw(Graphics2D g2d){
        g2d.drawImage(background,0,0, MyFrame.W_FRAME, MyFrame.H_FRMAE, null);

        for (Money m : arrMoney) {
            m.draw(g2d);
        }

        for (Chicken c: arrChiken) {
            c.draw(g2d);
        }

        plane.draw(g2d);
    }

    void AI(){
        for (int i = arrChiken.size() - 1; i >= 0 ; i--) {
            arrChiken.get(i).move(); // moi lan lap ga move
            arrChiken.get(i).createMoney(arrMoney);
        }

        for (int i = arrMoney.size() - 1; i >= 0; i--) {
            boolean check = arrMoney.get(i).move();
            if(check==true){
                arrMoney.remove(i);
            }
        }
    }
}
