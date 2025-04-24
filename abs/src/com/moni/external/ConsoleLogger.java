package com.moni.external;

import com.moni.internal.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Logging to Console");
    }
}
