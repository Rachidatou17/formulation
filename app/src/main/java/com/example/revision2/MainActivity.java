package com.example.revision2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private TextView name;
    private TextView firstname;
    private TextView mail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);

        firstname=findViewById(R.id.prenom);

        mail=findViewById(R.id.mail);

        String Name=getIntent().getStringExtra(" my name");

        String Firstname=getIntent().getStringExtra("firstname");

        String Mail=getIntent().getStringExtra("email");

       name.setText(Name);

       firstname.setText(Firstname);

        mail.setText(Mail);

       }




    }
