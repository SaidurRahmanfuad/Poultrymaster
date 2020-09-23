package com.securesoft.sonalikrishi.ui.home.calculators;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.securesoft.sonalikrishi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BroilerCapacity extends Fragment implements View.OnClickListener {

    public BroilerCapacity() {
        // Required empty public constructor
    }
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private EditText length_inake,width_inake;
    private TextView broiler_capacity_result;
    private Button broiler_capacity_cleare,broiler_capacity_calculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_broiler_capacity, container, false);
        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-7815226488144324/9366147184");

        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //banner end

        //interstitial ad start
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/5248854494");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        length_inake=view.findViewById(R.id.input_capacitybroiler_length_Id);
        width_inake=view.findViewById(R.id.input_capacitybroiler_widthId);

        broiler_capacity_result=view.findViewById(R.id.result_forcapacity_broilerId);
        broiler_capacity_cleare=view.findViewById(R.id.bcapacleareId);
        broiler_capacity_calculate=view.findViewById(R.id.calculate_capacitybroilerId);

        broiler_capacity_calculate.setOnClickListener(this);
        broiler_capacity_cleare.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate_capacitybroilerId:


                Float length,width;
                length = Float.parseFloat(length_inake.getText().toString());
                width = Float.parseFloat(width_inake.getText().toString());

                Float resultcapa = (float) ((length*width)/(1.2));


                broiler_capacity_result.setText(resultcapa.toString());

                break;
            case R.id.bcapacleareId:
                length_inake.setText("");
                width_inake.setText("");
                broiler_capacity_result.setText("");
                break;
        }
    }
}
