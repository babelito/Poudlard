package com.poudlard.workshop.poudlard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FormTxt extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_txt);
    }
    public void GotoProfil(View v){
        System.out.println("Acces au profil");
        Intent Intent = new Intent(FormTxt.this, ProfilView.class);
        startActivity(Intent);
    }
    public void returnHome(View v){
        System.out.println("Acces au profil");
        Intent Intent = new Intent(FormTxt.this, HomeInt.class);
        startActivity(Intent);
    }
}