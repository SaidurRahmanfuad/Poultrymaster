package com.securesoft.sonalikrishi.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.securesoft.sonalikrishi.R;


public class VaccinFragment extends Fragment implements View.OnClickListener {


    public VaccinFragment() {
        // Required empty public constructor
    }


    private Button boiler,sonali,layer,duck;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_vaccin, container, false);
        boiler=view.findViewById(R.id.vaccin_broiler);
        sonali=view.findViewById(R.id.vaccin_sonali);
        layer=view.findViewById(R.id.vaccin_layer);
        duck=view.findViewById(R.id.vaccin_duck);

        boiler.setOnClickListener(this);
        sonali.setOnClickListener(this);
        layer.setOnClickListener(this);
        duck.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.vaccin_broiler:
                Navigation.findNavController(view).navigate(R.id.goto_vacineFragment_to_broilervaccine_Fragment);
                break;
            case R.id.vaccin_sonali:
                Navigation.findNavController(view).navigate(R.id.goto_vacineFragment_to_sonalivaccine_Fragment);
                break;
            case R.id.vaccin_layer:
                Navigation.findNavController(view).navigate(R.id.goto_vacineFragment_to_layervaccine_Fragment);
                break;
            case R.id.vaccin_duck:
                Navigation.findNavController(view).navigate(R.id.goto_vacineFragment_to_duckvaccine_Fragment);
                break;
        }
    }
}
