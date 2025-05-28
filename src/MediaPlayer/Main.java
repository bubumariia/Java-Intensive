package MediaPlayer;

public class Main {
    public static void main(String[] args) {
        /*AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();*/
        Playable player;

        player = new AudioPlayer();
        player.play();
        player.pause();
        player.stop();

       player = new VideoPlayer();
       player.play();
       player.pause();
       player.stop();

       player = new PodcastPlayer();
       player.play();
       player.pause();
       player.stop();


    }
}
