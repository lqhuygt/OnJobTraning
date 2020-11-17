package Game_RanSanMoi;

import javax.swing.JFrame;

public class FrameScreen extends JFrame {

    GameScreen gameScreen;

    public FrameScreen(){
        gameScreen = new GameScreen();
        add(gameScreen);
    }

    public static void main(String[] args) {
        FrameScreen f = new FrameScreen();
        f.setVisible(true);
        f.setSize(500,500);
    }
}
