package com.seguidoresdecristo.sdc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.DrawerBuilder;

import butterknife.BindView;

public class Principal extends AppCompatActivity {

    //cabecera de la aplicacion
    @BindView(R.id.toolbar) private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        setToolbar();
    }
    public void setToolbar(){
        toolbar.setTitle("Seguidores de Cristo");
        setSupportActionBar(toolbar);
        new DrawerBuilder().withActivity(this).build();
    }

}
