package com.example.parcialiiii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText edad;
    private Button calcular;
    TextView resultado;
    private Button reco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    edad=(EditText)findViewById(R.id.edtxtEdad);
    reco=(Button)findViewById(R.id.btnsiguiente);
    nombre=(EditText)findViewById(R.id.edtxtNombre);
    calcular=(Button)findViewById(R.id.btnCalcular);
    resultado=(TextView) findViewById(R.id.txtresultado);
    calcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Double edadd=Double.parseDouble(edad.getText().toString());

         Double fcardiaca=220-edadd;
         resultado.setText("Estimado "+nombre.getText()+" su frecuencia cardiaca maxima es de: "+fcardiaca.toString());
            resultado.setVisibility(View.VISIBLE);
        }
    });

    reco.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent pantalla2 = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(pantalla2);

        }
    });










    }
}