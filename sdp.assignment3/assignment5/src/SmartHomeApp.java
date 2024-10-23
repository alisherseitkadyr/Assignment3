public class SmartHomeApp {
    public static void main(String[] args) {
        Light lights = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHome = new SmartHomeFacade(lights, thermostat, securitySystem, entertainmentSystem);

        smartHome.arriveHome();
        System.out.println();

        smartHome.movieMode();
        System.out.println();

        smartHome.nightMode();
        System.out.println();

        smartHome.leaveHome();
    }
}
