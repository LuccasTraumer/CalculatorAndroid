package com.example.calcser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
     btnSum, btnSub, btnDiv, btnMult,btnDot,
     btnClear, btnEquals;

     TextView tvResult;

    private double valueOne,result,valueTwo = 0;
    private String operationSelect = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons of Values
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnDot = (Button)findViewById(R.id.btnDot);

        // Buttons of Operations
        btnSum = (Button)findViewById(R.id.btnSum);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnMult = (Button)findViewById(R.id.btnMult);
        // Another operations
        btnClear = (Button)findViewById(R.id.btnClear);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        tvResult = (TextView)findViewById(R.id.tvResult);

        // get clicks on buttons

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+".");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(btn1.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() +"9");
            }
        });

        // get click for operations

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult == null){
                    tvResult.setText("");
                }else{
                    valueOne = Double.parseDouble(tvResult.getText()+"");
                    operationSelect = "sum";
                    tvResult.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult == null){
                    tvResult.setText("");
                }else{
                    valueOne = Double.parseDouble(tvResult.getText()+"");
                    operationSelect = "sub";
                    tvResult.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult == null){
                    tvResult.setText("");
                }else{
                    valueOne = Double.parseDouble(tvResult.getText()+"");
                    operationSelect = "div";
                    tvResult.setText(null);
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult == null){
                    tvResult.setText("");
                }else{
                    valueOne = Double.parseDouble(tvResult.getText()+"");
                    operationSelect = "mul";
                    tvResult.setText(null);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                valueOne = 0;
                valueTwo = 0;
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Double.parseDouble(tvResult.getText()+"");

                if(operationSelect.equals("sum")){
                    result = valueOne + valueTwo;
                    tvResult.setText(result+"");
                    operationSelect="";
                }
                else if(operationSelect.equals("sub")){
                    result = valueOne -valueTwo;
                    tvResult.setText(result+"");
                    operationSelect="";
                }
                else if(operationSelect.equals("mul")){
                    result = valueOne*valueTwo;
                    tvResult.setText(result+"");
                    operationSelect="";
                }
                else if(operationSelect.equals("div")){
                    result = valueOne / valueTwo;
                    tvResult.setText(result+"");
                    operationSelect="";
                }
                else {
                    tvResult.setText("INVALID OPERATION");
                }
            }
        });

    }
}
