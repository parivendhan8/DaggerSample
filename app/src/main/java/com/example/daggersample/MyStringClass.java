package com.example.daggersample;

public class MyStringClass implements MyString_Interface {

    String name;

    public MyStringClass() {

        name = "MY FIRST STRING";
    }

    @Override
    public String getMYstring() {

        return name;
    }
}
