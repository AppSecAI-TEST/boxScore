package com.example.danny.boxscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int a = 10;
    int b = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    pelador a
    public void puchFaceA(View view){
        a--;
        valitedateA();
        displayPointsFighterA(a);
    }

    public void shotDownA(View view){
        a = a -3;
        valitedateA();
        displayPointsFighterA(a);
    }

    public void knockOutA(View view){
        a = 0;
        valitedateA();
        displayPointsFighterA(a);
    }

//    peleador b

    public void puchFaceB(View view){
        b--;
        valitedateB();
        displayPointsFighterB(b);
    }

    public void shotDownB(View view){
        b = b-3;
        valitedateB();
        displayPointsFighterB(b);
    }

    public void knockOutB(View view){
        b = 0;
        valitedateB();
        displayPointsFighterB(b);
    }


//    reset
    public void reset(View view){
        a=10;
        b=10;

        displayPointsFighterA(a);
        displayPointsFighterB(b);
    }


    public void valitedateA(){
        if(a < 0) {
            a = 0;
        }
    }

    public void valitedateB(){
        if(b < 0) {
            b = 0;
        }
    }

    //    mostrar
    public void displayPointsFighterA(int points){
        TextView score = (TextView) findViewById(R.id.scoreFighterA);
        score.setText(""+points);
    }

    public void displayPointsFighterB(int points){
        TextView score = (TextView) findViewById(R.id.scoreFighterB);
        score.setText(""+points);
    }
}
