package class20;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis=new FileInputStream("/Users/tahmin/IdeaProjects/JavaBasics/src/main/java/class20/Ambient-music-free.mp3");
        Player mp3player=new Player(fis);
        mp3player.play();

    }
}
