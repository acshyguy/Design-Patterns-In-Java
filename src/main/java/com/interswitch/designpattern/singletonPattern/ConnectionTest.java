package com.interswitch.designpattern.singletonPattern;

public class ConnectionTest {
    public static void main(String[] args) {
        String result = ConnectionUtility.INSTANCE.getValue();
        System.out.println(result);
    }
}
