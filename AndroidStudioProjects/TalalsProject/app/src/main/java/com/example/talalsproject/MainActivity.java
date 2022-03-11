package com.example.talalsproject;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText FirstNumber = findViewById(R.id.num1);
        EditText SecondNumber = findViewById(R.id.num2);

        Button calc = findViewById(R.id.calc);
        TextView tot = findViewById(R.id.total);




        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(FirstNumber.getText().toString());
                int y = Integer.parseInt(SecondNumber.getText().toString());
                int z = x+y;
                System.out.println("///"+ z);
                tot.setText(z+"");

            }
        });










    }


}