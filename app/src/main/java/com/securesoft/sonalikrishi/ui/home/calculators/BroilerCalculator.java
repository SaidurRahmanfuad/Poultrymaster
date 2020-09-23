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
public class BroilerCalculator extends Fragment implements View.OnClickListener {

    public BroilerCalculator() {
        // Required empty public constructor
    }
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private EditText chicks_inake;
    private TextView broiler_result_starter,broiler_result_grower,broiler_result_finisher;
    private Button broiler_cleare,calculate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_broiler_calculator, container, false);
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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/8996527811");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        chicks_inake=view.findViewById(R.id.take_input_broilercalculation);


        broiler_result_starter=view.findViewById(R.id.shw_result_broiler_starter);
        broiler_result_grower=view.findViewById(R.id.shw_result_broiler_grower);
        broiler_result_finisher=view.findViewById(R.id.shw_result_broiler_finisher);

        broiler_cleare=view.findViewById(R.id.cleare_broilerId);
        calculate=view.findViewById(R.id.calculate_broilerId);

        calculate.setOnClickListener(this);
        broiler_cleare.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate_broilerId:


                Float chicks_number;
                chicks_number = Float.parseFloat(chicks_inake.getText().toString());


                Float results = (float) ((chicks_number*0.05)*0.20);
                Float resultg = (float) ((chicks_number*0.05)*0.40);
                Float resultf = (float) ((chicks_number*0.05)*0.40);


                broiler_result_starter.setText(results.toString());
                broiler_result_grower.setText(resultg.toString());
                broiler_result_finisher.setText(resultf.toString());


                break;
            case R.id.cleare_broilerId:
                chicks_inake.setText("");
                broiler_result_starter.setText("");
                broiler_result_grower.setText("");
                broiler_result_finisher.setText("");
                break;
        }
    }
}
