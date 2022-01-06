package com.pendrogon.libtem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TemperaturaFragment extends Fragment {

    private Button btnCalcular;
    private EditText txtTemperatura;

    public TemperaturaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_temperatura, container, false);
        btnCalcular = view.findViewById(R.id.resultado);
        txtTemperatura = view.findViewById(R.id.temperatura);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double temperatura = Double.parseDouble(txtTemperatura.getText().toString());
                txtTemperatura.setText(Double.toString((temperatura*9/5)+32));
            }
        });
        return view;
    }
}