package com.example.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylib.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car myObject = new Car();


    }
}
