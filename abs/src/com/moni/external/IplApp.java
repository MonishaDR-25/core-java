package com.moni.external;

import com.moni.internal.Jdbc;

public class IplApp {
    private Jdbc jdbc;

    public IplApp(Jdbc jdbc) {
        this.jdbc = jdbc;
    }

    public void saveTeamInfo() {
        if (this.jdbc != null) {
            System.out.println("Running team info in IplApp");
            this.jdbc.save();
        }
        else {
            System.err.println("jdbc is null");
        }
    }
}