package com.example.emi_calculator;

import  androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn4,btn5,btn7,btn8,btn2,btn9;
    TextView txt5;
    EditText edt1,edt2,edt4,edt5,edt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        initClick();

    }

    void initBinding()
    {

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        edt4 = findViewById(R.id.edt4);
        edt5 = findViewById(R.id.edt5);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    void initClick()
    {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String amountdata = edt1.getText().toString();
                String interestdata = edt2.getText().toString();
                String monthdata = edt3.getText().toString();
                String yeardata = edt4.getText().toString();

                int amount = Integer.parseInt(amountdata);
                int interest = Integer.parseInt(interestdata);
                int  year= Integer.parseInt(yeardata);
                int  month= Integer.parseInt(monthdata);

                int  MonthlyEmi = (amount*interest*month)/100;
                int  TotalInterest = (amount*interest*month*year)/100;;
                int Emi =(amount*interest*month)/100;
                int TotalPayment = (amount+TotalInterest);


                edt5.setText(""+Emi);
                btn7.setText(""+MonthlyEmi);
                btn8.setText(""+TotalInterest);
                btn9.setText(""+TotalPayment);
            }
        });
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String data = edt1.getText().toString();
               edt1.setText("");


               String reset = edt2.getText().toString();
               edt2.setText("");


               String period = edt3.getText().toString();
               edt3.setText("");


               String year = edt4.getText().toString();
               edt4.setText("");


               String emi = edt5.getText().toString();
               edt5.setText("");





           }
       });

    }
}