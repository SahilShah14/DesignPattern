package SmartHomeSystem;

public class Light extends Device {
    public Light(String id) {
        super(id, "light");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light " + id + " is turned On.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light " + id + " is turned Off.");
    }
}
