package com.jacobo.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eNumero;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bSuma,bResta,bDiv,bMult,bIgual,bPunto;
    TextView tOperacion;

    String Temp,Aux,Resultado;                  //Variables temporales
    double Num,Num1=1,Num2,Num3,Num4,Sol;       //Num1 = 1, porque es la variable que se va a recargar en la multiplicación.
    int Suma=0,Resta=0,Mult=0,Div=0,Igual=0;    //Habilitadores para tener en cuenta la jerarquia de las operaciones(*,/,+,-)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tOperacion = (TextView) findViewById(R.id.tOperacion);
        eNumero = (EditText) findViewById(R.id.eNumero);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bPunto = (Button) findViewById(R.id.bPunto);
        bSuma = (Button) findViewById(R.id.bSuma);
        bResta = (Button) findViewById(R.id.bResta);
        bDiv = (Button) findViewById(R.id.bDiv);
        bMult = (Button) findViewById(R.id.bMult);
        bIgual = (Button) findViewById(R.id.bIgual);
    }

    public void click (View view){
        int id =view.getId();

        if (Igual == 1){                //Condicional para que luego de presionar la tecla = , inmediatamente vaya a
            eNumero.setText("");        //iniciar otra operación, tanto el TextView y el EditText, queden limpios
            tOperacion.setText("");     //y sin rastros de la operación anterior.
            Igual=0;
        }

        switch (id){
            case R.id.b0 :
                if (eNumero.getText().toString().equals("0")){
                    eNumero.setText("0");
                }
                else{
                    eNumero.setText(eNumero.getText().toString()+""+"0");
                }
                break;
            case R.id.b1 : eNumero.setText(eNumero.getText().toString()+""+"1");
                break;
            case R.id.b2 : eNumero.setText(eNumero.getText().toString()+""+"2");
                break;
            case R.id.b3 : eNumero.setText(eNumero.getText().toString()+""+"3");
                break;
            case R.id.b4 : eNumero.setText(eNumero.getText().toString()+""+"4");
                break;
            case R.id.b5 : eNumero.setText(eNumero.getText().toString()+""+"5");
                break;
            case R.id.b6 : eNumero.setText(eNumero.getText().toString()+""+"6");
                break;
            case R.id.b7 : eNumero.setText(eNumero.getText().toString()+""+"7");
                break;
            case R.id.b8 : eNumero.setText(eNumero.getText().toString()+""+"8");
                break;
            case R.id.b9 : eNumero.setText(eNumero.getText().toString()+""+"9");
                break;
            case R.id.bPunto : eNumero.setText(eNumero.getText().toString()+""+".");
                break;
            case R.id.bMult :
                Temp = eNumero.getText().toString();
                Aux = Temp +""+ " * ";
                tOperacion.setText(tOperacion.getText()+""+Aux);    //Se encarga de actualizar la operación que se muestra en TextView.
                Num = Double.parseDouble(Temp);                     //Carga el contenido del EdiText en una variable temporal tipo Double.
                eNumero.setText("");                                //Limpia el EditText luego de presionar el botón *.
                if (Mult == 1){              //Este condicional verifica si el número entrante se multiplica
                    Num1 = Num1 * Num;       //por algún valor cargado anteriormente.
                }
                else{                        //Si el valor ingresado anteriormente, es el primero de la operación,
                    Num1 = Num;              //entonces simplemente lo guarda en un temporal.
                }                            //Num1, corresponde al temporal luego de realizar una multiplicación.
                Mult = 1;                    //Se habilita Mult, sólo es importante cuando se presiona alguno de los botones de operación.
                break;
            case R.id.bDiv :
                Temp = eNumero.getText().toString();
                Aux = Temp +""+ " / ";
                tOperacion.setText(tOperacion.getText()+""+Aux);    //Actualiza TextView.
                Num = Double.parseDouble(Temp);                     //Variable temporal encargada de operar.
                eNumero.setText("");                                //Limpia el EditText.

                if (Mult == 1) {             //Esta línea se cumple sólo si la operación que antecede a dicha división,
                    Num2 = Num1 * Num;       //es una multiplicación.
                    Mult = 0;           //Se deshabilita para no generar conflicto cuando se presione bIgual, pues la multiplicación ya se realizó.
                }
                else if (Div == 1){          //Esta línea se cumple sólo si la operación que antecede a esta división,
                    Num2 = Num2 / Num;       //es otra división
                }
                else{                        //Si el valor ingresado anteriormente, es el primero de la operación,
                    Num2 = Num;              //entonces simplemente lo guarda en un temporal.
                }                            //Num2, corresponde al temporal luego de realizar una división.
                Div = 1;                     //Se habilita Div, sólo es importante cuando se presiona alguno de los botones de operación.
                break;
            case R.id.bSuma :
                Temp = eNumero.getText().toString();
                eNumero.setText("");
                Aux = Temp +""+ " + ";
                tOperacion.setText(tOperacion.getText()+""+Aux);
                Num = Double.parseDouble(Temp);
                if (Mult == 1 && Div == 1 && Suma == 1){
                    Num3 = Num3 + (Num2 / (Num1 * Num));
                    Mult = 0;
                    Div = 0;
                }
                else if (Mult == 1 && Div == 1 && Resta == 1){
                    Num3 = Num4 - (Num2 / (Num1 * Num));
                    Mult = 0;
                    Div = 0;
                    Resta = 0;
                }
                else if (Mult == 1 && Div == 1){       //Esta línea se ejecuta sólo si a la actual operación se antecede una multiplicación,
                    Num3 = Num2 / (Num1 * Num);    //y anterior a la multiplicación hay una división. ( Ejs: 2 / 3 * 4 + ..., 9 / 3 * 4 + ...)
                    Mult = 0;           //Se deshabilita para no generar conflicto cuando se presione bIgual, pues la multiplicación ya se realizó.
                    Div = 0;
                }
                else if (Mult == 1 && Suma == 1){       //Esta línea se ejecuta sólo si a la actual operación se antecede una multiplicación,
                    Num3 = Num3 + (Num1 * Num);    //y anterior a la multiplicación hay una suma. ( Ejs: 2 + 3 * 4 + ..., 2 * 3 + 4 * 3 + ...)
                    Mult = 0;           //Se deshabilita para no generar conflicto cuando se presione bIgual, pues la multiplicación ya se realizó.
                }
                else if (Div == 1 && Suma == 1){   //Esta línea se ejecuta sólo si a la actual operación se antecede una división,
                    Num3 = Num3 + (Num2 / Num);    //y anterior a la multiplicación hay una suma. ( Ejs: 2 + 8 / 4 + ..., 6 / 3 + 4 / 2 + ...)
                    Div = 0;            //Se deshabilita para no generar conflicto cuando se presione bIgual, pues la división ya se realizó.
                }
                else if (Mult == 1){               //Esta línea se ejecuta sólo si a la actual operación se antecede una multiplicación.
                    Num3 = Num1 * Num;             //la cual viene siendo la primera del cálculo completo ( 4 * 5 + ...)
                    Mult = 0;
                }
                else if (Div == 1){                //Esta línea se ejecuta sólo si a la actual operación se antecede una división.
                    Num3 = Num2 / Num;             //la cual viene siendo la primera del cálculo completo ( 10 / 5 + ...)
                    Div = 0;
                }
                else if (Suma == 1){               //Esta línea se ejecuta sólo si a la actual operación se antecede una suma, sin embargo
                    Num3 = Num3 + Num;             //no es necesario que sea la primera del cálculo, pues posee una jerarquia menor a la * y /,
                }                                  //por lo tanto las restas y sumas anteriores a la actual se realizan sin inconveniente.
                else if (Resta == 1){              //Se ejecuta sólo si antecede una resta.
                    Num3 = Num4 - Num;
                    Resta = 0;
                }
                else {
                    Num3 = Num;                    // Sólo se ejecuta si la actual operación es la primera del cálculo (Ej = 2 + ...)
                }
                Suma = 1;
                break;
            case R.id.bResta :                    //Todos los condicionales son los mismos de la suma.
                Temp = eNumero.getText().toString();
                eNumero.setText("");
                Aux = Temp +""+ " - ";
                tOperacion.setText(tOperacion.getText()+""+Aux);
                Num = Double.parseDouble(Temp);
                if (Mult == 1 && Div == 1 && Suma == 1){
                    Num4 = Num3 + (Num2 / (Num1 * Num));
                    Mult = 0;
                    Div = 0;
                    Suma = 0;
                }
                if (Mult == 1 && Div == 1 && Resta == 1){
                    Num4 = Num4 - (Num2 / (Num1 * Num));
                    Mult = 0;
                    Div = 0;
                }
                else if (Mult == 1 && Div == 1){       //Esta línea se ejecuta sólo si a la actual operación se antecede una multiplicación,
                    Num4 = Num2 / (Num1 * Num);    //y anterior a la multiplicación hay una división. ( Ejs: 2 / 3 * 4 + ..., 9 / 3 * 4 + ...)
                    Mult = 0;           //Se deshabilita para no generar conflicto cuando se presione bIgual, pues la multiplicación ya se realizó.
                    Div = 0;
                }
                else if (Mult == 1 && Suma == 1){
                    Num4 = Num3 + (Num1 * Num);
                    Mult = 0;
                    Suma = 0;
                }
                else if (Div == 1 && Suma == 1){
                    Num4 = Num3 + (Num2 / Num);
                    Div = 0;
                    Suma = 0;
                }
                else if (Mult == 1 && Resta == 1){
                    Num4 = Num4 - (Num1 * Num);
                    Mult = 0;
                }
                else if (Div == 1 && Resta == 1){
                    Num4 = Num4 - (Num2 / Num);
                    Div = 0;
                }
                else if (Mult == 1){
                    Num4 = Num1 * Num;
                    Mult = 0;
                }
                else if (Div == 1){
                    Num4 = Num2 / Num;
                    Div = 0;
                }
                else if (Suma == 1){
                    Num4 = Num3 + Num;
                    Suma = 0;
                }
                else if (Resta == 1){
                    Num4 = Num4 - Num;
                }
                else {
                    Num4 = Num;
                }
                Resta = 1;
                break;
            case R.id.bIgual :
                Temp = eNumero.getText().toString();
                Num = Double.parseDouble(Temp);
                if (Mult == 1 && Div == 1 && Suma == 1 && Resta == 0){
                    Sol = Num3 + (Num2 / (Num1 * Num));
                }
                else if (Mult == 1 && Div == 1 && Suma == 0 && Resta == 1){
                    Sol = Num4 - (Num2 / (Num1 * Num));
                }
                else if (Mult == 1 && Div == 1 && Suma == 0 && Resta == 0){         //(Ejs: 4 + 2 * 3 = 10, 6 / 3 - 5 + 5 * 3 = 12)
                    Sol = Num3 / (Num1 * Num);                                      //[Num3 = (4), (6/3-5); Num1 = 2, 5; Num = 3, 12]
                }
                else if (Mult == 1 && Div == 0 && Suma == 1 && Resta == 0){         //(Ejs: 4 + 2 * 3 = 10, 6 / 3 - 5 + 5 * 3 = 12)
                    Sol = Num3 + (Num1 * Num);                                      //[Num3 = (4), (6/3-5); Num1 = 2, 5; Num = 3, 12]
                }
                else if (Mult == 1 && Div == 0 && Suma == 0 && Resta == 1){         //(Ejs: 3 * 2 + 4 - 2 * 3 = 4,  15 / 5 - 9 * 3 = -24)
                    Sol = Num4 - (Num1 * Num);                                      //[Num3 = (4), (6/3-5); Num1 = 2, 5; Num = 3, 12]
                }
                else if (Mult == 0 && Div == 1 && Suma == 1 && Resta == 0){         //(Ejs: 3 + 4 / 2 = 5,  3 - 5 + 9 / 3 = 1 )
                    Sol = Num3 + (Num2 / Num);                                      //[Num3 = (3), (3-5); Num2 = 4, 9; Num = 2, 3]
                }
                else if (Mult == 0 && Div == 1 && Suma == 0 && Resta == 1){
                    Sol = Num4 - (Num2 / Num);
                }
                else if (Mult == 1 && Div == 0 && Suma == 0 && Resta == 0){
                    Sol = Num1 * Num;
                }
                else if (Mult == 0 && Div == 1 && Suma == 0 && Resta == 0){
                    Sol = Num2 / Num;
                }
                else if (Mult == 0 && Div == 0 && Suma == 1 && Resta == 0){              //(Ejs: 8 / 4 * 2 + 3 - 2 = 2, 8 / 4 - 6 + 8 = 4)
                    Sol = Num3 + Num;                                               //[Num3 = (8/4*2), (8/4-6); Num = 3, 8]
                }
                else if (Mult == 0 && Div == 0 && Suma == 0 && Resta == 1){         //(Ejs: 3 * 2 + 4 / 2 - 3 = 5,  3 - 5 * 9 - 3 = -45)
                    Sol = Num4 - Num;                                               //[Num3 = (4), (6/3-5); Num1 = 2, 5; Num = 3, 12]
                }
                else {
                    Sol = 0;
                }
                Resultado = String.valueOf(Sol);
                tOperacion.setText(tOperacion.getText().toString()+""+ Temp );
                eNumero.setText(Resultado);
                Suma = Resta = Div = Mult = 0;
                Igual = 1;
                break;
            case R.id.bClean :
                tOperacion.setText("");
                eNumero.setText("");
                Num=Num2=Num3=Sol=Suma=Resta=Mult=Div=0;
                Num1=1;
                break;
        }
    }
}
