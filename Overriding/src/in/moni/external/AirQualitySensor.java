package in.moni.external;

import in.moni.internal.SensorDevice;

public class AirQualitySensor extends SensorDevice {
    @Override
    public void monitor() {
        System.out.println("Monitoring air quality");
    }

    public void reportPollutionLevel() {
        System.out.println("Reporting pollution levels");
    }
}
