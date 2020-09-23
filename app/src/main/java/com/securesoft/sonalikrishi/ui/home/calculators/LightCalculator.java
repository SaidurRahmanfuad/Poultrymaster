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
public class LightCalculator extends Fragment implements View.OnClickListener {

    public LightCalculator() {
        // Required empty public constructor
    }
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private EditText length_inake,width_inake;
    private TextView light_result;
    private Button light_cleare,calculate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_light_calculator, container, false);
        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-7815226488144324/4009948538");

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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/6847795050");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        length_inake=view.findViewById(R.id.input_lengthId);
        width_inake=view.findViewById(R.id.input_widthId);

        light_result=view.findViewById(R.id.result_forbulbId);
        light_cleare=view.findViewById(R.id.lightcleareId);
        calculate=view.findViewById(R.id.lightcalculateId);

        calculate.setOnClickListener(this);
        light_cleare.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lightcalculateId:


                Integer length,width;
                length = Integer.parseInt(length_inake.getText().toString());
                width = Integer.parseInt(width_inake.getText().toString());

                Integer result = (length*width)/100;


                light_result.setText(result.toString());

                break;
            case R.id.lightcleareId:
                length_inake.setText("");
                width_inake.setText("");
                light_result.setText("");
                break;
        }
    }
}
