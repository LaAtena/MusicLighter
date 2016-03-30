package com.example.aneta.musiclighter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LighterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new LighterView(this));
    }
}
