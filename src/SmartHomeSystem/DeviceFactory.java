package SmartHomeSystem;

public class DeviceFactory {
    public static Device createDevice(String type, String id) {
        switch (type) {
            case "light":
                return new Light(id);
            case "thermostat":
                return new Thermostat(id, 70); // default temp 70
            case "door":
                return new DoorLock(id);
            default:
                throw new IllegalArgumentException("Unknown device type");
        }
    }
}
