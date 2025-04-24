package com.moni.external;

import com.moni.internal.Logger;

public class LogApp {
    private Logger logger;

    public LogApp(Logger logger) {
        this.logger = logger;
    }

    public void writeLog() {
        if (this.logger != null) {
            System.out.println("Writing log in LogApp");
            this.logger.log();
        } else {
            System.err.println("Logger is null");
        }
    }
}
