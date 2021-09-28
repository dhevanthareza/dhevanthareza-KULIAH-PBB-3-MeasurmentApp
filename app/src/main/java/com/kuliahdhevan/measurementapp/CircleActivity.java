package com.kuliahdhevan.measurementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {
    EditText diameterEdt;
    TextView areaResultLabel, perimeterResultLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        diameterEdt = findViewById(R.id.lengthEdt);
        areaResultLabel = findViewById(R.id.areaResultLabel);
        perimeterResultLabel = findViewById(R.id.perimeterResultLabel);
    }

    public void handleCalculateButton(View view) {
        double diameter = Double.parseDouble(diameterEdt.getText().toString());
        double area = 3.14 * (diameter / 2) * (diameter / 2);
        double perimeter = 2 * 3.14 * (diameter / 2);
        areaResultLabel.setText(Double.toString(area));
        perimeterResultLabel.setText(Double.toString(perimeter));
    }
}