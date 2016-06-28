package com.seguidoresdecristo.sdc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Start extends AppCompatActivity {
    private final int DURACION_SPLASH = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                    iniciarActivity();
            };
        }, DURACION_SPLASH);
    }
    private void iniciarActivity(){
        Intent intent = new Intent(Start.this, Principal.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }

}
