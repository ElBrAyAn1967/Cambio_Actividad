package com.example.proyecto71;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ventana2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
    }
    public void Cambio2(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void Cambio3(View view){
        Intent intent = new Intent(this,Ventana3.class);
        startActivity(intent);
    }
}