package SmartHomeSystem;

public class DeviceProxy {
    private SmartHomeHub hub;

    public DeviceProxy(SmartHomeHub hub) {
        this.hub = hub;
    }

    public void controlDevice(String id, String command) {
        if (command.equalsIgnoreCase("on")) {
            hub.turnOnDevice(id);
        } else if (command.equalsIgnoreCase("off")) {
            hub.turnOffDevice(id);
        } else {
            System.out.println("Invalid command.");
        }
    }
}
