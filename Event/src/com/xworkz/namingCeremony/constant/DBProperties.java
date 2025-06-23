package com.xworkz.namingCeremony.constant;

public enum DBProperties {
    URL ("jdbc:mysql://localhost:3306/xworkz"),
    USER_NAME("root"),
    SECRET("moni@12345");

    private String prop;

    private DBProperties(String prop){
        this.prop=prop;
    }

    private DBProperties(){

    }


    public String getProp(){
        return prop;
    }
}
