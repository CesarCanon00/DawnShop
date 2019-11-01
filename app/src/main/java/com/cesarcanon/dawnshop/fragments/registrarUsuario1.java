package com.cesarcanon.dawnshop.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.cesarcanon.dawnshop.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class registrarUsuario1 extends Fragment {


    public registrarUsuario1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registrar_usuario1, container, false);
        // Inflate the layout for this fragment

        Button btnContinuar = (Button)view.findViewById(R.id.btnContinuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                continuar(view);
            }
        });

        return view;
    }

    public void continuar(View view){
        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,new registrarUsuario2())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

}
