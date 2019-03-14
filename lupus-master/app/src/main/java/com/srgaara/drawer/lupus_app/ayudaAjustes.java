package com.srgaara.drawer.lupus_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ayudaAjustes extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda_ajustes);
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.home_button5:
                Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
                break;
            case R.id.anadir_diario_button6:
                Intent myIntent2 = new Intent(v.getContext(), analisisDiario.class);
                startActivityForResult(myIntent2, 0);
                break;
            case R.id.resultados_button4:
                Intent myIntent3 = new Intent(v.getContext(), resultados.class);
                startActivityForResult(myIntent3, 0);
                break;
            case R.id.ayuda_button5:
                Intent myIntent4 = new Intent(v.getContext(), ayudaAjustes.class);
                startActivityForResult(myIntent4, 0);
                break;
        }
    }
}
