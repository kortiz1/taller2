package com.example.android.taller2;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {


    private TextView v_x_und;
    private TextView result;
    private EditText cant;
    private Spinner genero;
    private Spinner marca;
    private Spinner tipos;
    private String op[];
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        v_x_und = (TextView)findViewById(R.id.lblResultado1);
        result = (TextView)findViewById(R.id.lblResultado);
        cant = (EditText)findViewById(R.id.TxtCant);


        genero = (Spinner) findViewById(R.id.cmbGenero);
        resources = this.getResources();
        op = resources.getStringArray(R.array.generos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        genero.setAdapter(adapter);

        marca = (Spinner) findViewById(R.id.cmbMarca);
        op = resources.getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        marca.setAdapter(adapter1);

        tipos = (Spinner) findViewById(R.id.cmbTipo);
        op = resources.getStringArray(R.array.tipos);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        tipos.setAdapter(adapter2);
    }


    public void Calcular(View v)                {
        int p = 0, opcion1, opcion2, opcion3;
        double resultado = 0;
        result.setText("");
        if (Validar()) {

            opcion1 = genero.getSelectedItemPosition();
            opcion2 = marca.getSelectedItemPosition();
            opcion3 = tipos.getSelectedItemPosition();

            if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

                p = 0; //ok

            }  else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

                p = 1; //ok
            }

            else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

                p = 2; //ok
            }

            else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

                p = 3; //ok
            }

            else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

                p = 4; //ok
            }

            else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

                p = 5; //ok

            }  else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

                p = 6; //ok

            }  else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

                p = 7; //ok
            }

            else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

                p = 8; //ok
            }

            else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

                p = 9; //ok
            }

            else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

                p = 10; //ok
            }

            else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

                p = 11;
            }



            switch (p) {

                case 0:
                    resultado = (120) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("120 MIL PESOS");
                    break;

                case 1:
                    resultado = (50) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("50 MIL PESOS");
                    break;

                case 2:
                    resultado = (140) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("140 MIL PESOS");
                    break;

                case 3:
                    resultado = (80) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("80 MIL PESOS");
                    break;

                case 4:
                    resultado = (130) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("130 MIL PESOS");
                    break;

                case 5:
                    resultado = (100) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("100 MIL PESOS");
                    break;

                case 6:
                    resultado = (100) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("100 MIL PESOS");
                    break;

                case 7:
                    resultado = (60) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("60 MIL PESOS");
                    break;

                case 8:
                    resultado = (130) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("130 MIL PESOS");
                    break;

                case 9:
                    resultado = (70) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("70 MIL PESOS");
                    break;

                case 10:
                    resultado = (110) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("110 MIL PESOS");
                    break;

                case 11:
                    resultado = (120) * Integer.parseInt(cant.getText().toString());
                    v_x_und.setText("120 MIL PESOS");
                    break;

            }

            result.setText("" + String.format("%.2f", resultado));
        }
    }


        public void Borrar (View v) {

        v_x_und.setText("");
        result.setText("");
        cant.setText("");
        genero.setSelection(0);
        marca.setSelection(0);
        tipos.setSelection(0);
        cant.requestFocus();

    }

    public boolean Validar(){

        if(cant.getText().toString().isEmpty()){
            cant.setError("DIGITE UN VALOR");
            return false;
        }


        return true;
    }

}
