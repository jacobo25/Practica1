package com.example.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePesos, eDolares;
    Button bConvertir;
    Double pesos, dolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePesos = (EditText) findViewById (R.id.ePesos);
        eDolares = (EditText) findViewById(R.id.eDolares);
        bConvertir = (Button) findViewById(R.id.bConvertir);


        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( !(eDolares.getText().toString().equals("")) && ePesos.getText().toString().equals("") ) {
                    dolares = Double.parseDouble(eDolares.getText().toString());
                    pesos = dolares * 3000;
                    ePesos.setText(String.valueOf(pesos));

                }
                if ( (eDolares.getText().toString().equals("")) && !ePesos.getText().toString().equals("") ) {
                    pesos = Double.parseDouble(ePesos.getText().toString());
                    dolares = pesos / 3000;
                    eDolares.setText(String.valueOf(dolares));
                }
                if ( eDolares.getText().toString().equals("") && ePesos.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(),"Digite un valor a convertir",Toast.LENGTH_SHORT).show();
                }
                else if ( !(eDolares.getText().toString().equals("")) && !(ePesos.getText().toString().equals("")) ) {
                    Toast.makeText(getApplicationContext(),"Rellene solo un campo",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
