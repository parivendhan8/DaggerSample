package com.example.daggersample;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {MyStringModule.class})
@Singleton
public interface MyStringComponet {


    void inject(MainActivity mainActivity);

}
