package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double[]  calc  ;
    boolean equal = false;
    boolean exit;
    boolean div;
    boolean mult;
    boolean sum;
    boolean res;
    double resultado;
    boolean twoexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =(TextView) findViewById(R.id.textView);
        Button button0 =(Button) findViewById(R.id.button0);
        Button button1 =(Button) findViewById(R.id.button1);
        Button button2 =(Button) findViewById(R.id.button2);
        Button button3 =(Button) findViewById(R.id.button3);
        Button button4 =(Button) findViewById(R.id.button4);
        Button button5 =(Button) findViewById(R.id.button5);
        Button button6 =(Button) findViewById(R.id.button6);
        Button button7 =(Button) findViewById(R.id.button7);
        Button button8 =(Button) findViewById(R.id.button8);
        Button button9=(Button) findViewById(R.id.button9);
        Button button10 =(Button) findViewById(R.id.button10);
        Button button11 =(Button) findViewById(R.id.button11);
        Button button12 =(Button) findViewById(R.id.button12);
        Button button13 =(Button) findViewById(R.id.button13);
        Button button14 =(Button) findViewById(R.id.button14);
        Button button15 =(Button) findViewById(R.id.button15);


        do {


            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0]=0.0;
                    String textcalc= Double.toString( calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0]=1.0;
                    String textcalc= Double.toString( calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0]=2.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0]=3.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0]=4.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0] = 5.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0] = 6.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0] = 7.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0] = 8.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[0] = 9.0;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc);
                }

            });
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sum = true;
                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc+"+");
                    exit=true;
                }

            });

            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    res=true;
                    String textcalc= Double.toString(calc[0]);
                    textView.setText(textcalc+"-");
                    exit=true;
                }

            });

            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mult=true;
                    String textcalc= Double.toString(calc[0]);
                    textView.setText(textcalc+"*");
                    exit=true;
                }

            });

            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String textcalc= Double.toString(calc[0]) ;
                    textView.setText(textcalc+"/");
                    div=true;
                    exit=true;
                }

            });







        }while(exit);



        do {


            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1]=0.0;
                    String textcalc= Double.toString( calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1]=1.0;
                    String textcalc= Double.toString( calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1]=2.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1]=3.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1]=4.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1] = 5.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1] = 6.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1] = 7.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1] = 8.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calc[1] = 9.0;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc);
                }

            });
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sum = true;
                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc+"+");
                    exit=true;
                }

            });

            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    res=true;
                    String textcalc= Double.toString(calc[1]);
                    textView.setText(textcalc+"-");
                    exit=true;
                }

            });

            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mult=true;
                    String textcalc= Double.toString(calc[1]);
                    textView.setText(textcalc+"*");
                    exit=true;
                }

            });

            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String textcalc= Double.toString(calc[1]) ;
                    textView.setText(textcalc+"/");
                    div=true;
                    exit=true;
                }

            });

            button14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(sum){
                       double resultado= calc[0]+calc[1];


                    }

                    if(res){
                        double resultado= calc[0]-calc[1];


                    }

                    if(div){
                        double resultado= calc[0]/calc[1];


                    }

                    if(mult){
                        double resultado= calc[0]*calc[1];


                    }



                    String restextcalc= Double.toString(resultado) ;
                    textView.setText(restextcalc);

                    twoexit=true;
                }

            });







        }while(twoexit);






    }
}