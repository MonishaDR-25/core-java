package com.moni.external;

import com.moni.internal.Jdbc;

public class OracleJdbc implements Jdbc {
    @Override
    public void save(){
        System.out.println("save is running in OracleJdbc");
    }
}
