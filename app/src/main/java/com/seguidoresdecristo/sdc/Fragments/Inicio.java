package com.seguidoresdecristo.sdc.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seguidoresdecristo.sdc.R;



public class Inicio extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio,container);
        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);

    }
}
