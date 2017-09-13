package com.adriancastano.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bSuma, bResta, bMult, bDiv, bIgual, bPunto, bCero, bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve;
    private TextView tPantalla, tPantalla2;
    private double op1, op2, result, op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSuma = (Button) findViewById(R.id.bSuma);
        bResta = (Button) findViewById(R.id.bResta);
        bMult = (Button) findViewById(R.id.bMult);
        bDiv = (Button) findViewById(R.id.bDiv);
        bIgual = (Button) findViewById(R.id.bIgual);
        bPunto = (Button) findViewById(R.id.bPunto);
        bCero = (Button) findViewById(R.id.bCero);
        bUno = (Button) findViewById(R.id.bUno);
        bDos = (Button) findViewById(R.id.bDos);
        bTres = (Button) findViewById(R.id.bTres);
        bCuatro = (Button) findViewById(R.id.bCuatro);
        bCinco = (Button) findViewById(R.id.bCinco);
        bSeis = (Button) findViewById(R.id.bSeis);
        bSiete = (Button) findViewById(R.id.bSiete);
        bOcho = (Button) findViewById(R.id.bOcho);
        bNueve = (Button) findViewById(R.id.bNueve);

        tPantalla = (TextView) findViewById(R.id.tPantalla);
        tPantalla2 = (TextView) findViewById(R.id.tPantalla2);

    }

    public void nueve(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "9");
    }

    public void ocho(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "8");
    }

    public void siete(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "7");
    }

    public void seis(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "6");
    }

    public void cinco(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "5");
    }

    public void cuatro(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "4");
    }

    public void tres(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "3");
    }

    public void dos(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "2");
    }

    public void uno(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "1");
    }

    public void cero(View view) {
        tPantalla.setText(tPantalla.getText().toString() + "0");
    }

    public void punto(View view) {
        tPantalla.setText(tPantalla.getText().toString() + ".");
    }

    public void suma(View view) {
        bSuma.setEnabled(false);
        bResta.setEnabled(false);
        bMult.setEnabled(false);
        bDiv.setEnabled(false);

        op1 = Double.parseDouble(tPantalla.getText().toString());
        tPantalla2.setText(op1 + "+");
        tPantalla.setText("");
        op = 0;
    }

    public void resta(View view) {
        bSuma.setEnabled(false);
        bResta.setEnabled(false);
        bMult.setEnabled(false);
        bDiv.setEnabled(false);

        op1 = Double.parseDouble(tPantalla.getText().toString());
        tPantalla2.setText(op1 + "-");
        tPantalla.setText("");
        op = 1;
    }

    public void multiplicacion(View view) {
        bSuma.setEnabled(false);
        bResta.setEnabled(false);
        bMult.setEnabled(false);
        bDiv.setEnabled(false);

        op1 = Double.parseDouble(tPantalla.getText().toString());
        tPantalla2.setText(op1 + "x");
        tPantalla.setText("");
        op = 2;
    }

    public void division(View view) {
        bSuma.setEnabled(false);
        bResta.setEnabled(false);
        bMult.setEnabled(false);
        bDiv.setEnabled(false);

        op1 = Double.parseDouble(tPantalla.getText().toString());
        tPantalla2.setText(op1 + "/");
        tPantalla.setText("");
        op = 3;
    }

    public void igual(View view) {
        op2 = Double.parseDouble(tPantalla.getText().toString());
        tPantalla2.setText(tPantalla2.getText().toString() + op2);

        if (op == 0)
            result = op1 + op2;
        else if (op == 1)
            result = op1 - op2;
        else if (op == 2)
            result = op1 * op2;
        else
            result = op1 / op2;

        tPantalla.setText(result + "=");

        bIgual.setEnabled(false);
        bPunto.setEnabled(false);
        bCero.setEnabled(false);
        bUno.setEnabled(false);
        bDos.setEnabled(false);
        bTres.setEnabled(false);
        bCuatro.setEnabled(false);
        bCinco.setEnabled(false);
        bSeis.setEnabled(false);
        bSiete.setEnabled(false);
        bOcho.setEnabled(false);
        bNueve.setEnabled(false);
    }

    public void limpiar(View view) {
        op1=0;
        op2=0;
        tPantalla.setText("");
        tPantalla2.setText("");

        bSuma.setEnabled(true);
        bResta.setEnabled(true);
        bMult.setEnabled(true);
        bDiv.setEnabled(true);
        bIgual.setEnabled(true);
        bPunto.setEnabled(true);
        bCero.setEnabled(true);
        bUno.setEnabled(true);
        bDos.setEnabled(true);
        bTres.setEnabled(true);
        bCuatro.setEnabled(true);
        bCinco.setEnabled(true);
        bSeis.setEnabled(true);
        bSiete.setEnabled(true);
        bOcho.setEnabled(true);
        bNueve.setEnabled(true);
    }
}
