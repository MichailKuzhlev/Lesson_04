package com.michailkuzhlev.lesson_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.my_themes_Space_Gray);
        setContentView(R.layout.activity_main);
    }
}