public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Basic Remote: Power toggle");
        device.powerOn();
    }
}
