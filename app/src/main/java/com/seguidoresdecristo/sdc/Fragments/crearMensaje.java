package com.seguidoresdecristo.sdc.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.seguidoresdecristo.sdc.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class crearMensaje extends Fragment {
    private Button enviar;
    private EditText txAEnviar;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference();
    DatabaseReference ref = reference.child("mensaje");
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_crear_mensaje, container, false);

        txAEnviar = (EditText)  view.findViewById(R.id.txAEnviar);
        enviar = (Button)view.findViewById(R.id.btEnviar);
        enviar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                SimpleDateFormat s = new SimpleDateFormat("ddMMyyyyhhmmss");
                String format = s.format(new Date());
                String mensaje = txAEnviar.getText().toString();
                Map<String, Object> map = new HashMap<String, Object>();
                map.put(format,mensaje);
                ref.updateChildren(map);
            }
        });

        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event

}
