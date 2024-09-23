import java.util.List;
import java.util.ArrayList;

// Observer interface
interface Observer {
    void update(int temperature);
}

// Subject interface
interface Subject {
    void attach(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers = new ArrayList<>(); // Initialize the list

    public void setTemperature(int temp) {
        this.temperature = temp;
        notifyObservers(); // Notify all observers of the change
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer); // Add observers to the list
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature); // Call update on each observer
        }
    }
}

// Concrete Observer
class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature updated: " + temperature + "°C");
    }
}

// Main class to demonstrate the Observer pattern
public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(); // Create the subject
        TemperatureDisplay display = new TemperatureDisplay(); // Create observer
        station.attach(display); // Attach observer to subject
        station.setTemperature(25); // Change temperature and notify observers
    }
}
