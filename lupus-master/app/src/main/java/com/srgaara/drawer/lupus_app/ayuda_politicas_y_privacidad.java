package com.srgaara.drawer.lupus_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class ayuda_politicas_y_privacidad extends AppCompatActivity
{
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda_politicas_y_privacidad);

        WebView algo = (WebView) findViewById(R.id.webview);
        algo.getSettings().setJavaScriptEnabled(true);
        algo.getSettings().setBuiltInZoomControls(true);
        algo.loadUrl("https://rentealo.com/aviso-de-privacidad");
    }
    public void ViewPLogin(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ayuda_politicas_y_privacidad.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ayudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
}
