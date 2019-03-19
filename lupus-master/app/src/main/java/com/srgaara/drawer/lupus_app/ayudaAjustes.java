package com.srgaara.drawer.lupus_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class ayudaAjustes extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda_perfil);
    }
    public void ViewAHome(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewAAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ayudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewAAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), analisisDiario.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewAResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), resultados.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewAayuda_politicas_y_privacidad(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ayuda_opciones_de_seguimiento.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewAToast(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
    }
}
