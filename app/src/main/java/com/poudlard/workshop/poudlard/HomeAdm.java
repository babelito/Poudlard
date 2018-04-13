package com.poudlard.workshop.poudlard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeAdm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
    }
    public void LinkProj(View v){
        System.out.println("Creation Projet");
        Intent Intent = new Intent(HomeAdm.this, FormProj.class);
        startActivity(Intent);
    }
    public void AccessProfil(View v){
        System.out.println("Acces au profil");
        Intent Intent = new Intent(HomeAdm.this, ProfilView.class);
        startActivity(Intent);
    }
}