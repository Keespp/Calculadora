package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvdisplay;
    double n1, n2, res;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b_cero(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "0");
    }

    public void b_doblecero(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "00");
    }

    public void b_1(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "1");
    }

    public void b_2(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "2");
    }

    public void b_3(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "3");
    }

    public void b_4(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "4");
    }

    public void b_5(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "5");
    }

    public void b_6(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "6");
    }

    public void b_7(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "7");
    }

    public void b_8(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "8");
    }

    public void b_9(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        tvdisplay.setText(tvdisplay.getText() + "9");
    }

    public void b_punto(View view) {
        tvdisplay = (TextView) findViewById(R.id.resultado);
        if(!tvdisplay.getText().toString().contains(".")){
            tvdisplay.setText(tvdisplay.getText() + ".");
        }
    }

    public void OnClickOperacionCapturaNumero1(View view){
        tvdisplay=(TextView)findViewById(R.id.resultado);
        n1=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }
    public void b_sumar(View view){
      operador="+";
      OnClickOperacionCapturaNumero1(view);
    }
    public void Restar(View view){
        operador="-";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Multiplicar(View view){
        operador="*";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Dividir(View view){
        operador="/";
        OnClickOperacionCapturaNumero1(view);
    }
    public void borrartodo(View view){
        n1=0.0;
        n2=0.0;
        tvdisplay=(TextView)findViewById(R.id.resultado);
        tvdisplay.setText("");
    }
     public void b_resultado(View view){
            tvdisplay=(TextView)findViewById(R.id.resultado);
            n2=Double.parseDouble(tvdisplay.getText().toString());
            if(operador.equals("+")){
                res=n1+n2;
            }else if (operador.equals("-")){
                res=n1-n2;
            }else if (operador.equals("*")) {
                res = n1*n2;
            }else if (operador.equals("/")) {
                res = n1/n2;
            }
            tvdisplay.setText(""+res);
        }
}