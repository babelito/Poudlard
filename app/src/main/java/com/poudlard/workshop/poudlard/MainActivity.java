package com.poudlard.workshop.poudlard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View v){
        System.out.println("login successful");
        Intent Intent = new Intent(MainActivity.this, HomeInt.class);
        startActivity(Intent);
    }
}
