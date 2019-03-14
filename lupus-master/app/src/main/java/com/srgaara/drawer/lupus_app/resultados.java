package com.srgaara.drawer.lupus_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class resultados extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.home_button3:
                Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
                break;
            case R.id.resultados_button2:
                Intent myIntent2 = new Intent(v.getContext(), resultados.class);
                startActivityForResult(myIntent2, 0);
                break;
            case R.id.ayuda_button3:
                Intent myIntent3 = new Intent(v.getContext(), ayudaAjustes.class);
                startActivityForResult(myIntent3, 0);
                break;
            case R.id.anadir_diario_button3:
                //Intent myIntent4 = new Intent(v.getContext(), calculatorActivity.class); //<- estos 2 silenciados son para invocar otra clase (abrir otro layout basicamente)
                //startActivityForResult(myIntent4, 0);
                Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button:
                //Intent myIntent5 = new Intent(v.getContext(), calculatorActivity.class);
                //startActivityForResult(myIntent5, 0);
                Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                //Intent myIntent6 = new Intent(v.getContext(), calculatorActivity.class);
                //startActivityForResult(myIntent6, 0);
                Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                //Intent myIntent7 = new Intent(v.getContext(), calculatorActivity.class);
                //startActivityForResult(myIntent7, 0);
                Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
