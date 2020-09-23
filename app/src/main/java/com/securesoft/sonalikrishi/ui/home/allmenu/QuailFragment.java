package com.securesoft.sonalikrishi.ui.home.allmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
public class QuailFragment extends Fragment implements View.OnClickListener{
//work done
private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    public QuailFragment() {
        // Required empty public constructor
    }
    private EditText input_quail;
    private Button quail_cleare, show;
    TextView show_Dfi, show_Cfi, show_Bw, show_Fs, show_Fe, show_Wa, show_Fcr,show_production,show_light;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_quail, container, false);
        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-7815226488144324/8879131832");

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

        show_Dfi = view.findViewById(R.id.show_quail_dfi);
        show_Cfi = view.findViewById(R.id.show_quail_cfi);
        show_Bw = view.findViewById(R.id.show_quail_bw);
        show_Fs = view.findViewById(R.id.show_quail_fs);
        show_Fe = view.findViewById(R.id.show_quail_feeder);
        show_Wa = view.findViewById(R.id.show_quail_water);
        show_Fcr = view.findViewById(R.id.show_quail_fcr);
        show_production = view.findViewById(R.id.show_quail_production);
        show_light = view.findViewById(R.id.show_quail_lighting);


        input_quail = view.findViewById(R.id.take_input_quail);
        quail_cleare = view.findViewById(R.id.clear_all_quail);
        show = view.findViewById(R.id.show_result_quail);
        show.setOnClickListener(this);
        quail_cleare.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_quail:
                quail_data();
                break;
            case R.id.clear_all_quail:
                input_quail.setText("");
                show_Dfi.setText("");
                show_Cfi.setText("");
                show_Bw.setText("");
                show_Fs.setText("");
                show_Fe.setText("");
                show_Wa.setText("");
                show_Fcr.setText("");
                show_production.setText("");
                show_light.setText("");

                break;

        }
    }
    public void quail_data(){

        String data;
        data=input_quail.getText().toString();
        if(data!=null) {
            if (data.equals("0")) {
                Toast.makeText(getContext(), "Nothing to show!!", Toast.LENGTH_SHORT).show();
            }
            if (data.equals("1")) {

                show_Dfi.setText("2");
                show_Cfi.setText("14");
                show_Bw.setText("18");
                show_Fcr.setText("0.77");
                show_Fs.setText("25");
                show_Fe.setText("100");
                show_Wa.setText("120");
                show_production.setText("0");
                show_light.setText("24");

            }
            if (data.equals("2")) {

                show_Dfi.setText("5");
                show_Cfi.setText("49");
                show_Bw.setText("36");
                show_Fcr.setText("1.36");
                show_Fs.setText("20");
                show_Fe.setText("80");
                show_Wa.setText("100");
                show_production.setText("0");
                show_light.setText("22");

            }
            if (data.equals("3")) {

                show_Dfi.setText("10");
                show_Cfi.setText("119");
                show_Bw.setText("60");
                show_Fcr.setText("1.98");
                show_Fs.setText("15");
                show_Fe.setText("70");
                show_Wa.setText("80");
                show_production.setText("0");
                show_light.setText("18");

            }
            if (data.equals("4")) {

                show_Dfi.setText("15");
                show_Cfi.setText("224");
                show_Bw.setText("90");
                show_Fcr.setText("2.50");
                show_Fs.setText("10");
                show_Fe.setText("60");
                show_Wa.setText("70");
                show_production.setText("0");
                show_light.setText("16");

            }
            if (data.equals("5")) {

                show_Dfi.setText("18");
                show_Cfi.setText("350");
                show_Bw.setText("110");
                show_Fcr.setText("3.18");
                show_Fs.setText("8");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("0");
                show_light.setText("14");

            }
            if (data.equals("6")) {

                show_Dfi.setText("19");
                show_Cfi.setText("0");
                show_Bw.setText("135");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("0");
                show_light.setText("12");

            }   if (data.equals("7")) {

                show_Dfi.setText("20");
                show_Cfi.setText("0");
                show_Bw.setText("150");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("2");
                show_light.setText("12");

            }   if (data.equals("8")) {

                show_Dfi.setText("20");
                show_Cfi.setText("0");
                show_Bw.setText("160");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("5");
                show_light.setText("13");

            }
            if (data.equals("9")) {

                show_Dfi.setText("20");
                show_Cfi.setText("0");
                show_Bw.setText("165");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("10");
                show_light.setText("14");

            }
            if (data.equals("10")) {

                show_Dfi.setText("20");
                show_Cfi.setText("0");
                show_Bw.setText("170");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("15");
                show_light.setText("15");

            }   if (data.equals("11")) {

                show_Dfi.setText("20");
                show_Cfi.setText("0");
                show_Bw.setText("172");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("35");
                show_light.setText("16");

            }
            if (data.equals("12")) {

                show_Dfi.setText("20");
                show_Cfi.setText("0");
                show_Bw.setText("175");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("50");
                show_light.setText("16");

            }
            if (data.equals("13")) {

                show_Dfi.setText("21");
                show_Cfi.setText("0");
                show_Bw.setText("177");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("80");
                show_light.setText("16");

            }
            if (data.equals("14")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("176");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("89");
                show_light.setText("16");

            }
            if (data.equals("15")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("175");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("92");
                show_light.setText("16");

            }
            if (data.equals("16")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("174");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("93");
                show_light.setText("16");

            }
            if (data.equals("17")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("173");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94");
                show_light.setText("16");

            }
            if (data.equals("18")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("172");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94.5");
                show_light.setText("16");

            }
            if (data.equals("19")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("171");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94.5");
                show_light.setText("16");

            }
            if (data.equals("20")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("170");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94.5");
                show_light.setText("16");

            }
            //20
            if (data.equals("21")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("169");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94.3");
                show_light.setText("16");

            }
            if (data.equals("22")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("168");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94.2");
                show_light.setText("0");

            }
            if (data.equals("23")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("167");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94.1");
                show_light.setText("16");

            }
            if (data.equals("24")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("166");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("94");
                show_light.setText("16");

            }
            if (data.equals("25")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("165");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("93.8");
                show_light.setText("16");

            }
            if (data.equals("26")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("164");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("93.6");
                show_light.setText("16");

            }
            if (data.equals("27")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("163");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("93.3");
                show_light.setText("16");

            }
            if (data.equals("28")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("162");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("93");
                show_light.setText("16");

            }
            if (data.equals("29")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("161");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("92.5");
                show_light.setText("16");

            }
            if (data.equals("30")) {

                show_Dfi.setText("24");
                show_Cfi.setText("0");
                show_Bw.setText("160");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("92");
                show_light.setText("16");

            }
            if (data.equals("31")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("159");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("91.5");
                show_light.setText("16");

            }
            if (data.equals("32")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("158");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("91");
                show_light.setText("16");

            }
            if (data.equals("33")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("157");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("90");
                show_light.setText("16");

            }
            if (data.equals("34")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("156");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("89");
                show_light.setText("16");

            }
            if (data.equals("35")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("155");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("88.5");
                show_light.setText("16");

            }
            if (data.equals("36")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("154");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("88");
                show_light.setText("16");

            }
            if (data.equals("37")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("153");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("87");
                show_light.setText("16");

            }
            if (data.equals("38")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("152");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("87");
                show_light.setText("16");

            }
            if (data.equals("39")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("151");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("86");
                show_light.setText("16");

            }
            if (data.equals("40")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("150");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("85.5");
                show_light.setText("16");

            }
            //40
            if (data.equals("41")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("149");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("85");
                show_light.setText("16");

            }
            if (data.equals("42")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("148");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("84.5");
                show_light.setText("16");

            }   if (data.equals("43")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("147");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("84");
                show_light.setText("16");

            }   if (data.equals("44")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("146");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("83.5");
                show_light.setText("16");

            }   if (data.equals("45")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("145");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("83");
                show_light.setText("16");

            }   if (data.equals("46")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("144");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("82.5");
                show_light.setText("16");

            }   if (data.equals("47")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("143");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("82");
                show_light.setText("16");

            }   if (data.equals("48")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("142");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("81.5");
                show_light.setText("16");

            }   if (data.equals("49")) {

                show_Dfi.setText("23");
                show_Cfi.setText("0");
                show_Bw.setText("141");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("81");
                show_light.setText("16");

            }   if (data.equals("50")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("140");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("80.5");
                show_light.setText("16");

            }
            if (data.equals("51")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("139");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("80");
                show_light.setText("16");

            }   if (data.equals("52")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("138");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("79.5");
                show_light.setText("16");

            }   if (data.equals("53")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("137");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("79");
                show_light.setText("16");

            }   if (data.equals("54")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("136");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("78.5");
                show_light.setText("16");

            }   if (data.equals("55")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("135");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("78");
                show_light.setText("16");

            }   if (data.equals("56")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("134");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("77.5");
                show_light.setText("16");

            }   if (data.equals("57")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("133");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("77");
                show_light.setText("16");

            }   if (data.equals("58")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("132");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("76.5");
                show_light.setText("16");

            }   if (data.equals("59")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("131");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("76");
                show_light.setText("16");

            }   if (data.equals("60")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("130");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("75.5");
                show_light.setText("16");

            }   if (data.equals("61")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("129");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("75.5");
                show_light.setText("16");

            }
            if (data.equals("62")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("128");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("75");
                show_light.setText("16");

            }
            if (data.equals("63")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("127");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("74.5");
                show_light.setText("16");

            }
            if (data.equals("64")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("126");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("74");
                show_light.setText("16");

            }
            if (data.equals("65")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("125");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("73.5");
                show_light.setText("16");

            }
            if (data.equals("66")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("124");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("73");
                show_light.setText("16");

            }
            if (data.equals("67")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("123");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("72.5");
                show_light.setText("16");

            }
            if (data.equals("68")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("122");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("72");
                show_light.setText("16");

            }
            if (data.equals("69")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("121");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("71.5");
                show_light.setText("16");

            }
            if (data.equals("70")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("120");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("71");
                show_light.setText("16");

            }
            //70
            if (data.equals("71")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("119");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("70.5");
                show_light.setText("16");

            }
            if (data.equals("72")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("118");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("70");
                show_light.setText("16");

            }
            if (data.equals("73")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("117");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("69.5");
                show_light.setText("16");

            }
            if (data.equals("74")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("116");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("69");
                show_light.setText("16");

            }
            if (data.equals("75")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("115");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("68.5");
                show_light.setText("16");

            }
            if (data.equals("76")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("115");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("68");
                show_light.setText("16");

            }
            if (data.equals("77")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("115");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("67");
                show_light.setText("16");

            }
            if (data.equals("78")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("115");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("66");
                show_light.setText("16");

            }
            if (data.equals("79")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("115");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("65");
                show_light.setText("16");

            }
            if (data.equals("80")) {

                show_Dfi.setText("22");
                show_Cfi.setText("0");
                show_Bw.setText("115");
                show_Fcr.setText("0");
                show_Fs.setText("5");
                show_Fe.setText("50");
                show_Wa.setText("60");
                show_production.setText("65");
                show_light.setText("16");

            }

        }
    }
}
