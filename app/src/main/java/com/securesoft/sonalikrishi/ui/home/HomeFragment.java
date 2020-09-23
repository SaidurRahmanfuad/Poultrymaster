package com.securesoft.sonalikrishi.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.securesoft.sonalikrishi.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
        // Required empty public constructor
    }

    CardView Cobbir, Hubbard, Ross, Sonali, Quail, Hyline, ISA, Novogen, Bovans, Shaver, Mctc, FCR, Brooding, LightingSchedule, Vaccination, Feedcalcu, Lightcalu, BirdCapacitycalcu, Companychicks, Advice;

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //banner ad start
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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/6847795050");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        //end
        Cobbir = view.findViewById(R.id.cobbId);
        Hubbard = view.findViewById(R.id.hubbId);
        Ross = view.findViewById(R.id.rossId);
        Sonali = view.findViewById(R.id.sonaliId);
        // White = view.findViewById(R.id.whitecockId);
        Quail = view.findViewById(R.id.quailId);
        Hyline = view.findViewById(R.id.hylinId);
        ISA = view.findViewById(R.id.isaId);
        Novogen = view.findViewById(R.id.novogenId);
        Bovans = view.findViewById(R.id.bovanId);
        Shaver = view.findViewById(R.id.shaverId);
        Shaver = view.findViewById(R.id.shaverId);
        Mctc = view.findViewById(R.id.mctcId);
        Advice = view.findViewById(R.id.adviceId);

        FCR = view.findViewById(R.id.fcrId);
        Feedcalcu = view.findViewById(R.id.calculatorfeedId);
        Lightcalu = view.findViewById(R.id.calculatorlightId);
        BirdCapacitycalcu = view.findViewById(R.id.calculatorbirdcapacityId);
        Brooding = view.findViewById(R.id.boordingId);
        LightingSchedule = view.findViewById(R.id.lightscheduleId);
        Vaccination = view.findViewById(R.id.vaccinId);
        Companychicks = view.findViewById(R.id.companychecksId);


        Cobbir.setOnClickListener(this);
        Hubbard.setOnClickListener(this);
        Ross.setOnClickListener(this);
        Sonali.setOnClickListener(this);

        Quail.setOnClickListener(this);
        Hyline.setOnClickListener(this);
        ISA.setOnClickListener(this);
        Novogen.setOnClickListener(this);
        Bovans.setOnClickListener(this);
        Shaver.setOnClickListener(this);
        Mctc.setOnClickListener(this);
        Advice.setOnClickListener(this);

        FCR.setOnClickListener(this);
        Feedcalcu.setOnClickListener(this);
        Lightcalu.setOnClickListener(this);
        BirdCapacitycalcu.setOnClickListener(this);
        Brooding.setOnClickListener(this);
        LightingSchedule.setOnClickListener(this);
        Vaccination.setOnClickListener(this);
        Companychicks.setOnClickListener(this);


        return view;

    }


    @Override
    public void onClick(final View view) {
        // final NavController navController = Navigation.findNavController(view);
        // One2Five_Model o2f=new One2Five_Model();
        switch (view.getId()) {
            case R.id.cobbId:
                    Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_cobb_Fragment);
                break;

            case R.id.hubbId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_hubbarbor_Fragment);
                break;

            case R.id.rossId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_rossloh_Fragment);
                break;
            case R.id.sonaliId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_sonali_Fragment);
                break;
            case R.id.quailId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_quail_Fragment);
                break;
            case R.id.hylinId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_hylin_Fragment);
                break;
            case R.id.isaId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_isa_Fragment);
                break;
            case R.id.novogenId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_novo_Fragment);
                break;
            case R.id.bovanId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_bovans_Fragment);
                break;
            case R.id.shaverId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_shaver_Fragment);
                break;
            case R.id.adviceId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_advice_Fragment);
                break;
            case R.id.mctcId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_mctc_Fragment);
                break;
            case R.id.fcrId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_fcr_Fragment);
                break;
            case R.id.calculatorfeedId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_feedcalculator_Fragment);
                break;
            case R.id.calculatorlightId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_lightculator_Fragment);
                break;
            case R.id.calculatorbirdcapacityId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_birdcapacityculator_Fragment);
                break;

            case R.id.lightscheduleId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_light_Fragment);
                break;
            case R.id.boordingId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_brood_Fragment);
                break;

            case R.id.vaccinId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_vaccin_Fragment);
                break;
            case R.id.companychecksId:
                Navigation.findNavController(view).navigate(R.id.goto_homeFragment_to_companychicks_Fragment);
                break;
        }
    }

}