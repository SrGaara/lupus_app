package com.srgaara.drawer.lupus_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class analisisDiario extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analisis_diario);
    }
    public void ViewADHome(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewADAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ayudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewADAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), analisisDiario.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewADResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), resultados.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewADToast(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
    }
}
