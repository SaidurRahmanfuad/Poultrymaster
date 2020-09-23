package com.securesoft.sonalikrishi.ui.home.allmenu;

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
public class SonaliFragment extends Fragment implements View.OnClickListener{

    public SonaliFragment() {
        // Required empty public constructor
    }
//workm done
private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private EditText input_sonali;
    private Button sonali_cleare, show;
    TextView show_Dfi, show_Cfi, show_Bw, show_Fs, show_Fe, show_Wa, show_Fcr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sonali, container, false);
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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/7491874452");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        show_Dfi = view.findViewById(R.id.show_sonali_dfi);
        show_Cfi = view.findViewById(R.id.show_sonali_cfi);
        show_Bw = view.findViewById(R.id.show_sonali_bw);
        show_Fs = view.findViewById(R.id.show_sonali_fs);
        show_Fe = view.findViewById(R.id.show_sonali_feeder);
        show_Wa = view.findViewById(R.id.show_sonali_water);
        show_Fcr = view.findViewById(R.id.show_sonali_fcr);


        input_sonali = view.findViewById(R.id.take_input_sonali);
        sonali_cleare = view.findViewById(R.id.clear_all_sonali);
        show = view.findViewById(R.id.show_result_sonali);
        show.setOnClickListener(this);
        sonali_cleare.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_sonali:
                sonali_data();
                break;
            case R.id.clear_all_sonali:
                input_sonali.setText("");
                show_Dfi.setText("");
                show_Cfi.setText("");
                show_Bw.setText("");
                show_Fs.setText("");
                show_Fe.setText("");
                show_Wa.setText("");
                show_Fcr.setText("");

                break;

        }
    }
    public void sonali_data(){

        String data;
        data=input_sonali.getText().toString();
        if(data!=null) {
            if (data.equals("0")) {
                show_Bw.setText("20");
            }
            //fs,fe,wa baki
            if (data.equals("1")) {

                show_Dfi.setText("5");
                show_Cfi.setText("5");
                show_Bw.setText("25");
                show_Fs.setText("0.07");
                show_Fe.setText("100");
                show_Wa.setText("100");
                show_Fcr.setText("0.20");

            }
            if (data.equals("2")) {

                show_Dfi.setText("6");
                show_Cfi.setText("11");
                show_Bw.setText("30");
                show_Fs.setText("0.07");
                show_Fe.setText("100");
                show_Wa.setText("100");
                show_Fcr.setText("0.37");

            }
            if (data.equals("3")) {

                show_Dfi.setText("7");
                show_Cfi.setText("18");
                show_Bw.setText("35");
                show_Fs.setText("0.07");
                show_Fe.setText("100");
                show_Wa.setText("100");
                show_Fcr.setText("0.51");

            }
            if (data.equals("4")) {

                show_Dfi.setText("8");
                show_Cfi.setText("26");
                show_Bw.setText("40");
                show_Fs.setText("0.07");
                show_Fe.setText("100");
                show_Wa.setText("100");
                show_Fcr.setText("0.65");

            }
            if (data.equals("5")) {

                show_Dfi.setText("9");
                show_Cfi.setText("35");
                show_Bw.setText("50");
                show_Fs.setText("0.07");
                show_Fe.setText("100");
                show_Wa.setText("100");
                show_Fcr.setText("0.70");

            }
            if (data.equals("6")) {

                show_Dfi.setText("10");
                show_Cfi.setText("45");
                show_Bw.setText("65");
                show_Fs.setText("0.07");
                show_Fe.setText("100");
                show_Wa.setText("100");
                show_Fcr.setText("0.69");

            }
            if (data.equals("7")) {

                show_Dfi.setText("11");
                show_Cfi.setText("56");
                show_Bw.setText("70");
                show_Fs.setText("0.07");
                show_Fe.setText("100");
                show_Wa.setText("100");
                show_Fcr.setText("0.80");

            }
            if (data.equals("8")) {

                show_Dfi.setText("11.9");
                show_Cfi.setText("67.9");
                show_Bw.setText("87");
                show_Fs.setText("0.12");
                show_Fe.setText("80");
                show_Wa.setText("80");
                show_Fcr.setText("0.78");

            }
            if (data.equals("9")) {

                show_Dfi.setText("12.8");
                show_Cfi.setText("80.7");
                show_Bw.setText("94");
                show_Fs.setText("0.12");
                show_Fe.setText("80");
                show_Wa.setText("80");
                show_Fcr.setText("0.86");

            }   if (data.equals("10")) {

                show_Dfi.setText("13.65");
                show_Cfi.setText("94.35");
                show_Bw.setText("100");
                show_Fs.setText("0.12");
                show_Fe.setText("80");
                show_Wa.setText("80");
                show_Fcr.setText("0.9435");

            }
            if (data.equals("11")) {

                show_Dfi.setText("14.5");
                show_Cfi.setText("108.85");
                show_Bw.setText("105");
                show_Fs.setText("0.12");
                show_Fe.setText("80");
                show_Wa.setText("80");
                show_Fcr.setText("1.04");

            }
            if (data.equals("12")) {

                show_Dfi.setText("15.3");
                show_Cfi.setText("124.15");
                show_Bw.setText("110");
                show_Fs.setText("0.12");
                show_Fe.setText("80");
                show_Wa.setText("80");
                show_Fcr.setText("1.13");

            }
            if (data.equals("13")) {

                show_Dfi.setText("16.1");
                show_Cfi.setText("140.25");
                show_Bw.setText("115");
                show_Fs.setText("0.12");
                show_Fe.setText("80");
                show_Wa.setText("80");
                show_Fcr.setText("1.22");

            }
            if (data.equals("14")) {

                show_Dfi.setText("16.85");
                show_Cfi.setText("157.1");
                show_Bw.setText("120");
                show_Fs.setText("0.12");
                show_Fe.setText("80");
                show_Wa.setText("80");
                show_Fcr.setText("1.31");

            }
            if (data.equals("15")) {

                show_Dfi.setText("17.7");
                show_Cfi.setText("174.8");
                show_Bw.setText("130");
                show_Fs.setText("0.20");
                show_Fe.setText("60");
                show_Wa.setText("60");
                show_Fcr.setText("1.34");

            }   if (data.equals("16")) {

                show_Dfi.setText("18.4");
                show_Cfi.setText("193.2");
                show_Bw.setText("145");
                show_Fs.setText("0.20");
                show_Fe.setText("60");
                show_Wa.setText("60");
                show_Fcr.setText("1.33");

            }
            if (data.equals("17")) {

                show_Dfi.setText("19.1");
                show_Cfi.setText("212.3");
                show_Bw.setText("155");
                show_Fs.setText("0.20");
                show_Fe.setText("60");
                show_Wa.setText("60");
                show_Fcr.setText("1.37");

            }
            if (data.equals("18")) {

                show_Dfi.setText("19.75");
                show_Cfi.setText("232.05");
                show_Bw.setText("165");
                show_Fs.setText("0.20");
                show_Fe.setText("60");
                show_Wa.setText("60");

                show_Fcr.setText("1.41");

            }
            if (data.equals("19")) {

                show_Dfi.setText("20.4");
                show_Cfi.setText("252.45");
                show_Bw.setText("175");
                show_Fs.setText("0.20");
                show_Fe.setText("60");
                show_Wa.setText("60");
                show_Fcr.setText("1.44");

            }
            if (data.equals("20")) {

                show_Dfi.setText("21");
                show_Cfi.setText("273.45");
                show_Bw.setText("185");
                show_Fs.setText("0.20");
                show_Fe.setText("60");
                show_Wa.setText("60");
                show_Fcr.setText("1.48");

            }
            if (data.equals("21")) {

                show_Dfi.setText("21.6");
                show_Cfi.setText("295.05");
                show_Bw.setText("200");
                show_Fs.setText("0.20");
                show_Fe.setText("60");
                show_Wa.setText("60");
                show_Fcr.setText("1.48");

            }   if (data.equals("22")) {

                show_Dfi.setText("23.18");
                show_Cfi.setText("318.23");
                show_Bw.setText("225");
                show_Fs.setText("0.30");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("1.41");

            }   if (data.equals("23")) {

                show_Dfi.setText("23.77");
                show_Cfi.setText("342");
                show_Bw.setText("245");
                show_Fs.setText("0.30");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("1.40");

            }   if (data.equals("24")) {

                show_Dfi.setText("24.36");
                show_Cfi.setText("366.36");
                show_Bw.setText("255");
                show_Fs.setText("0.30");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("1.44");

            }   if (data.equals("25")) {

                show_Dfi.setText("24.95");
                show_Cfi.setText("391.31");
                show_Bw.setText("265");
                show_Fs.setText("0.30");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("1.48");

            }   if (data.equals("26")) {

                show_Dfi.setText("25.54");
                show_Cfi.setText("416.85");
                show_Bw.setText("275");
                show_Fs.setText("0.30");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("1.52");

            }   if (data.equals("27")) {

                show_Dfi.setText("26.13");
                show_Cfi.setText("442.98");
                show_Bw.setText("285");
                show_Fs.setText("0.30");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("1.55");

            }   if (data.equals("28")) {

                show_Dfi.setText("26.72");
                show_Cfi.setText("469.7");
                show_Bw.setText("300");
                show_Fs.setText("0.30");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("1.57");

            }
            if (data.equals("29")) {

                show_Dfi.setText("27.49");
                show_Cfi.setText("497.19");
                show_Bw.setText("325");
                show_Fs.setText("0.40");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.53");

            }
            if (data.equals("30")) {

                show_Dfi.setText("28.26");
                show_Cfi.setText("525.45");
                show_Bw.setText("345");
                show_Fs.setText("0.40");
                show_Fe.setText("40");
                show_Wa.setText("40");

                show_Fcr.setText("1.52");

            }   if (data.equals("31")) {

                show_Dfi.setText("30.03");
                show_Cfi.setText("555.48");
                show_Bw.setText("355");
                show_Fs.setText("0.40");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.56");

            }   if (data.equals("32")) {

                show_Dfi.setText("30.8");
                show_Cfi.setText("586.28");
                show_Bw.setText("365");
                show_Fs.setText("0.40");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.61");

            }   if (data.equals("33")) {

                show_Dfi.setText("31.57");
                show_Cfi.setText("617.85");
                show_Bw.setText("375");
                show_Fs.setText("0.40");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.65");

            }   if (data.equals("34")) {

                show_Dfi.setText("32.34");
                show_Cfi.setText("650.19");
                show_Bw.setText("385");
                show_Fs.setText("0.40");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.69");

            }   if (data.equals("35")) {

                show_Dfi.setText("33.11");
                show_Cfi.setText("683.3");
                show_Bw.setText("400");
                show_Fs.setText("0.40");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.71");

            }
            if (data.equals("36")) {

                show_Dfi.setText("33.73");
                show_Cfi.setText("717.03");
                show_Bw.setText("425");
                show_Fs.setText("0.50");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.69");

            }
            if (data.equals("37")) {

                show_Dfi.setText("34.35");
                show_Cfi.setText("751.38");
                show_Bw.setText("445");
                show_Fs.setText("0.50");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.69");

            }
            if (data.equals("38")) {

                show_Dfi.setText("34.97");
                show_Cfi.setText("786.35");
                show_Bw.setText("455");
                show_Fs.setText("0.50");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.73");

            }
            if (data.equals("39")) {

                show_Dfi.setText("35.59");
                show_Cfi.setText("821.94");
                show_Bw.setText("465");
                show_Fs.setText("0.50");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.77");

            }
            if (data.equals("40")) {

                show_Dfi.setText("36.21");
                show_Cfi.setText("858.15");
                show_Bw.setText("475");
                show_Fs.setText("0.50");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.81");

            }
            if (data.equals("41")) {

                show_Dfi.setText("37.83");
                show_Cfi.setText("895.98");
                show_Bw.setText("485");
                show_Fs.setText("0.50");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.85");

            }
            if (data.equals("42")) {

                show_Dfi.setText("38.45");
                show_Cfi.setText("934.43");
                show_Bw.setText("500");
                show_Fs.setText("0.50");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.87");

            }   if (data.equals("43")) {

                show_Dfi.setText("39.16");
                show_Cfi.setText("973.59");
                show_Bw.setText("525");
                show_Fs.setText("0.60");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.85");

            }
            if (data.equals("44")) {

                show_Dfi.setText("39.87");
                show_Cfi.setText("1013.46");
                show_Bw.setText("535");
                show_Fs.setText("0.60");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.89");

            }
            if (data.equals("45")) {

                show_Dfi.setText("40.58");
                show_Cfi.setText("1054.04");
                show_Bw.setText("550");
                show_Fs.setText("0.60");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.92");

            }
//done
            if (data.equals("46")) {

                show_Dfi.setText("41.29");
                show_Cfi.setText("1095.33");
                show_Bw.setText("565");
                show_Fs.setText("0.60");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.94");

            }
            if (data.equals("47")) {

                show_Dfi.setText("42");
                show_Cfi.setText("1137.33");
                show_Bw.setText("575");
                show_Fs.setText("0.60");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.98");

            }
            if (data.equals("48")) {

                show_Dfi.setText("42.71");
                show_Cfi.setText("1180.04");
                show_Bw.setText("585");
                show_Fs.setText("0.60");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("2.02");

            }
            if (data.equals("49")) {

                show_Dfi.setText("43.42");
                show_Cfi.setText("1223.46");
                show_Bw.setText("600");
                show_Fs.setText("0.60");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("2.04");

            }
            if (data.equals("50")) {

                show_Dfi.setText("44.03");
                show_Cfi.setText("1267.49");
                show_Bw.setText("625");
                show_Fs.setText("0.80");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.03");

            }
            if (data.equals("51")) {

                show_Dfi.setText("44.64");
                show_Cfi.setText("1312.13");
                show_Bw.setText("635");
                show_Fs.setText("0.80");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.07");

            }
            if (data.equals("52")) {

                show_Dfi.setText("45.25");
                show_Cfi.setText("1357.38");
                show_Bw.setText("645");
                show_Fs.setText("0.80");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.10");

            }
            if (data.equals("53")) {

                show_Dfi.setText("45.86");
                show_Cfi.setText("1403.24");
                show_Bw.setText("650");
                show_Fs.setText("0.80");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.16");

            }
            if (data.equals("54")) {

                show_Dfi.setText("46.47");
                show_Cfi.setText("1449.71");
                show_Bw.setText("665");
                show_Fs.setText("0.80");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.18");

            }
            if (data.equals("55")) {

                show_Dfi.setText("47.08");
                show_Cfi.setText("1496.79");
                show_Bw.setText("670");
                show_Fs.setText("0.80");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.23");

            }
            if (data.equals("56")) {

                show_Dfi.setText("47.69");
                show_Cfi.setText("1544.48");
                show_Bw.setText("685");
                show_Fs.setText("0.80");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.25");

            }
            if (data.equals("57")) {

                show_Dfi.setText("48.4");
                show_Cfi.setText("1592.88");
                show_Bw.setText("692");
                show_Fs.setText("0.85");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.30");

            } if (data.equals("58")) {

                show_Dfi.setText("49.11");
                show_Cfi.setText("1641.99");
                show_Bw.setText("700");
                show_Fs.setText("0.85");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.35");

            }
            if (data.equals("59")) {

                show_Dfi.setText("49.82");
                show_Cfi.setText("1691.81");
                show_Bw.setText("715");
                show_Fs.setText("0.85");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.37");

            } if (data.equals("60")) {

                show_Dfi.setText("50.53");
                show_Cfi.setText("1742.34");
                show_Bw.setText("725");
                show_Fs.setText("0.85");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("2.40");

            }



        }
    }
}
