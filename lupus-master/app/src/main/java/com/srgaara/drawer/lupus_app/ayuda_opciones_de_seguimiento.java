package com.srgaara.drawer.lupus_app;

import android.webkit.WebView;

public class ayuda_opciones_de_seguimiento
{
    WebView algo = (WebView) findViewById(R.id.webview);
    algo.getSettings().setJavaScriptEnabled(true);
    algo.getSettings().setBuiltInZoomControls(true);
    algo.loadUrl("https://rentealo.com/aviso-de-privacidad");
}
