package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constmain;
        EditText height,weight;
        Button btncalculate;
        TextView result;

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        btncalculate= findViewById(R.id.btncalculate);
        result = findViewById(R.id.result);
        constmain = findViewById(R.id.constmain);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(weight.getText().toString());
                int ht = Integer.parseInt(height.getText().toString());


                double mtrht = ht/100;

                double bmi = wt/(mtrht*mtrht);
                if(bmi>25){
                    result.setText("You're over WEIGHT");
                    constmain.setBackgroundColor(getResources().getColor(R.color.ovwiet));
                }
                else if(bmi<18){
                    result.setText("You're under WEIGHT");
                    constmain.setBackgroundColor(getResources().getColor(R.color.unweit));
                }
                else {
                    result.setText("You're healthy!");
                    constmain.setBackgroundColor(getResources().getColor(R.color.healthy));
                }
            }
        });

    }
}