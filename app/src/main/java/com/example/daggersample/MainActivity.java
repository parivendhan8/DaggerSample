package com.example.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject MyString_Interface myStringInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getComponet().inject(MainActivity.this);

        TextView textView = findViewById(R.id.textView);
        textView.setText(myStringInterface.getMYstring());


    }
}
