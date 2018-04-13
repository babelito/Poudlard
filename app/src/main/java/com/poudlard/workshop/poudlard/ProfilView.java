package com.poudlard.workshop.poudlard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ProfilView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }
    public void Return(View v){
        System.out.println("Acces au profil");
        Intent Intent = new Intent(ProfilView.this, HomeInt.class);
        startActivity(Intent);
    }
}
