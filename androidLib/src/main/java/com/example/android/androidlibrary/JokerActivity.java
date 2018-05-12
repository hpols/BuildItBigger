package com.example.android.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokerActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);
    }
}
