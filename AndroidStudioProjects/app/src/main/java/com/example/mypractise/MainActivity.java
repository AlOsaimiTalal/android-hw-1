package com.example.mypractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.annotation.SuppressLint;
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

        getSupportActionBar().hide(); // I did it :)


        EditText num1 = findViewById(R.id.FirstNum);
        EditText num2 = findViewById(R.id.SecondNum);
        EditText num3 = findViewById(R.id.ThirdNum);
        EditText num4 = findViewById(R.id.FourthNum);
        Button   calc = findViewById(R.id.Calc);
        TextView res = findViewById(R.id.result);
        Button reset = findViewById(R.id.reset);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble( num1.getText().toString());
                double b = Double.parseDouble( num2.getText().toString());
                double c = Double.parseDouble( num3.getText().toString());
                double d = Double.parseDouble( num4.getText().toString());
                double numA = a*0.15;
                double numB = b*0.25;
                double numC = c*0.30;
                double numD = d*0.30;
                double all = numA + numB + numC + numD;
                 System.out.println("///"+all);
                 res.setText("result "+all+"");


                  reset.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View view) {
                          num1.setText(null);
                          num2.setText(null);
                          num3.setText(null);
                          num4.setText(null);
                          res.setText("result");

                      }
                  });


            }

        });


















    }
}