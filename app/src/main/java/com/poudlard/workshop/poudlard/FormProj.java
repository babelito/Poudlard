package com.poudlard.workshop.poudlard;

import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FormProj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_projet);
    }
    public void GoProfil(View v){
        System.out.println("Acces au profil");
        Intent Intent = new Intent(FormProj.this, ProfilView.class);
        startActivity(Intent);
    }
    public void GoHome(View v){
        System.out.println("Home...");
        Intent Intent = new Intent(FormProj.this, HomeAdm.class);
        startActivity(Intent);
    }
}