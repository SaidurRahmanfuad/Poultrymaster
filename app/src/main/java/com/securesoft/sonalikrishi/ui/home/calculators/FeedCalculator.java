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
public class FeedCalculator extends Fragment implements View.OnClickListener {

    public FeedCalculator() {
        // Required empty public constructor
    }


private CardView boiler,sonali,layer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_feed_calculator, container, false);


        boiler=view.findViewById(R.id.feedcalcu_broiler);
        sonali=view.findViewById(R.id.feedcalcu_sonali);
        layer=view.findViewById(R.id.feedcalcu_layer);

        boiler.setOnClickListener(this);
        sonali.setOnClickListener(this);
        layer.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.feedcalcu_broiler:
                Navigation.findNavController(view).navigate(R.id.goto_feed_calculatorFragment_to_broilerfeedcalculator_Fragment);
                break;
            case R.id.feedcalcu_sonali:
                Navigation.findNavController(view).navigate(R.id.goto_feed_calculatorFragment_to_sonalifeedcalculator_Fragment);
                break;
            case R.id.feedcalcu_layer:
                Navigation.findNavController(view).navigate(R.id.goto_feed_calculatorFragment_to_layerfeedcalculator_Fragment);
                break;
        }
    }
}
