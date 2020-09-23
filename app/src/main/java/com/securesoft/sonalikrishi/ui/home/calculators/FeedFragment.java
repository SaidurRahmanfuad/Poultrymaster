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
public class FeedFragment extends Fragment implements View.OnClickListener {

    public FeedFragment() {
        // Required empty public constructor
    }
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

private EditText feed_inake,body_weight;
    private TextView fcr_result;
    private Button cleare,calculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_feed, container, false);
        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-7815226488144324/4318916201");

        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //banner end

        //interstitial ad start
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/5248854494");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        feed_inake=v.findViewById(R.id.feed_intakeId);
        body_weight=v.findViewById(R.id.body_weightId);
        fcr_result=v.findViewById(R.id.result_fcrId);
        cleare=v.findViewById(R.id.cleareId);
        calculate=v.findViewById(R.id.calculateId);

        calculate.setOnClickListener(this);
        cleare.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculateId:

                Float feed,bodyweight;
                feed = Float.parseFloat(feed_inake.getText().toString());
                bodyweight = Float.parseFloat(body_weight.getText().toString());
                Float result = feed/bodyweight;
                fcr_result.setText(result.toString());

                break;
            case R.id.cleareId:
                /*feed_inake.getText().toString();
                body_weight.getText().toString();
                fcr_result.getText().toString();*/
                feed_inake.setText("");
                body_weight.setText("");
                fcr_result.setText("");
                break;
        }

    }

}
