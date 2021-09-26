package com.kuliahdhevan.measurementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SquareActivity extends AppCompatActivity {
    EditText lengthEdt;
    EditText widthEdt;
    TextView areaResultLabel, perimeterResultLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        lengthEdt = findViewById(R.id.diameterEdt);
        widthEdt = findViewById(R.id.heightEdt);
        areaResultLabel = findViewById(R.id.areaResultLabel);
        perimeterResultLabel = findViewById(R.id.perimeterResultLabel);
    }

    public void handleCalculateSquareButton(View view) {
        double length = Double.parseDouble(lengthEdt.getText().toString());
        double width = Double.parseDouble(widthEdt.getText().toString());
        double area = length * width;
        double perimeter = (length * 2) + (area * 2);
        areaResultLabel.setText(Double.toString(area));
        perimeterResultLabel.setText(Double.toString(perimeter));
    }
}