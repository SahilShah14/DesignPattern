package SmartHomeSystem;

public class DoorLock extends Device {
    private boolean locked;

    public DoorLock(String id) {
        super(id, "door");
        this.locked = false; // Initially unlocked
    }

    @Override
    public void turnOn() {
        locked = true;
        isOn = true; // Set the device state to "On"
        System.out.println("Door " + id + " is Locked.");
    }

    @Override
    public void turnOff() {
        locked = false;
        isOn = false; // Set the device state to "Off"
        System.out.println("Door " + id + " is Unlocked.");
    }

    @Override
    public String getStatus() {
        return locked ? "Locked" : "Unlocked";
    }
}
