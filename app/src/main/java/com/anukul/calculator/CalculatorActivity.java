package com.anukul.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;

    private Button addBtn;
    private Button subBtn;
    private Button mulBtn;
    private Button divBtn;

    private Button equalBtn;
    private Button clearBtn;

    private TextView no1Tv;
    private TextView no2Tv;
    private TextView answerTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        zeroBtn = findViewById(R.id.activity_calculator_zerobtn);
        oneBtn = findViewById(R.id.activity_calculator_onebtn);
        twoBtn = findViewById(R.id.activity_calculator_twobtn);
        threeBtn = findViewById(R.id.activity_calculator_threebtn);
        fourBtn = findViewById(R.id.activity_calculator_fourbtn);
        fiveBtn = findViewById(R.id.activity_calculator_fivebtn);
        sixBtn = findViewById(R.id.activity_calculator_sixbtn);
        sevenBtn = findViewById(R.id.activity_calculator_sevenbtn);
        eightBtn = findViewById(R.id.activity_calculator_eightbtn);
        nineBtn = findViewById(R.id.activity_calculator_ninebtn);

        equalBtn = findViewById(R.id.activity_calculator_equalbtn);
        clearBtn = findViewById(R.id.activity_calculator_clearbtn);

        no1Tv = findViewById(R.id.activity_calculator_no1_tv);
        no2Tv = findViewById(R.id.activity_calculator_no2_tv);


    }
}
