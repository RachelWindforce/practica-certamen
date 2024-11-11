package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    EditText Usuario, Contraseña;
    Button btn;

    ProgressBar Cargando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = findViewById(R.id.Usuario);
        Contraseña = findViewById(R.id.Contraseña);
        btn = findViewById(R.id.btnIngresar);
        Cargando = findViewById(R.id.progressBar);

    }

    public void Ingresar (View view){
        String user = Usuario.getText().toString();
        String contra = Contraseña.getText().toString();

        if (user.isEmpty() || contra.isEmpty()){
            Toast.makeText(this, "Porfavor complete todos los campos", Toast.LENGTH_SHORT).show();

        }else{
            if (user.equals("admin") && contra.equals("123456")){
                btn.setVisibility(View.INVISIBLE);
                Cargando.setVisibility(View.VISIBLE);

            }else {

                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }

        }


    }
}