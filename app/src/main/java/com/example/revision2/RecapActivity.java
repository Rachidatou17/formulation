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
    private EditText Prenom;
    private EditText email;
    private Button vider;
    private Button enregistre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        nom=findViewById(R.id.Nom);
        Prenom=findViewById(R.id.Prenom);
        email=findViewById(R.id.email);
        vider=findViewById(R.id.Vider);
        enregistre=findViewById(R.id.enregistre);
    }

    public void onclick(View view) {

        nom.setText("");
        Prenom.setText("");
        email.setText("");

    }

    public void onregister(View view) {
        String namevalue=nom.getText().toString();

        String prenomvalue=Prenom.getText().toString();

        String mailvalue=email.getText().toString();

        if(namevalue.equals("")){
            nom.setError(" le nom est obligatoire");
            nom.requestFocus();
            return;
        }
        if(prenomvalue.equals("")){
            Prenom.setError("le prenom est obligatoire");
            Prenom.requestFocus();
            return;
        }
        if(mailvalue.equals("")){
            email.setError("l'email est obligatoire");
            email.requestFocus();
            return;
        }

        Toast.makeText(this, "Vous êtes enregistrer", Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,MainActivity.class);

        intent.putExtra( " myname",namevalue);

        intent.putExtra("prenom",prenomvalue);

        intent.putExtra("email",mailvalue);

        startActivity(intent);
    }


}