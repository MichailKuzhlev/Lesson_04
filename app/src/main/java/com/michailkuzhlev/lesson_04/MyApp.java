package com.michailkuzhlev.lesson_04;

import android.app.Application;

public class MyApp extends Application {
    public static int currentTheme=R.style.my_themes_Space_Gray;

    @Override
    public void onCreate(){
        super.onCreate();
    }
}
