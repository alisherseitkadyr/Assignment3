public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.togglePower();
        basicRemote.setChannel(5);
        basicRemote.setVolume(10);

        Device dvd = new DVDDevice();
        RemoteControl advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.togglePower();
        advancedRemote.setVolume(15);
        ((AdvancedRemote) advancedRemote).mute();
    }
}
