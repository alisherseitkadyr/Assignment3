public class SmartHomeFacade {
    private Light lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light lights, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        lights.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.turnOff();
        System.out.println("All systems are set for leaving home.");
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        lights.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        System.out.println("Welcome home! Systems are adjusted.");
    }

    public void nightMode() {
        System.out.println("Activating Night Mode...");
        lights.turnOff();
        thermostat.setTemperature(20);
        securitySystem.arm();
        entertainmentSystem.turnOff();
        System.out.println("Night mode is ON.");
    }

    public void movieMode() {
        System.out.println("Activating Movie Mode...");
        lights.turnOff();
        thermostat.setTemperature(22);
        entertainmentSystem.setMovieMode();
        System.out.println("Enjoy your movie!");
    }
}
