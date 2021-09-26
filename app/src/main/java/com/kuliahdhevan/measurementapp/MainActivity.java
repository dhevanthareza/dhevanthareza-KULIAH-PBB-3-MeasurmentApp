package com.kuliahdhevan.measurementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleSquareBtnClick(View view) {
        Intent intent = new Intent(this, SquareActivity.class);
        startActivity(intent);
    }

    public void handleTriangleBtnClick(View view) {
        Intent intent = new Intent(this, TriangleActivity.class);
        startActivity(intent);
    }

    public void handleCircleBtnClick(View view) {
        Intent intent = new Intent(this, CircleActivity.class);
        startActivity(intent);
    }

    public void handleCubeBtnClick(View view) {
        Intent intent = new Intent(this, CubeActivity.class);
        startActivity(intent);
    }
}