package com.kuliahdhevan.measurementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleActivity extends AppCompatActivity {
    EditText lengthEdt;
    EditText heightEdt;
    EditText thirdSideEdt;
    TextView areaResultLabel, perimeterResultLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        lengthEdt = findViewById(R.id.diameterEdt);
        heightEdt = findViewById(R.id.heightEdt);
        thirdSideEdt = findViewById(R.id.thirdSideEdt);
        areaResultLabel = findViewById(R.id.areaResultLabel);
        perimeterResultLabel = findViewById(R.id.perimeterResultLabel);
    }
    public void handleCalculateTriangleButtonClick(View view) {
        double length = Double.parseDouble(lengthEdt.getText().toString());
        double width = Double.parseDouble(heightEdt.getText().toString());
        double thirdSide = Double.parseDouble(thirdSideEdt.getText().toString());
        double area = length * width * 0.5;
        double perimeter = length + width + thirdSide;
        areaResultLabel.setText(Double.toString(area));
        perimeterResultLabel.setText(Double.toString(perimeter));
    }
}