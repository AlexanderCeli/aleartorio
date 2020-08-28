package com.example.aleartorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtResultado;
    private EditText entrada;
    private Button btnEmpezar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView) findViewById(R.id.Resultado);
        entrada = (EditText) findViewById(R.id.entrad);

        btnEmpezar = (Button) findViewById(R.id.btnEmp);
        btnEmpezar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnEmpezar == view) {
            Lanzar();
        }
    }
    private void Lanzar() {
        Random r = new Random();
        int random = r.nextInt(Integer.parseInt(entrada.getText().toString())) + 1;
        String resultado = String.valueOf(random);
        txtResultado.setText(resultado);
    }
}