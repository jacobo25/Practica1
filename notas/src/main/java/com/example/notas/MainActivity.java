package com.example.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePract, eAv1, eAv2, eAv3, eAvF;
    Button bCalcular;
    TextView tFinal;

    Double N1,N2,N3,N4,N5,P,A1,A2,A3,AF,FINAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePract = (EditText) findViewById(R.id.ePract);
        eAv1 = (EditText) findViewById(R.id.eAv1);
        eAv2 = (EditText) findViewById(R.id.eAv2);
        eAv3 = (EditText) findViewById(R.id.eAv3);
        eAvF = (EditText) findViewById(R.id.eAvF);
        bCalcular = (Button) findViewById((R.id.bCalcular));
        tFinal = (TextView) findViewById(R.id.tFinal);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( !(ePract.getText().toString().equals("") && eAv1.getText().toString().equals("") && eAv2.getText().toString().equals("")
                        && eAv3.getText().toString().equals("") && eAvF.getText().toString().equals("")) ) {

                    N1 = Double.parseDouble(ePract.getText().toString());
                    N2 = Double.parseDouble(eAv1.getText().toString());
                    N3 =Double.parseDouble(eAv2.getText().toString());
                    N4 = Double.parseDouble(eAv3.getText().toString());
                    N5 = Double.parseDouble(eAvF.getText().toString());
                    P = N1 * 0.6;
                    A1 = N2 * 0.05;
                    A2 = N3 * 0.07;
                    A3 = N4 * 0.08;
                    AF = N5 * 0.2;

                    FINAL = P+A1+A2+A3+AF;

                    tFinal.setText(String.valueOf(FINAL));

                    if ( FINAL  >= 0 && FINAL <= 1){
                        Toast.makeText(getApplicationContext(),"Estas en el lugar equivocado",Toast.LENGTH_SHORT).show();
                    }
                    else if (FINAL <=2){
                        Toast.makeText(getApplicationContext(),"Remal",Toast.LENGTH_SHORT).show();
                    }
                    else if (FINAL <= 3){
                        Toast.makeText(getApplicationContext(),"Es posible recuperarse",Toast.LENGTH_SHORT).show();
                    }
                    else if (FINAL <= 4){
                        Toast.makeText(getApplicationContext(),"Normalito",Toast.LENGTH_SHORT).show();
                    }
                    else if (FINAL <= 4.5){
                        Toast.makeText(getApplicationContext(),"Muybien",Toast.LENGTH_SHORT).show();
                    }
                    else if (FINAL <= 5){
                        Toast.makeText(getApplicationContext(),"Excelente estudiante",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Esas notas tuyas no existen",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(),"Ingrese todos las notas",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




}
