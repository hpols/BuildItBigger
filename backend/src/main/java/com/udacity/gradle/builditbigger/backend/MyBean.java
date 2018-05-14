package com.udacity.gradle.builditbigger.backend;

import com.example.android.javalib.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;
    private Joker joker;

    public String getData() {
        return joker.getJoke();
    }

    public void setData(String data) {
        myData = data;
    }
}