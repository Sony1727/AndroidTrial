package com.example.trialapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1;
    String getUserName,getPassword,PrefValue;
    SharedPreferences myprefrences;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myprefrences=getSharedPreferences("loginprefrences",MODE_PRIVATE);


        ed1=(EditText)findViewById(R.id.username);
        ed2=(EditText)findViewById(R.id.password);
        b1=(AppCompatButton)findViewById(R.id.login);
        PrefValue=myprefrences.getString("username",null);
        if(PrefValue!=null)
        {
            Intent i=new Intent(getApplicationContext(),AddStudent.class);
            startActivity(i);

        }

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(getUserName.equals("abc@gmail.com")&&getPassword.equals("12345"))
                {
                    SharedPreferences.Editor myedit=myprefrences.edit();
                    myedit.putString("username",getUserName);
                    myedit.commit();

                }
              else
                  {
                    Toast.makeText(getApplicationContext(),"invalidcredentials",Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
}