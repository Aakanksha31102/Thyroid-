package com.example.thyroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class activity_test extends AppCompatActivity {
    CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12;
    Button submit;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ch1=findViewById(R.id.ch1);
        ch1=findViewById(R.id.ch2);
        ch1=findViewById(R.id.ch3);
        ch1=findViewById(R.id.ch4);
        ch1=findViewById(R.id.ch5);
        ch1=findViewById(R.id.ch6);
        ch1=findViewById(R.id.ch7);
        ch1=findViewById(R.id.ch8);
        ch1=findViewById(R.id.ch9);
        ch1=findViewById(R.id.ch10);
        ch1=findViewById(R.id.ch11);
        ch1=findViewById(R.id.ch12);
        submit=findViewById(R.id.submit);
        txt=findViewById(R.id.txt);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chkb1=ch1.getText().toString();
                String chkb2=ch2.getText().toString();
                String chkb3=ch3.getText().toString();
                String chkb4=ch4.getText().toString();
                String chkb5=ch5.getText().toString();
                String chkb6=ch6.getText().toString();
                String chkb7=ch7.getText().toString();
                String chkb8=ch8.getText().toString();
                String chkb9=ch9.getText().toString();
                String chkb10=ch10.getText().toString();
                String chkb11=ch11.getText().toString();
                String chkb12=ch12.getText().toString();

                if(ch1.isChecked() || ch5.isChecked() || ch6.isChecked() || ch7.isChecked() || ch8.isChecked() || ch9.isChecked() || ch10.isChecked() || ch11.isChecked() || ch12.isChecked())
                {
                    txt.setText("You need to take a test ");

                }
                else {
                   txt.setText("You don't need to take a test ");
                }
            }
        });

    }
}