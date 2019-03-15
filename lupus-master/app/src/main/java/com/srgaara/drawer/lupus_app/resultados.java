package com.srgaara.drawer.lupus_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class resultados extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);
    }
    public void ViewRHome(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ayudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), analisisDiario.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), resultados.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRBSintoma(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
    }
    public void ViewRBResultado(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();;
    }
    public void ViewRExportar(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
    }
}
