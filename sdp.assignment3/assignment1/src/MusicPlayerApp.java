public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "song1.mp3");

        AudioPlayer wavPlayer = new AudioAdapter("wav");
        wavPlayer.play("wav", "song2.wav");

        AudioPlayer aacPlayer = new AudioAdapter("aac");
        aacPlayer.play("aac", "song3.aac");
    }
}