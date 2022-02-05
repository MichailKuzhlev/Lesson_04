package com.michailkuzhlev.lesson_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MyApp.currentTheme);
        setContentView(R.layout.activity_main);

        ((RadioButton) findViewById(R.id.materialRadioButtonSpaceGray)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.materialRadioButtonGreen)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.materialRadioButtonBlue)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.materialRadioButtonRed)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.materialRadioButtonSpaceGray:{
                MyApp.currentTheme=R.style.my_themes_Space_Gray;
                break;
            }
            case R.id.materialRadioButtonGreen:{
                MyApp.currentTheme=R.style.my_themes_green;

                break;
            }
            case R.id.materialRadioButtonBlue:{
                MyApp.currentTheme=R.style.my_themes_blue;
                break;
            }
            case R.id.materialRadioButtonRed:{
                MyApp.currentTheme=R.style.my_themes_Red;
                break;
            }
        }
        recreate();

    }
}