package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void info(View v){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    public void siz(View v){
        Intent intent = new Intent(this, SIZActivity.class);
        startActivity(intent);
    }
    public void flow(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://banstra.github.io/iiCars/"));
        startActivity(browserIntent);
    }
}