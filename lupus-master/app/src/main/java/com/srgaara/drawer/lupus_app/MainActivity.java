package com.srgaara.drawer.lupus_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.home_button:
                Intent myIntent = new Intent(v.getContext(), resultados.class);
                startActivityForResult(myIntent, 0);
                break;
            case R.id.anadir_diario_button:
                Intent myIntent2 = new Intent(v.getContext(), analisisDiario.class);
                startActivityForResult(myIntent2, 0);
                break;
            case R.id.ayuda_button:
                Intent myIntent3 = new Intent(v.getContext(), ayudaAjustes.class);
                startActivityForResult(myIntent3, 0);
                break;
            case R.id.Resultados_button:
                Intent myIntent4 = new Intent(v.getContext(), ayudaAjustes.class);
                startActivityForResult(myIntent4, 0);
                break;
        }
    }
}
