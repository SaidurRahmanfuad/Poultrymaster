package com.securesoft.sonalikrishi.ui.home.calculators;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

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
public class SonaliCalculator extends Fragment implements View.OnClickListener {

    public SonaliCalculator() {
        // Required empty public constructor
    }
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private EditText chicks_inake;
    private TextView sonali_result_starter,sonali_result_grower,sonali_result_finisher;
    private Button sonali_cleare,sonali_calculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sonali_calculator, container, false);
        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-7815226488144324/3197406229");

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

        chicks_inake=view.findViewById(R.id.take_input_snalicalculation);



        sonali_result_starter=view.findViewById(R.id.shw_result_sonali_starter);
        sonali_result_grower=view.findViewById(R.id.shw_result_sonali_grower);
        sonali_result_finisher=view.findViewById(R.id.shw_result_sonali_finisher);

        sonali_cleare=view.findViewById(R.id.cleareSonaliId);
        sonali_calculate=view.findViewById(R.id.calculate_sonaliId);

        sonali_calculate.setOnClickListener(this);
        sonali_cleare.setOnClickListener(this);
        final NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);

       /*  OnBackPressedCallback callback = new OnBackPressedCallback(true *//* enabled by default *//*) {
            @Override
            public void handleOnBackPressed() {
                // Handle the back button event
               // navController.navigate(R.id.homeFragment);
                navController.navigate(R.id.feed_calculatorFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);*/
        return view;

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate_sonaliId:


                Float chicks_number;
                chicks_number = Float.parseFloat(chicks_inake.getText().toString());


                Float results = (float) ((chicks_number*0.04)*0.20);
                Float resultg = (float) ((chicks_number*0.04)*0.40);
                Float resultf = (float) ((chicks_number*0.04)*0.40);


                sonali_result_starter.setText(results.toString());
                sonali_result_grower.setText(resultg.toString());
                sonali_result_finisher.setText(resultf.toString());


                break;
            case R.id.cleareSonaliId:

                chicks_inake.setText("");
                sonali_result_starter.setText("");
                sonali_result_grower.setText("");
                sonali_result_finisher.setText("");
                break;
        }
    }

  /*  @Override
    public void onBackPressed() {
        final Fragment currentFragment = mNavHostFragment.getChildFragmentManager().getFragments().get(0);
        final NavController controller = Navigation.findNavController((Activity) getContext(), R.id.nav_host_fragment);
        if (currentFragment instanceof OnBackPressedListener)
            ((OnBackPressedListener) currentFragment).onBackPressed();
        else if (!controller.popBackStack())
            finish();

    }*/
}
