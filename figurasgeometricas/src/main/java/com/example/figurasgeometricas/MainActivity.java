package com.example.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rbTriangulo, rbCirculo, rbCuadro, rbCubo;
    EditText eCirculo, eCuadro, eTriangulo1, eTriangulo2, eTriangulo3, eCubo;
    TextView tPerimetro, tArea, tVolumen;
    Button bCalcular;
    private static final Double PI = 3.1416;
    Double rad, lado, lado1, lado2, lado3, sp, perim, area, vol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbCirculo = (RadioButton) findViewById(R.id.rbCirculo);
        rbCuadro = (RadioButton) findViewById(R.id.rbCuadro);
        rbTriangulo = (RadioButton) findViewById(R.id.rbTriangulo);
        rbCubo = (RadioButton)findViewById(R.id.rbCubo);
        eCirculo = (EditText) findViewById(R.id.eCirculo);
        eCuadro = (EditText) findViewById(R.id.eCuadro);
        eTriangulo1 = (EditText) findViewById(R.id.eTriangulo1);
        eTriangulo2 = (EditText) findViewById(R.id.eTriangulo2);
        eTriangulo3 = (EditText) findViewById(R.id.eTriangulo3);
        eCubo = (EditText) findViewById(R.id.eCubo);
        tPerimetro = (TextView) findViewById(R.id.tPerimetro);
        tArea = (TextView) findViewById(R.id.tArea);
        tVolumen = (TextView) findViewById(R.id.tVolumen);
        bCalcular = (Button) findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( !(eCirculo.getText().toString().equals("")) && eCuadro.getText().toString().equals("") && eTriangulo1.getText().toString().equals("")
                        && eTriangulo2.getText().toString().equals("") && eTriangulo3.getText().toString().equals("") && eCubo.getText().toString().equals("") ){
                    rad = Double.parseDouble(eCirculo.getText().toString());
                    perim = 2 * PI * rad;
                    area = PI * rad * rad;
                    tPerimetro.setText(String.valueOf(perim));
                    tArea.setText(String.valueOf(area));
                    tVolumen.setText("No tiene");
                }
                else if ( eCirculo.getText().toString().equals("") && !(eCuadro.getText().toString().equals("")) && eTriangulo1.getText().toString().equals("")
                        && eTriangulo2.getText().toString().equals("") && eTriangulo3.getText().toString().equals("") && eCubo.getText().toString().equals("") ){
                    lado = Double.parseDouble(eCuadro.getText().toString());
                    perim = 4 * lado;
                    area = lado * lado;
                    tPerimetro.setText(String.valueOf(perim));
                    tArea.setText(String.valueOf(area));
                    tVolumen.setText("No tiene");
                }
                else if ( eCirculo.getText().toString().equals("") && eCuadro.getText().toString().equals("") && !(eTriangulo1.getText().toString().equals("")
                        && eTriangulo2.getText().toString().equals("") && eTriangulo3.getText().toString().equals("")) && eCubo.getText().toString().equals("") ){
                    lado1 = Double.parseDouble(eTriangulo1.getText().toString());
                    lado2 = Double.parseDouble(eTriangulo2.getText().toString());
                    lado3 = Double.parseDouble(eTriangulo3.getText().toString());
                    perim = lado1 + lado2 + lado3;
                    sp = (lado1 + lado2 + lado3)/2;
                    area = Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
                    tPerimetro.setText(String.valueOf(perim));
                    tArea.setText(String.valueOf(area));
                    tVolumen.setText("No tiene");
                }
                else if ( eCirculo.getText().toString().equals("") && eCuadro.getText().toString().equals("") && eTriangulo1.getText().toString().equals("")
                        && eTriangulo2.getText().toString().equals("") && eTriangulo3.getText().toString().equals("") && !(eCubo.getText().toString().equals("")) ){
                    lado = Double.parseDouble(eCubo.getText().toString());
                    perim = 12 * lado;
                    area = 6 * lado * lado;
                    vol = lado * lado * lado;
                    tPerimetro.setText(String.valueOf(perim));
                    tArea.setText(String.valueOf(area));
                    tVolumen.setText(String.valueOf(vol));
                }
                else {
                    Toast.makeText(getApplicationContext(),"Ingrese los valores correctos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void OnRadioButtonClicked(View view){

        tPerimetro.setText("");
        tArea.setText("");
        tVolumen.setText("");
        eCirculo.setText("");
        eCuadro.setText("");
        eTriangulo1.setText("");
        eTriangulo2.setText("");
        eTriangulo3.setText("");
        eCubo.setText("");
        switch (view.getId()){
            case R.id.rbCirculo:
                if (((RadioButton) view).isChecked()){
                    eCirculo.setVisibility(View.VISIBLE);
                    eCuadro.setVisibility(View.GONE);
                    eTriangulo1.setVisibility(View.GONE);
                    eTriangulo2.setVisibility(View.GONE);
                    eTriangulo3.setVisibility(View.GONE);
                    eCubo.setVisibility(View.GONE);
                }
                break;
            case R.id.rbCuadro:
                if (((RadioButton) view).isChecked()){
                    eCirculo.setVisibility(View.GONE);
                    eCuadro.setVisibility(View.VISIBLE);
                    eTriangulo1.setVisibility(View.GONE);
                    eTriangulo2.setVisibility(View.GONE);
                    eTriangulo3.setVisibility(View.GONE);
                    eCubo.setVisibility(View.GONE);
                    eCirculo.setText("");
                    eCuadro.setText("");
                    eTriangulo1.setText("");
                    eTriangulo2.setText("");
                    eTriangulo3.setText("");
                    eCubo.setText("");
                }
                break;
            case R.id.rbTriangulo:
                if (((RadioButton) view).isChecked()){
                    eCirculo.setVisibility(View.GONE);
                    eCuadro.setVisibility(View.GONE);
                    eTriangulo1.setVisibility(View.VISIBLE);
                    eTriangulo2.setVisibility(View.VISIBLE);
                    eTriangulo3.setVisibility(View.VISIBLE);
                    eCubo.setVisibility(View.GONE);
                    eCirculo.setText("");
                    eCuadro.setText("");
                    eTriangulo1.setText("");
                    eTriangulo2.setText("");
                    eTriangulo3.setText("");
                    eCubo.setText("");
                }
                break;
            case R.id.rbCubo:
                if (((RadioButton) view).isChecked()){
                    eCirculo.setVisibility(View.GONE);
                    eCuadro.setVisibility(View.GONE);
                    eTriangulo1.setVisibility(View.GONE);
                    eTriangulo2.setVisibility(View.GONE);
                    eTriangulo3.setVisibility(View.GONE);
                    eCubo.setVisibility(View.VISIBLE);
                    eCirculo.setText("");
                    eCuadro.setText("");
                    eTriangulo1.setText("");
                    eTriangulo2.setText("");
                    eTriangulo3.setText("");
                    eCubo.setText("");
                }
                break;
        }
    }

}
