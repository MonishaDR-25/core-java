package in.moni.external;

import in.moni.internal.Sensor;

public class MotioSensor extends Sensor {
    @Override
    public void detect() {
        System.out.println("Motion sensor detecting movement");
    }

    public void triggerAlarm() {
        System.out.println("Motion sensor triggering alarm");
    }
}
