package com.example.proyecto71;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Ventana3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana3);
    }
    public void Cambio4(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}