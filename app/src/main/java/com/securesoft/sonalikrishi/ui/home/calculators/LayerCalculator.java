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
public class LayerCalculator extends Fragment implements View.OnClickListener {

    public LayerCalculator() {
        // Required empty public constructor
    }
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private EditText chicks_inake;
    private TextView layer_result_starter,layer_result_grower,layer_result_finisher;
    private Button layer_cleare,layer_calculate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_layer_calculator, container, false);
        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-7815226488144324/4318916201");

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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/7491874452");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        chicks_inake=view.findViewById(R.id.take_input_layercalculation);
        layer_result_starter=view.findViewById(R.id.shw_result_layer_starter);
        layer_result_grower=view.findViewById(R.id.shw_result_layer_grower);
        layer_result_finisher=view.findViewById(R.id.shw_result_layer_finisher);

        layer_cleare=view.findViewById(R.id.layer_cleareId);
        layer_calculate=view.findViewById(R.id.calculate_layerId);

        layer_calculate.setOnClickListener(this);
        layer_cleare.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate_layerId:
           //whole laying preod baki

                Float chicks_number;
                chicks_number = Float.parseFloat(chicks_inake.getText().toString());


                Float results = (float) ((chicks_number*0.12)*0.30);
                Float resultg = (float) ((chicks_number*0.12)*0.70);
              //  Float resultf = (float) ((chicks_number*0.04)*0.40);


                layer_result_starter.setText(results.toString());
                layer_result_grower.setText(resultg.toString());
                //layer_result_finisher.setText(resultf.toString());


                break;
            case R.id.layer_cleareId:

                chicks_inake.setText("");
                layer_result_starter.setText("");
                layer_result_grower.setText("");
                layer_result_finisher.setText("");
                break;
        }
    }
}
