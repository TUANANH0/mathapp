package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button btnPlus, btnMinus, btnDivided, btnMultiples;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText1 = findViewById(R.id.editText1);
        this.editText2 = findViewById(R.id.editText2);
        this.btnPlus = findViewById(R.id.btnPlus);
        this.btnMinus = findViewById(R.id.btnMinus);
        this.btnDivided = findViewById(R.id.btnDivided);
        this.btnMultiples = findViewById(R.id.btnMultiples);
        this.txtResult = findViewById(R.id.txtResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                txtResult.setText((num1 + num2) + "");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                txtResult.setText((num1 - num2) + "");
            }
        });

        btnMultiples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                txtResult.setText((num1 * num2) + "");
            }
        });

        btnDivided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                txtResult.setText((num1 / num2) + "");
            }
        });
    }
}