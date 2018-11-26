package com.javatpoint.user.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
     Button buttonOne, buttonTwo, buttonAdd, buttonEquals, buttonClear;
     TextView textView;
    int operand1, operand2;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne=findViewById(R.id.buttonOne);
        buttonTwo=findViewById(R.id.buttonTwo);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonClear=findViewById(R.id.buttonClear);
        buttonEquals=findViewById(R.id.buttonEquals);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=textView.getText()+"1";
                textView.setText(value);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=textView.getText()+"2";
                textView.setText(value);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = textView.getText().toString();
                operand1 = Integer.parseInt(value);
                operation = "add";

                textView.setText("+");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = textView.getText().toString();
                operand2 = Integer.parseInt(value);

                textView.setText(textView.getText() + "=");

                //Perform Operation
                if (operation.equals("add"))
                {
                    int result = operand1 + operand2;
                    textView.setText(textView.getText().toString() + result);
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

    }
}
