package in.moni.external;

import in.moni.internal.SensorDevice;

public class SensorTester {
    public void testSensor(SensorDevice sensor) {
        if (sensor != null) {
            sensor.monitor();
            if (sensor instanceof AirQualitySensor) {
                AirQualitySensor air = (AirQualitySensor) sensor;
                air.reportPollutionLevel();
            } else {
                System.err.println("Not air quality sensor");
            }
        } else {
            System.err.println("Sensor is null");
        }
    }
}
