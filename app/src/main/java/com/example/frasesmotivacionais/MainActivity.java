package com.example.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFrase = findViewById(R.id.textFrase);
    }

    public void frase1(View view) {
       textFrase.setText("Não fique esperando o futuro para ser feliz, faça do presente a sua alegria.");
    }

    public void frase2(View view) {
        textFrase.setText("O sucesso é a soma de pequenos esforços repetidos dia após dia.");

    }

    public void frase3(View view) {
        textFrase.setText("Você nunca sabe a força que tem, até que sua única alternativa seja ser forte.");

    }
    public void frase4(View view) {
        textFrase.setText("Amizade verdadeira é rara, mas é para a vida toda!");

    }
    }
