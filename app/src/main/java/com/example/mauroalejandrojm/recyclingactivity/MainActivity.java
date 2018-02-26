package com.example.mauroalejandrojm.recyclingactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<information> data = new ArrayList<>();
        String[] titulo = getResources().getStringArray(R.array.data);
        for (int i= 0; i < titulo.length; i++){
            information info = new information(titulo[i]);
            data.add(info);
        }
    }
}
