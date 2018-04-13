package com.poudlard.workshop.poudlard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FormQst extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_qst);
    }
    public void GotoHome(View v){
        System.out.println("Acces au profil");
        Intent Intent = new Intent(FormQst.this, HomeInt.class);
        startActivity(Intent);
    }
}
