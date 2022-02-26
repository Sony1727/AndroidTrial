package com.example.trialapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    AppCompatButton b1,b2;
    String getstudentname,getRollno,getpercentage,getlogin,getgotoregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.number);
        ed3=(EditText) findViewById(R.id.percent);
        b1=(AppCompatButton) findViewById(R.id.login);
        b2=(AppCompatButton) findViewById(R.id.gotoregister);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getstudentname=ed1.getText().toString();
                getRollno=ed1.getText().toString();
                getpercentage=ed1.getText().toString();
                getlogin=ed1.getText().toString();
                getgotoregister=ed1.getText().toString();

                Toast.makeText(getApplicationContext(),getstudentname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getRollno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getpercentage, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getlogin, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getgotoregister, Toast.LENGTH_SHORT).show();








            }
        });

    }
}