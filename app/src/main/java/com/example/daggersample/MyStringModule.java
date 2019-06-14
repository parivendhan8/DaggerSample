package com.example.daggersample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyStringModule {

    @Provides
    @Singleton
    public MyString_Interface getMyString()
    {
        return new MyStringClass();
    }

}
