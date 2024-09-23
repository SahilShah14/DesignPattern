package SmartHomeSystem;

public abstract class Device {
    protected String id;
    protected String type;
    protected boolean isOn;

    public Device(String id, String type) {
        this.id = id;
        this.type = type;
        this.isOn = false;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String getStatus() {
        return isOn ? "On" : "Off";
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
