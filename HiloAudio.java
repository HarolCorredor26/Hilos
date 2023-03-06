import javax.sound.sampled.*;

public class HiloAudio implements Runnable {
    @Override
    public void run() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("C:/Users/harol/OneDrive/Escritorio/Hilos/Cancion.wav "));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}