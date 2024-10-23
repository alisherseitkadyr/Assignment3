public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Advanced Remote: Mute");
        device.setVolume(0);
    }
}
