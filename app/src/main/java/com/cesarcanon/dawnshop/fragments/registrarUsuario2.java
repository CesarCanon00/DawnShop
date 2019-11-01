package com.cesarcanon.dawnshop.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.cesarcanon.dawnshop.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class registrarUsuario2 extends Fragment {


    public registrarUsuario2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registrar_usuario2, container, false);
        // Inflate the layout for this fragment

        ImageButton btnFoto = (ImageButton)view.findViewById(R.id.btnFoto);
        ImageButton btnGaleria = (ImageButton)view.findViewById(R.id.btnGaleria);
        Button btnOmitir = (Button)view.findViewById(R.id.btnOmitir);

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Hola Profe",Toast.LENGTH_SHORT).show();
            }
        });

        btnGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Hola Profe",Toast.LENGTH_SHORT).show();
            }
        });

        btnOmitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,new registrarUsuario3())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
            }
        });

        return view;
    }

}
