package in.moni.external;

import in.moni.internal.Alert;

public class WeatherAlert extends Alert {
    @Override
    public void notice() {
        System.out.println("Sending weather alert");
    }

    public void updateForecast() {
        System.out.println("Updating weather forecast");
    }
}
