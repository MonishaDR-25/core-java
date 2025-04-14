package in.moni.external;

import in.moni.internal.Alert;

public class AlertTester {
    public void test(Alert alert) {
        if (alert != null) {
            alert.notice();
            if (alert instanceof WeatherAlert) {
                WeatherAlert weather = (WeatherAlert) alert;
                weather.updateForecast();
            } else {
                System.err.println("Not a weather alert");
            }
        } else {
            System.err.println("Alert is null");
        }
    }
}
