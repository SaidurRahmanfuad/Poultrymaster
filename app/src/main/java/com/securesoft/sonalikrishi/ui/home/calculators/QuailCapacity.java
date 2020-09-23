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
public class QuailCapacity extends Fragment implements View.OnClickListener {

    public QuailCapacity() {
        // Required empty public constructor
    }
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private EditText length_inake,width_inake,floor_intake;
    private TextView floorquail_capacity_result,cagequail_capacity_result;
    private Button quail_capacity_cleare,quail_capacity_calculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_quail_capacity, container, false);
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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/5057282801");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        length_inake=view.findViewById(R.id.input_capacityquail_length_Id);
        width_inake=view.findViewById(R.id.input_capacityquail_widthId);
        floor_intake=view.findViewById(R.id.input_capacityquail_cageId);

        floorquail_capacity_result=view.findViewById(R.id.result_forcapacityFloor_quailId);
        cagequail_capacity_result=view.findViewById(R.id.result_forcapacityCage_quailId);

        quail_capacity_cleare=view.findViewById(R.id.calculate_capacityquailId);
        quail_capacity_calculate=view.findViewById(R.id.calculate_capacityquailId);

        quail_capacity_calculate.setOnClickListener(this);
        quail_capacity_cleare.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate_capacityquailId:


                Float length,width,floor;

                length = Float.parseFloat(length_inake.getText().toString());
                width = Float.parseFloat(width_inake.getText().toString());
                floor = Float.parseFloat(floor_intake.getText().toString());

                Float fresultcapa = (length*width)*5;
                Float cresultcapa = ((length*width*floor)*8);

                floorquail_capacity_result.setText(fresultcapa.toString());
                cagequail_capacity_result.setText(cresultcapa.toString());


                break;
            case R.id.quailcapacleareId:
                length_inake.setText("");
                width_inake.setText("");
                floor_intake.setText("");
                floorquail_capacity_result.setText("");
                cagequail_capacity_result.setText("");
                break;
        }
    }
}
