package SmartHomeSystem;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getType() + " " + device.getId() + " added to the hub.");
    }

    public void removeDevice(Device device) {
        devices.remove(device);
        System.out.println(device.getType() + " " + device.getId() + " removed from the hub.");
    }

    public void turnOnDevice(String id) {
        for (Device device : devices) {
            if (device.getId().equals(id)) {
                device.turnOn();
            }
        }
    }

    public void turnOffDevice(String id) {
        for (Device device : devices) {
            if (device.getId().equals(id)) {
                device.turnOff();
            }
        }
    }

    public void showStatus() {
        for (Device device : devices) {
            System.out.println(device.getType() + " " + device.getId() + " is " + device.getStatus());
        }
    }
}
