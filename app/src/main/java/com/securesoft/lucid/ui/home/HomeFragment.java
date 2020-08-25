package com.securesoft.lucid.ui.home;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import com.securesoft.lucid.R;
import com.securesoft.lucid.ui.home.poultry.PoltriFragment;
import com.securesoft.lucid.ui.home.slider.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class HomeFragment extends Fragment implements View.OnClickListener{

    public HomeFragment() {
        // Required empty public constructor
    }
    CardView poltri,feed,prob,info;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        SliderView sliderView = view.findViewById(R.id.imageSlider);
        SliderAdapter adapter = new SliderAdapter(getContext());
        sliderView.startAutoCycle();
        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);

        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

         poltri=view.findViewById(R.id.poultryId);
         feed=view.findViewById(R.id.feedId);
         prob=view.findViewById(R.id.problemId);
         info=view.findViewById(R.id.infoId);

        poltri.setOnClickListener(this);
        feed.setOnClickListener(this);
        prob.setOnClickListener(this);
        info.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.poultryId:

                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_poltriFragment);
                break;

            case R.id.feedId:
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_feedFragment);
                break;

            case R.id.problemId:
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_probFragment);
                break;
            case R.id.infoId:
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_infoFragment);
                break;
        }
    }
}