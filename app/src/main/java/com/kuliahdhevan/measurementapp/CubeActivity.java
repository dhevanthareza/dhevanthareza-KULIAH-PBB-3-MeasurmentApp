package com.kuliahdhevan.measurementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CubeActivity extends AppCompatActivity {
    EditText lateralEdt;
    TextView areaResultLabel, perimeterResultLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        lateralEdt = findViewById(R.id.lateralEdt);
        areaResultLabel = findViewById(R.id.areaResultLabel);
        perimeterResultLabel = findViewById(R.id.perimeterResultLabel);
    }

    public void handleCalculateButton(View view) {
        double lateral = Double.parseDouble(lateralEdt.getText().toString());
        double area = lateral * lateral * 6;
        double perimeter = 12 * lateral;
        areaResultLabel.setText(Double.toString(area));
        perimeterResultLabel.setText(Double.toString(perimeter));
    }
}