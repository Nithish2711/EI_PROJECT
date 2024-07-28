import java.util.ArrayList;
import java.util.List;
interface WeatherSubject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
class WeatherStation implements WeatherSubject {
    private List<Observer> observers;
    private float temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}
interface Observer {
    void update(float temperature);
}
class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature updated to: " + temperature + " degrees.");
    }
}
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay display = new TemperatureDisplay();
        
        weatherStation.addObserver(display);
        weatherStation.setTemperature(25.0f);
    }
}
