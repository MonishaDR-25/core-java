package Weather;
import java.util.Objects;


public class Report {
    public Report(Weather weather) {
        System.out.println("Running constructor in Report");
        if (Objects.nonNull(weather)) {
            weather.forecast();
        } else {
            System.out.println("Null value occurred");
        }
    }

    public void displayReport() {
        System.out.println("Displaying detailed weather report...");
    }
}
