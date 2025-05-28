package MediaPlayer;

public class AudioPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Something is playing");
    }
    @Override
    public void pause(){
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}
