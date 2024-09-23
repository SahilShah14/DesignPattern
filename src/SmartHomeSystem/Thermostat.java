package SmartHomeSystem;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String id, int initialTemp) {
        super(id, "thermostat");
        this.temperature = initialTemp;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Thermostat " + id + " temperature set to " + temp);
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat " + id + " is turned On.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat " + id + " is turned Off.");
    }
}
