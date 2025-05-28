package MediaPlayer;

public class PodcastPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Podcast is playing");
    }

    @Override
    public void pause() {
        System.out.println("Podcast is paused");
    }

    @Override
    public void stop() {
        System.out.println("Podcast is stopped");
    }
}
