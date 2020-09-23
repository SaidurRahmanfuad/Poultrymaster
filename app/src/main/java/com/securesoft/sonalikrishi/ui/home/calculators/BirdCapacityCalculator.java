package com.securesoft.sonalikrishi.ui.home.calculators;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.securesoft.sonalikrishi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BirdCapacityCalculator extends Fragment implements View.OnClickListener {

    public BirdCapacityCalculator() {
        // Required empty public constructor
    }
    private CardView boiler,sonali,quail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bird_capacity_calculator, container, false);

        boiler=view.findViewById(R.id.capacity_broiler);
        sonali=view.findViewById(R.id.capacity_sonali);
        quail=view.findViewById(R.id.capacity_quail);

        boiler.setOnClickListener(this);
        sonali.setOnClickListener(this);
        quail.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.capacity_broiler:
                Navigation.findNavController(view).navigate(R.id.goto_bird_capacityCalFragment_to_broilercapacityculator_Fragment);
                break;
            case R.id.capacity_sonali:
                Navigation.findNavController(view).navigate(R.id.goto_bird_capacityCalFragment_to_sonalicapacityculator_Fragment);
                break;
            case R.id.capacity_quail:
                Navigation.findNavController(view).navigate(R.id.goto_bird_capacityCalFragment_to_quailcapacityculator_Fragment);
                break;
        }
    }
}
