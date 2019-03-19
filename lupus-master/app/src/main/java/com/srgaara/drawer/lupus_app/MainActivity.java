package com.srgaara.drawer.lupus_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }
    public void ViewPHome(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ayudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), analisisDiario.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), resultados.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPLogin(View view)
    {
        Intent myIntent = new Intent(view.getContext(), login.class);
        startActivityForResult(myIntent, 0);
    }

}
