package com.example.resistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    Button b4Bandas, b5Bandas, b6Bandas;            //Elección del numero de bandas

    Button Cafeb1,Rojob1,Naranjab1,Amarillob1,Verdeb1,Azulb1,Moradob1,Grisb1,Blancob1;              //Colores de la banda 1
    Button Negrob2,Cafeb2,Rojob2,Naranjab2,Amarillob2,Verdeb2,Azulb2,Moradob2,Grisb2,Blancob2;      //Colores de la banda 2
    Button Negrob3,Cafeb3,Rojob3,Naranjab3,Amarillob3,Verdeb3,Azulb3,Moradob3,Grisb3,Blancob3;      //Colores de la banda 3
    Button Negrob4,Cafeb4,Rojob4,Naranjab4,Amarillob4,Verdeb4,Azulb4,Doradob4,Plateadob4;           //Colores de la banda 4
    Button Cafeb5,Rojob5,Doradob5,Plateadob5;                                                       //Colores de la banda 5
    Button Cafeb6,Rojob6,Naranjab6,Amarillob6,Azulb6,Moradob6,Blancob6;                              //Colores de la banda 6
    Button bInv1,bInv2;

    TextView tValor,tColor1,tColor2,tColor3,tColor4,tColor5,tColor6;

    LinearLayout Layout3,Layout4,Layout5,Layout6;

    String Num,Num1="1",Num2="0",Num3,Medida,Tol,PPM,Temp;

    Double Aux;
    int b4=1,b5=0,b6=0;

    int N4 =0,C4=0,R4=0,NA4=0,A4=0,V4=0,AZ4=0,D4=0,P4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tValor = (TextView) findViewById(R.id.tValor);
        tColor1 = (TextView)findViewById(R.id.tColor1);
        tColor2 = (TextView) findViewById(R.id.tColor2);
        tColor3 = (TextView) findViewById(R.id.tColor3);
        tColor4 = (TextView) findViewById(R.id.tColor4);
        tColor5 = (TextView) findViewById(R.id.tColor5);
        tColor6 = (TextView) findViewById(R.id.tColor6);

        Cafeb1 = (Button) findViewById(R.id.Cafeb1);
        Rojob1 = (Button) findViewById(R.id.Rojob1);
        Naranjab1 = (Button) findViewById(R.id.Naranjab1);
        Amarillob1 = (Button) findViewById(R.id.Amarillob1);
        Verdeb1 = (Button) findViewById(R.id.Verdeb1);
        Azulb1 = (Button) findViewById(R.id.Azulb1);
        Moradob1 = (Button) findViewById(R.id.Moradob1);
        Grisb1 = (Button) findViewById(R.id.Grisb1);
        Blancob1 = (Button) findViewById(R.id.Blancob1);

        Negrob2= (Button)findViewById(R.id.Negrob2);
        Cafeb2 = (Button) findViewById(R.id.Cafeb2);
        Rojob2 = (Button) findViewById(R.id.Rojob2);
        Naranjab2 = (Button) findViewById(R.id.Naranjab2);
        Amarillob2 = (Button) findViewById(R.id.Amarillob2);
        Verdeb2 = (Button) findViewById(R.id.Verdeb2);
        Azulb2 = (Button) findViewById(R.id.Azulb2);
        Moradob2 = (Button) findViewById(R.id.Moradob2);
        Grisb2 = (Button) findViewById(R.id.Grisb2);
        Blancob2 = (Button) findViewById(R.id.Blancob2);

        Negrob3= (Button)findViewById(R.id.Negrob3);
        Cafeb3 = (Button) findViewById(R.id.Cafeb3);
        Rojob3 = (Button) findViewById(R.id.Rojob3);
        Naranjab3 = (Button) findViewById(R.id.Naranjab3);
        Amarillob3 = (Button) findViewById(R.id.Amarillob3);
        Verdeb3 = (Button) findViewById(R.id.Verdeb3);
        Azulb3 = (Button) findViewById(R.id.Azulb3);
        Moradob3 = (Button) findViewById(R.id.Moradob3);
        Grisb3 = (Button) findViewById(R.id.Grisb3);
        Blancob3 = (Button) findViewById(R.id.Blancob3);

        Negrob4= (Button)findViewById(R.id.Negrob4);
        Cafeb4 = (Button) findViewById(R.id.Cafeb4);
        Rojob4 = (Button) findViewById(R.id.Rojob4);
        Naranjab4 = (Button) findViewById(R.id.Naranjab4);
        Amarillob4 = (Button) findViewById(R.id.Amarillob4);
        Verdeb4 = (Button) findViewById(R.id.Verdeb4);
        Azulb4 = (Button) findViewById(R.id.Azulb4);
        Doradob4 = (Button) findViewById(R.id.Doradob4);
        Plateadob4 = (Button) findViewById(R.id.Plateadob4);

        Cafeb5 = (Button) findViewById(R.id.Cafeb5);
        Rojob5 = (Button) findViewById(R.id.Rojob5);
        Doradob5 = (Button) findViewById(R.id.Doradob5);
        Plateadob5 = (Button) findViewById(R.id.Plateadob5);

        Cafeb6 = (Button) findViewById(R.id.Cafeb6);
        Rojob6 = (Button) findViewById(R.id.Rojob6);
        Naranjab6 = (Button) findViewById(R.id.Naranjab6);
        Amarillob6 = (Button) findViewById(R.id.Amarillob6);
        Azulb6 = (Button) findViewById(R.id.Azulb6);
        Moradob6 = (Button) findViewById(R.id.Moradob6);
        Blancob6 = (Button) findViewById(R.id.Blancob6);

        b4Bandas = (Button) findViewById(R.id.b4Bandas);
        b5Bandas = (Button) findViewById(R.id.b5Bandas);
        b6Bandas = (Button) findViewById(R.id.b6Bandas);

        Layout3 = (LinearLayout) findViewById(R.id.Layout3);
        Layout4 = (LinearLayout) findViewById(R.id.Layout4);
        Layout5 = (LinearLayout) findViewById(R.id.Layout5);
        Layout6 = (LinearLayout) findViewById(R.id.Layout6);

        bInv1 = (Button) findViewById(R.id.bInv1);
        bInv2 = (Button) findViewById(R.id.bInv2);

        Layout3.setVisibility(View.GONE);
        Layout4.setVisibility(View.VISIBLE);
        Layout5.setVisibility(View.VISIBLE);
        Layout6.setVisibility(View.GONE);
        Verdeb4.setVisibility(View.VISIBLE);
        Azulb4.setVisibility(View.VISIBLE);
        bInv1.setVisibility(View.GONE);
        bInv2.setVisibility(View.GONE);
        tColor3.setVisibility(View.GONE);
        tColor6.setVisibility(View.GONE);

        Num1 = "1";
        Num2 = "0";
        Medida = " Ω";
        Tol = " ±5%";
        tValor.setText(Num1+""+Num2+""+Medida+""+Tol);
        tColor1.setBackgroundColor(Color.argb(255,139,69,19));
        tColor2.setBackgroundColor(Color.BLACK);
        tColor4.setBackgroundColor(Color.BLACK);
        tColor5.setBackgroundColor(Color.argb(255,245,216,49));
    }
    public void click(View v) {

        int id =v.getId();

        switch (id){
            case R.id.Cafeb1:Num1 = "1";
                tColor1.setBackgroundColor(Color.argb(255,139,69,19));break;
            case R.id.Rojob1:Num1 = "2";
                tColor1.setBackgroundColor(Color.RED);break;
            case R.id.Naranjab1:Num1 = "3";
                tColor1.setBackgroundColor(Color.argb(255,255,165,0));break;
            case R.id.Amarillob1:Num1 = "4";
                tColor1.setBackgroundColor(Color.YELLOW);break;
            case R.id.Verdeb1:Num1 = "5";
                tColor1.setBackgroundColor(Color.argb(255,0,128,0));break;
            case R.id.Azulb1:Num1 = "6";
                tColor1.setBackgroundColor(Color.BLUE);break;
            case R.id.Moradob1:Num1 = "7";
                tColor1.setBackgroundColor(Color.argb(255,128,0,128));break;
            case R.id.Grisb1:Num1 = "8";
                tColor1.setBackgroundColor(Color.GRAY);break;
            case R.id.Blancob1:Num1 = "9";
                tColor1.setBackgroundColor(Color.WHITE);break;
            case R.id.Negrob2:Num2 = "0";
                tColor2.setBackgroundColor(Color.BLACK);break;
            case R.id.Cafeb2:Num2 = "1";
                tColor2.setBackgroundColor(Color.argb(255,139,69,19));break;
            case R.id.Rojob2:Num2 = "2";
                tColor2.setBackgroundColor(Color.RED);break;
            case R.id.Naranjab2:Num2 = "3";
                tColor2.setBackgroundColor(Color.argb(255,255,165,0));break;
            case R.id.Amarillob2:Num2 = "4";
                tColor2.setBackgroundColor(Color.YELLOW);break;
            case R.id.Verdeb2:Num2 = "5";
                tColor2.setBackgroundColor(Color.argb(255,0,128,0));break;
            case R.id.Azulb2:Num2 = "6";
                tColor2.setBackgroundColor(Color.BLUE);break;
            case R.id.Moradob2:Num2 = "7";
                tColor2.setBackgroundColor(Color.argb(255,128,0,128));break;
            case R.id.Grisb2:Num2 = "8";
                tColor2.setBackgroundColor(Color.GRAY);break;
            case R.id.Blancob2:Num2 = "9";
                tColor2.setBackgroundColor(Color.WHITE);break;
            case R.id.Negrob3:Num3 = "0";
                tColor3.setBackgroundColor(Color.BLACK);break;
            case R.id.Cafeb3:Num3 = "1";
                tColor3.setBackgroundColor(Color.argb(255,139,69,19));break;
            case R.id.Rojob3:Num3 = "2";
                tColor3.setBackgroundColor(Color.RED);break;
            case R.id.Naranjab3:Num3 = "3";
                tColor3.setBackgroundColor(Color.argb(255,255,165,0));break;
            case R.id.Amarillob3:Num3 = "4";
                tColor3.setBackgroundColor(Color.YELLOW);break;
            case R.id.Verdeb3:Num3 = "5";
                tColor3.setBackgroundColor(Color.argb(255,0,128,0));break;
            case R.id.Azulb3:Num3 = "6";
                tColor3.setBackgroundColor(Color.BLUE);break;
            case R.id.Moradob3:Num3 = "7";
                tColor3.setBackgroundColor(Color.argb(255,128,0,128));break;
            case R.id.Grisb3:Num3 = "8";
                tColor3.setBackgroundColor(Color.GRAY);break;
            case R.id.Blancob3:Num3 = "9";
                tColor3.setBackgroundColor(Color.WHITE);break;
            case R.id.Negrob4:
                N4 = 1;
                C4 = R4 = NA4 = A4 = V4 = AZ4 = D4 = P4 = 0;
                tColor4.setBackgroundColor(Color.BLACK);break;
            case R.id.Cafeb4:
                C4 = 1;
                N4 = R4 = NA4 = A4 = V4 = AZ4 = D4 = P4 = 0;
                tColor4.setBackgroundColor(Color.argb(255,139,69,19));break;
            case R.id.Rojob4:
                R4 = 1;
                N4 = C4 = NA4 = A4 = V4 = AZ4 = D4 = P4 = 0;
                tColor4.setBackgroundColor(Color.RED);break;
            case R.id.Naranjab4:
                NA4 = 1;
                N4 = C4 = R4 = A4 = V4 = AZ4 = D4 = P4 = 0;
                tColor4.setBackgroundColor(Color.argb(255,255,165,0));break;
            case R.id.Amarillob4:
                A4 = 1;
                N4 = C4 = R4 = NA4 = V4 = AZ4 = D4 = P4 = 0;
                tColor4.setBackgroundColor(Color.YELLOW);break;
            case R.id.Verdeb4:
                V4 = 1;
                N4 = C4 = R4 = NA4 = A4 = AZ4 = D4 = P4 = 0;
                tColor4.setBackgroundColor(Color.argb(255,0,128,0));break;
            case R.id.Azulb4:
                AZ4 = 1;
                N4 = C4 = R4 = NA4 = A4 = V4 = D4 = P4 = 0;
                tColor4.setBackgroundColor(Color.BLUE);break;
            case R.id.Doradob4:
                D4 = 1;
                N4 = C4 = R4 = NA4 = A4 = V4 = AZ4 = P4 = 0;
                tColor4.setBackgroundColor(Color.argb(255,245,216,49));break;
            case R.id.Plateadob4:
                P4 = 1;
                N4 = C4 = R4 = NA4 = A4 = V4 = AZ4 = D4 = 0;
                tColor4.setBackgroundColor(Color.argb(255,192,192,192));break;
            case R.id.Cafeb5:
                Tol = " ±1%";
                tColor5.setBackgroundColor(Color.argb(255,139,69,19));break;
            case R.id.Rojob5:
                Tol = " ±2%";
                tColor5.setBackgroundColor(Color.RED);break;
            case R.id.Doradob5:
                Tol = " ±5%";
                tColor5.setBackgroundColor(Color.argb(255,245,216,49));break;
            case R.id.Plateadob5:
                Tol = " ±10%";
                tColor5.setBackgroundColor(Color.argb(255,192,192,192));break;
            case R.id.Cafeb6:
                PPM = " 100ppm/K";
                tColor6.setBackgroundColor(Color.argb(255,139,69,19));break;
            case R.id.Rojob6:
                PPM = " 50ppm/K";
                tColor6.setBackgroundColor(Color.RED);break;
            case R.id.Naranjab6:
                PPM = " 15ppm/K";
                tColor6.setBackgroundColor(Color.argb(255,255,165,0));break;
            case R.id.Amarillob6:
                PPM = " 25ppm/K";
                tColor6.setBackgroundColor(Color.YELLOW);break;
            case R.id.Azulb6:
                PPM = " 10ppm/K";
                tColor6.setBackgroundColor(Color.BLUE);break;
            case R.id.Moradob6:
                PPM = " 5ppm/K";
                tColor6.setBackgroundColor(Color.argb(255,128,0,128));break;
            case R.id.Blancob6:
                PPM = " 1ppm/K";
                tColor6.setBackgroundColor(Color.WHITE);break;
            case R.id.b4Bandas:
                Layout3.setVisibility(View.GONE);
                Layout4.setVisibility(View.VISIBLE);
                Layout5.setVisibility(View.VISIBLE);
                Layout6.setVisibility(View.GONE);
                Verdeb4.setVisibility(View.VISIBLE);
                Azulb4.setVisibility(View.VISIBLE);
                bInv1.setVisibility(View.GONE);
                bInv2.setVisibility(View.GONE);
                tColor3.setVisibility(View.GONE);
                tColor6.setVisibility(View.GONE);

                tColor1.setBackgroundColor(Color.argb(255,139,69,19));
                tColor2.setBackgroundColor(Color.BLACK);
                tColor4.setBackgroundColor(Color.BLACK);
                tColor5.setBackgroundColor(Color.argb(255,245,216,49));

                b4=1;
                b5=b6=0;

                Num1 = "1";
                Num2 = "0";
                Medida = " Ω";
                Tol = " ±5%";
                N4=C4=R4=NA4=A4=V4=AZ4=D4=P4=0;
                break;
            case R.id.b5Bandas:
                Layout3.setVisibility(View.VISIBLE);
                Layout4.setVisibility(View.VISIBLE);
                Layout5.setVisibility(View.VISIBLE);
                Layout6.setVisibility(View.GONE);
                Verdeb4.setVisibility(View.GONE);
                Azulb4.setVisibility(View.GONE);
                bInv1.setVisibility(View.VISIBLE);
                bInv2.setVisibility(View.VISIBLE);
                tColor3.setVisibility(View.VISIBLE);
                tColor6.setVisibility(View.GONE);

                tColor1.setBackgroundColor(Color.argb(255,139,69,19));
                tColor2.setBackgroundColor(Color.BLACK);
                tColor3.setBackgroundColor(Color.BLACK);
                tColor4.setBackgroundColor(Color.BLACK);
                tColor5.setBackgroundColor(Color.argb(255,245,216,49));

                b5=1;
                b4=b6=0;

                Num1 = "1";
                Num2 = "0";
                Num3 = "0";
                Medida = " Ω";
                Tol = " ±5%";

                N4=C4=R4=NA4=A4=V4=AZ4=D4=P4=0;
                break;
            case R.id.b6Bandas:
                Layout3.setVisibility(View.VISIBLE);
                Layout4.setVisibility(View.VISIBLE);
                Layout5.setVisibility(View.VISIBLE);
                Layout6.setVisibility(View.VISIBLE);
                Verdeb4.setVisibility(View.GONE);
                Azulb4.setVisibility(View.GONE);
                bInv1.setVisibility(View.VISIBLE);
                bInv2.setVisibility(View.VISIBLE);
                tColor6.setVisibility(View.VISIBLE);
                tColor3.setVisibility(View.VISIBLE);

                tColor1.setBackgroundColor(Color.argb(255,139,69,19));
                tColor2.setBackgroundColor(Color.BLACK);
                tColor3.setBackgroundColor(Color.BLACK);
                tColor4.setBackgroundColor(Color.BLACK);
                tColor5.setBackgroundColor(Color.argb(255,245,216,49));
                tColor6.setBackgroundColor(Color.argb(255,139,69,19));

                b6=1;
                b4=b5=0;

                Num1 = "1";
                Num2 = "0";
                Num3 = "0";
                Medida = " Ω";
                Tol = " ±5%";
                PPM = " 100ppm/K";

                N4=C4=R4=NA4=A4=V4=AZ4=D4=P4=0;
                break;
        }
        if(b4==1){
            if (N4 == 1){
                Num = (Num1+""+Num2);
                Medida = " Ω";
            }
            else if (C4 == 1){
                Temp = (Num1+""+Num2);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 10;
                Num = String.valueOf(Aux);
                Medida = " Ω";
            }
            else if (R4 == 1){
                Temp = (Num1+""+Num2);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
                Medida = " KΩ";
            }
            else if (NA4 == 1){
                Num = (Num1+""+Num2);
                Medida = " KΩ";
            }
            else if (A4 == 1){
                Temp = (Num1+""+Num2);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 10;
                Num = String.valueOf(Aux);
                Medida = " KΩ";
            }
            else if (V4 == 1){
                Temp = (Num1+""+Num2);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
                Medida = " MΩ";
            }
            else if (AZ4 == 1){
                Num = (Num1+""+Num2);
                Medida = " MΩ";
            }
            else if (D4 == 1){
                Temp = (Num1+""+Num2);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
                Medida = " Ω";
            }
            else if (P4 == 1){
                Temp = (Num1+""+Num2);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.01;
                Num = String.valueOf(Aux);
                Medida = " Ω";
            }
            else{
                Num = (Num1+""+Num2);
            }
            tValor.setText(Num+""+Medida+""+Tol);
        }
        else if (b5 == 1) {
            if (N4 == 1){
                Num = (Num1+""+Num2+""+Num3);
                Medida = " Ω";
            }
            else if (C4 == 1){
                Medida = " KΩ";
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.01;
                Num = String.valueOf(Aux);
            }
            else if (R4 == 1){
                Medida = " KΩ";
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
            }
            else if (NA4 == 1){
                Medida = " KΩ";
                Num = (Num1+""+Num2+""+Num3);
            }
            else if (A4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.01;
                Num = String.valueOf(Aux);
                Medida = " MΩ";
            }
            else if (V4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
                Medida = " MΩ";
            }
            else if (AZ4 == 1){
                Num = (Num1+""+Num2+""+Num3);
                Medida = " MΩ";
            }
            else if (D4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
                Medida = " Ω";
            }
            else if (P4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.01;
                Num = String.valueOf(Aux);
                Medida = " Ω";
            }
            else{
                Num = (Num1+""+Num2+""+Num3);
            }
            tValor.setText(Num+""+Medida+""+Tol);
        }
        else if (b6==1){
            if (N4 == 1){
                Num = (Num1+""+Num2+""+Num3);
                Medida = " Ω";
            }
            else if (C4 == 1){
                Medida = " KΩ";
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.01;
                Num = String.valueOf(Aux);
            }
            else if (R4 == 1){
                Medida = " KΩ";
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
            }
            else if (NA4 == 1){
                Medida = " KΩ";
                Num = (Num1+""+Num2+""+Num3);
            }
            else if (A4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.01;
                Num = String.valueOf(Aux);
                Medida = " MΩ";
            }
            else if (V4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
                Medida = " MΩ";
            }
            else if (AZ4 == 1){
                Num = (Num1+""+Num2+""+Num3);
                Medida = " MΩ";
            }
            else if (D4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.1;
                Num = String.valueOf(Aux);
                Medida = " Ω";
            }
            else if (P4 == 1){
                Temp = (Num1+""+Num2+""+Num3);
                Aux = Double.parseDouble(Temp);
                Aux = Aux * 0.01;
                Num = String.valueOf(Aux);
                Medida = " Ω";
            }
            else{
                Num = (Num1+""+Num2+""+Num3);
            }
            tValor.setText(Num+""+Medida+""+Tol+""+PPM);
        }
    }
}