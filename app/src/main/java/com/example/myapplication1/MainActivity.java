package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnAdd, btnSubtract, btnDevide, btnMultiply;
EditText edit1, edit2;
TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDevide = findViewById(R.id.btnDevide);
        btnMultiply = findViewById(R.id.btnMultiply);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        txtResult = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Add(Integer.parseInt(edit1.getText().toString()),Integer.parseInt(edit2.getText().toString()));
                txtResult.setText("sum of "+edit1.getText().toString()+" and "+edit2.getText().toString()+" is "+ sum);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sub = Subtract(Integer.parseInt(edit1.getText().toString()),Integer.parseInt(edit2.getText().toString()));
                txtResult.setText("sum of "+edit1.getText().toString()+" and "+edit2.getText().toString()+" is "+ sub);
            }
        });

        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dev = Devide(Integer.parseInt(edit1.getText().toString()),Integer.parseInt(edit2.getText().toString()));
                txtResult.setText("sum of "+edit1.getText().toString()+" and "+edit2.getText().toString()+" is "+ dev);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul = Multiply(Integer.parseInt(edit1.getText().toString()),Integer.parseInt(edit2.getText().toString()));
                txtResult.setText("sum of "+edit1.getText().toString()+" and "+edit2.getText().toString()+" is "+ mul);
            }
        });
    }

    int Add(int a, int b) {
        return a+b;
    }

    int Subtract(int a, int b) {
        return a-b;
    }

    int Devide(int a, int b) {
        return a/b;
    }

    int Multiply(int a, int b) {
        return a*b;
    }
}