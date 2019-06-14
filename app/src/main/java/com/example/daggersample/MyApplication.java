package com.example.daggersample;

import android.app.Application;

public class MyApplication extends Application {

    MyStringComponet componet;

    @Override
    public void onCreate() {
        super.onCreate();

        componet = createMyDaggerComponent();


    }

    private MyStringComponet createMyDaggerComponent() {
        return DaggerMyStringComponet.builder()
                .myStringModule(new MyStringModule())
                .build();
    }

    public MyStringComponet getComponet() {
        return componet;
    }
}
