package com.example.pra2_17it019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText num1=findViewById(R.id.editText);
        final EditText num2=findViewById(R.id.editText3);
        Button Add= findViewById(R.id.add);
        Button Sub=findViewById(R.id.sub);
        Button Mul=findViewById(R.id.mul);
        Button Div=findViewById(R.id.div);
        Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                 String val1=num1.getText().toString();
                 int number1=Integer.parseInt(val1);
                 String val2=num2.getText().toString();
                 int number2=Integer.parseInt(val2);
                 int number3=number1+number2;
                Toast toast=Toast.makeText(getApplicationContext(),"Your answer is  "+number3,Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        Sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String val1=num1.getText().toString();
                int number1=Integer.parseInt(val1);
                String val2=num2.getText().toString();
                int number2=Integer.parseInt(val2);
                int number3=number1-number2;
                Toast toast=Toast.makeText(getApplicationContext(),"Your answer is  "+number3,Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        Mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String val1=num1.getText().toString();
                int number1=Integer.parseInt(val1);
                String val2=num2.getText().toString();
                int number2=Integer.parseInt(val2);
                int number3=number1*number2;
                Toast toast=Toast.makeText(getApplicationContext(),"Your answer is  "+number3,Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        Div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String val1=num1.getText().toString();
                int number1=Integer.parseInt(val1);
                String val2=num2.getText().toString();
                int number2=Integer.parseInt(val2);
                int number3=number1/number2;
                Toast toast=Toast.makeText(getApplicationContext(),"Your answer is  "+number3,Toast.LENGTH_SHORT);
                toast.show();

            }
        });



    }
}
