package SmartHomeSystem;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        // Create devices using Factory pattern
        Device light1 = DeviceFactory.createDevice("light", "1");
        Device thermostat1 = DeviceFactory.createDevice("thermostat", "2");
        Device door1 = DeviceFactory.createDevice("door", "3");

        // Add devices to the hub
        hub.addDevice(light1);
        hub.addDevice(thermostat1);
        hub.addDevice(door1);

        // Control devices using proxy
        DeviceProxy proxy = new DeviceProxy(hub);
        proxy.controlDevice("1", "on");
        proxy.controlDevice("3", "on"); // Lock the door

        // Show device status
        hub.showStatus();
    }
}
