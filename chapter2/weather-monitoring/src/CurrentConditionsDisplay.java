import interfaces.Display;
import interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, Display {
    private Float temperature;
    private Float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.print("Current conditions: " + temperature + "F degreed and " + humidity + "% humidity \n");
    }
}
