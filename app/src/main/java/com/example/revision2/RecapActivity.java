package com.example.revision2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RecapActivity extends AppCompatActivity {
    private EditText nom;
    private EditText prenom;
    private EditText email;
    private Button vider;
    private Button enregistre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        nom=findViewById(R.id.Nom);
        prenom=findViewById(R.id.prenom);
        email=findViewById(R.id.email);
        vider=findViewById(R.id.Vider);
        enregistre=findViewById(R.id.enregistre);
    }

    public void onclick(View view) {

        Toast.makeText(this, "les champs saisi sont vide", Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,RecapActivity.class);

        startActivity(intent);
    }

    public void onregister(View view) {
        String name=nom.getText().toString();

        String firstname=prenom.getText().toString();

        String mail=email.getText().toString();

        Toast.makeText(this, "Vous êtes enregistrer", Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,MainActivity.class);

        intent.putExtra(" my name",name);

        intent.putExtra("firstname",firstname);

        intent.putExtra("email",mail);

        startActivity(intent);
    }


}