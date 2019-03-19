package com.srgaara.drawer.lupus_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void ViewPLogin(View view)
    {
        Intent myIntent = new Intent(view.getContext(), login.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPHome(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }
}
