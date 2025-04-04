package Weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Report report = new Report(weather);
        report.displayReport();
    }
}
