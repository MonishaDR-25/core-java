package com.moni.external;

import com.moni.internal.Jdbc;

public class MysqlJdbc implements Jdbc {
    @Override
    public void save(){
        System.out.println("Save is running in MysqlJdbc");
    }
}
