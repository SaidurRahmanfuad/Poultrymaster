package com.securesoft.sonalikrishi.ui.home.allmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.securesoft.sonalikrishi.R;
import com.securesoft.sonalikrishi.ui.home.poultry.ChicksModel;

import java.util.ArrayList;
import java.util.List;

public class CompanyChicks extends Fragment {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    public CompanyChicks() {
        // Required empty public constructor
    }

    private Spinner spinnerchicks;
    private TextView broilerchecks,layerchicks;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_company_chicks, container, false);
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

        broilerchecks=view.findViewById(R.id.broilerchicks);
        layerchicks=view.findViewById(R.id.layerchicks);

        spinnerchicks = view.findViewById(R.id.spinnerchicks);

        show_datas();



        spinnerchicks.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ChicksModel chicksmodel = (ChicksModel) adapterView.getSelectedItem();
                displayUserData(chicksmodel);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        return view;
    }


    public void getSelectedChicks(View v){
        ChicksModel chicksModel= (ChicksModel) spinnerchicks.getSelectedItem();
    }

    private void displayUserData(ChicksModel chicksmodel) {
        String broilername = chicksmodel.getBroiler();
        String layername = chicksmodel.getLayer();
        broilerchecks.setText(broilername);
        layerchicks.setText(layername);
    }

    private void show_datas(){
        List<ChicksModel> companyList = new ArrayList<>();
        ChicksModel company0 = new ChicksModel("Select any", "", "");
        companyList.add(company0);
        ChicksModel company1 = new ChicksModel("ACI Godrej", "No", "Novogen");
        companyList.add(company1);
        ChicksModel company2 = new ChicksModel("Aftab", "Hubbard\nFast Feather", "Novogen");
        companyList.add(company2);
        ChicksModel company3 = new ChicksModel("Aman", "Cobb-500\nLohmann", "Shaver Brown");
        companyList.add(company3);
        ChicksModel company4 = new ChicksModel("AG Agro", "Cobb-500\nLohmann\nFast Feather", "Shaver Brown");
        companyList.add(company4);
        ChicksModel company5 = new ChicksModel("Agha", "Cobb-500", "NO");
        companyList.add(company5);
        ChicksModel company6 = new ChicksModel("Bay Agro", "Cobb-500\nHubbard", "NO");
        companyList.add(company6);
        ChicksModel company7 = new ChicksModel("CP", "Cobb-500\nRoss", "ISA Brown");
        companyList.add(company7);
        ChicksModel company8 = new ChicksModel("Diamond Chicks", "No", "Bovans Brown");
        companyList.add(company8);
        ChicksModel company9 = new ChicksModel("Gazipur Feeds", "No", "Brown Nick\nNick Chick White");
        companyList.add(company9);
        ChicksModel company10 = new ChicksModel("Index", "Lohmann", "ISA Brown\nDkalb White");
        companyList.add(company10);
        ChicksModel company11 = new ChicksModel("Kazi", "Cobb-500\nLohmann", "Hyline Brown\nHyline White");
        companyList.add(company11);
        ChicksModel company12= new ChicksModel("Nahar", "Cobb-500\nRoss", "Shaver Brown\nLohmann White");
        companyList.add(company12);
        ChicksModel company13= new ChicksModel("New Hope", "Cobb-500\nArbor Acres", "NO");
        companyList.add(company13);
        ChicksModel company14= new ChicksModel("Nourish", "Cobb-500\nLohmann", "Novogen");
        companyList.add(company14);
        ChicksModel company15= new ChicksModel("Nilsagor", "Lohmann", "NO");
        companyList.add(company15);
        ChicksModel company16= new ChicksModel("Paragon", "Hubbard\nFast Feather", "Novogen");
        companyList.add(company16);
        ChicksModel company17= new ChicksModel("Provita", "Cobb-500\nSlow Feather", "Shaver Brown");
        companyList.add(company17);
        ChicksModel company18= new ChicksModel("Quality", "Hubbard", "Novogen");
        companyList.add(company18);
        ChicksModel company19= new ChicksModel("MAK", "Ross", "NO");
        companyList.add(company19);




        ArrayAdapter<ChicksModel> adapter = new ArrayAdapter<ChicksModel>(getContext(),
                android.R.layout.simple_spinner_item, companyList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerchicks.setAdapter(adapter);
    }
}
