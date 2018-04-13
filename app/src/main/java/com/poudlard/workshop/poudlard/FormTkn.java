package com.poudlard.workshop.poudlard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FormTkn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_token);
    }
    public void goprofil(View v){
        System.out.println("Acces au profil");
        Intent Intent = new Intent(FormTkn.this, ProfilView.class);
        startActivity(Intent);
    }
    public void gohome(View v){
        System.out.println("Acces Home");
        Intent Intent = new Intent(FormTkn.this, HomeInt.class);
        startActivity(Intent);
    }
}