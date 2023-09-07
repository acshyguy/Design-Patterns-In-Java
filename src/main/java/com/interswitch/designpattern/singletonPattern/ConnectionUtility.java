package com.interswitch.designpattern.singletonPattern;

public enum ConnectionUtility {
    INSTANCE;
    public  String getValue(){
        return "This is a value";
    }
}
