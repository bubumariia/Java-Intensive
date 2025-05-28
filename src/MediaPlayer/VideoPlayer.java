package MediaPlayer;

public class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopped");
    }
}
