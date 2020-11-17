package GameBanGa;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Loader {
    public static Image getImage(String name){
        Image img = new ImageIcon(
                new Loader().getClass()
                        .getResource("/Image/"+ name)
        ).getImage();
        return img;
    }

    public static  void playAudio(String name){
        try {
            File f = new File("src/Image/" +name);
            AudioFormat targetFormat;
            AudioInputStream sourceStream;
            AudioInputStream stream = AudioSystem.getAudioInputStream(f);
            Clip c = AudioSystem.getClip();
            c.open(stream);
            c.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
