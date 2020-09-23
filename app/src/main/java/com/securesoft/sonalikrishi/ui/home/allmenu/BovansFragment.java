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


public class BovansFragment extends Fragment implements View.OnClickListener {
    //work done
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    public BovansFragment() {
        // Required empty public constructor
    }

    private EditText input_bovans;
    private Button bovans_cleare, show;
    TextView show_Dfi, show_Bw, show_Ep, show_Ew, show_light;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bovans, container, false);
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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/8996527811");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        show_Dfi = view.findViewById(R.id.show_bovans_dfi);
        show_Bw = view.findViewById(R.id.show_bovans_bw);
        show_Ep = view.findViewById(R.id.show_bovans_production);
        show_Ew = view.findViewById(R.id.show_bovans_eggweight);
        show_light = view.findViewById(R.id.show_bovans_light);


        input_bovans = view.findViewById(R.id.take_input_bovans);
        bovans_cleare = view.findViewById(R.id.clear_all_bovans);
        show = view.findViewById(R.id.show_result_bovans);
        show.setOnClickListener(this);
        bovans_cleare.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_bovans:
                bovan_data();
                break;
            case R.id.clear_all_bovans:
                input_bovans.setText("");
                show_Dfi.setText("");
                show_Bw.setText("");
                show_Ep.setText("");
                show_Ew.setText("");
                show_light.setText("");

                break;

        }
    }

    public void bovan_data() {

        String data;
        data = input_bovans.getText().toString();
        if (data != null) {
            if (data.equals("0")) {
                Toast.makeText(getContext(), "Nothing to show!!", Toast.LENGTH_SHORT).show();
            }
            if (data.equals("1")) {
                show_Dfi.setText("10-12");
                show_Bw.setText("64-67");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("24");
            }
            if (data.equals("2")) {
                show_Dfi.setText("16-18");
                show_Bw.setText("132-139");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("23");
            }
            if (data.equals("3")) {
                show_Dfi.setText("24-26");
                show_Bw.setText("211-221");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("22");
            }
            if (data.equals("4")) {
                show_Dfi.setText("31-33");
                show_Bw.setText("296-312");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("21");
            }
            if (data.equals("5")) {

                show_Dfi.setText("36-38");
                show_Bw.setText("388-408");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("20");
            }
            if (data.equals("6")) {

                show_Dfi.setText("41-43");
                show_Bw.setText("485-510");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("19");
            }
            if (data.equals("7")) {

                show_Dfi.setText("45-47");
                show_Bw.setText("584-614");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("18");
            }
            if (data.equals("8")) {

                show_Dfi.setText("49-51");
                show_Bw.setText("685-720");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("17");
            }
            if (data.equals("9")) {

                show_Dfi.setText("53-55");
                show_Bw.setText("786-826");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("15");
            }
            if (data.equals("10")) {

                show_Dfi.setText("57-59");
                show_Bw.setText("886-932");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("11")) {

                show_Dfi.setText("60-62");
                show_Bw.setText("984-1034");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("12")) {

                show_Dfi.setText("63-65");
                show_Bw.setText("1079-1130");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12");
            }
            if (data.equals("13")) {

                show_Dfi.setText("66-68");
                show_Bw.setText("1169-1220");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12:30");
            }
            if (data.equals("14")) {

                show_Dfi.setText("69-71");
                show_Bw.setText("1255-1310");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("15")) {

                show_Dfi.setText("72-74");
                show_Bw.setText("1335-1400");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13:30");
            }
            if (data.equals("16")) {

                show_Dfi.setText("75-77");
                show_Bw.setText("1409-1480");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("17")) {

                show_Dfi.setText("80-82");
                show_Bw.setText("1476-1550");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14:30");
            }

            if (data.equals("18")) {

                show_Dfi.setText("86-88");
                show_Bw.setText("1537-1610");
                show_Ep.setText("211.3");
                show_Ew.setText("42.6");
                show_light.setText("15");
            }
            if (data.equals("19")) {
                show_Dfi.setText("93");
                show_Bw.setText("1630");
                show_Ep.setText("16.1");
                show_Ew.setText("46.2");
                show_light.setText("15:30");
            }
            if (data.equals("20")) {
                show_Dfi.setText("100");
                show_Bw.setText("1676");
                show_Ep.setText("40.8");
                show_Ew.setText("49.3");
                show_light.setText("16");
            }
            if (data.equals("21")) {
                show_Dfi.setText("106");
                show_Bw.setText("1713");
                show_Ep.setText("65.4");
                show_Ew.setText("52");
                show_light.setText("16");
            }
            if (data.equals("22")) {
                show_Dfi.setText("110");
                show_Bw.setText("1750");
                show_Ep.setText("83.4");
                show_Ew.setText("54.2");
                show_light.setText("16");
            }
            if (data.equals("23")) {
                show_Dfi.setText("113");
                show_Bw.setText("1767");
                show_Ep.setText("92.3");
                show_Ew.setText("56");
                show_light.setText("16");
            }
            if (data.equals("24")) {
                show_Dfi.setText("114");
                show_Bw.setText("1782");
                show_Ep.setText("94.1");
                show_Ew.setText("57.5");
                show_light.setText("16");
            }
            if (data.equals("25")) {
                show_Dfi.setText("114");
                show_Bw.setText("1796");
                show_Ep.setText("95.1");
                show_Ew.setText("58.7");
                show_light.setText("16");
            }
            if (data.equals("26")) {
                show_Dfi.setText("114");
                show_Bw.setText("1809");
                show_Ep.setText("95.8");
                show_Ew.setText("59.6");
                show_light.setText("16");
            }
            if (data.equals("27")) {
                show_Dfi.setText("114");
                show_Bw.setText("1821");
                show_Ep.setText("95.8");
                show_Ew.setText("60.4");
                show_light.setText("16");
            }
            if (data.equals("28")) {
                show_Dfi.setText("114");
                show_Bw.setText("1831");
                show_Ep.setText("95.7");
                show_Ew.setText("61");
                show_light.setText("16");
            }
            if (data.equals("29")) {
                show_Dfi.setText("114");
                show_Bw.setText("1841");
                show_Ep.setText("95.7");
                show_Ew.setText("61.4");
                show_light.setText("16");
            }
            if (data.equals("30")) {
                show_Dfi.setText("114");
                show_Bw.setText("1850");
                show_Ep.setText("95.6");
                show_Ew.setText("61.8");
                show_light.setText("16");
            }
            if (data.equals("31")) {
                show_Dfi.setText("115");
                show_Bw.setText("1858");
                show_Ep.setText("95.5");
                show_Ew.setText("62.1");
                show_light.setText("16");
            }
            if (data.equals("32")) {
                show_Dfi.setText("115");
                show_Bw.setText("1866");
                show_Ep.setText("95.4");
                show_Ew.setText("62.3");
                show_light.setText("16");
            }
            if (data.equals("33")) {
                show_Dfi.setText("115");
                show_Bw.setText("1873");
                show_Ep.setText("95.2");
                show_Ew.setText("62.4");
                show_light.setText("16");
            }
            if (data.equals("34")) {
                show_Dfi.setText("115");
                show_Bw.setText("1879");
                show_Ep.setText("95.1");
                show_Ew.setText("62.5");
                show_light.setText("16");
            }
            if (data.equals("35")) {

                show_Dfi.setText("115");
                show_Bw.setText("1885");
                show_Ep.setText("94.9");
                show_Ew.setText("62.7");
                show_light.setText("16");
            }
            if (data.equals("36")) {

                show_Dfi.setText("115");
                show_Bw.setText("1891");
                show_Ep.setText("94.8");
                show_Ew.setText("62.8");
                show_light.setText("16");
            }
            if (data.equals("37")) {

                show_Dfi.setText("115");
                show_Bw.setText("1896");
                show_Ep.setText("94.6");
                show_Ew.setText("62.9");
                show_light.setText("16");
            }
            if (data.equals("38")) {

                show_Dfi.setText("115");
                show_Bw.setText("1901");
                show_Ep.setText("94.4");
                show_Ew.setText("63");
                show_light.setText("16");
            }
            if (data.equals("39")) {

                show_Dfi.setText("115");
                show_Bw.setText("1906");
                show_Ep.setText("94.1");
                show_Ew.setText("63.1");
                show_light.setText("16");
            }
            if (data.equals("40")) {

                show_Dfi.setText("115");
                show_Bw.setText("1911");
                show_Ep.setText("93.9");
                show_Ew.setText("63.3");
                show_light.setText("16");
            }
            //40
            if (data.equals("41")) {

                show_Dfi.setText("115");
                show_Bw.setText("1915");
                show_Ep.setText("93.7");
                show_Ew.setText("63.3");
                show_light.setText("16");
            }
            if (data.equals("42")) {

                show_Dfi.setText("115");
                show_Bw.setText("1919");
                show_Ep.setText("93.4");
                show_Ew.setText("63.4");
                show_light.setText("16");
            }
            if (data.equals("43")) {

                show_Dfi.setText("115");
                show_Bw.setText("1923");
                show_Ep.setText("93.1");
                show_Ew.setText("63.5");
                show_light.setText("16");
            }
            if (data.equals("44")) {

                show_Dfi.setText("115");
                show_Bw.setText("1927");
                show_Ep.setText("92.9");
                show_Ew.setText("63.6");
                show_light.setText("16");
            }
            if (data.equals("45")) {

                show_Dfi.setText("115");
                show_Bw.setText("1931");
                show_Ep.setText("92.6");
                show_Ew.setText("63.6");
                show_light.setText("16");
            }


            if (data.equals("46")) {
                show_Dfi.setText("115");
                show_Bw.setText("1935");
                show_Ep.setText("92.3");
                show_Ew.setText("63.7");
                show_light.setText("16");
            }
            if (data.equals("47")) {
                show_Dfi.setText("115");
                show_Bw.setText("1939");
                show_Ep.setText("92");
                show_Ew.setText("63.8");
                show_light.setText("16");
            }
            if (data.equals("48")) {
                show_Dfi.setText("115");
                show_Bw.setText("1942");
                show_Ep.setText("91.7");
                show_Ew.setText("63.8");
                show_light.setText("16");
            }
            if (data.equals("49")) {
                show_Dfi.setText("115");
                show_Bw.setText("1946");
                show_Ep.setText("91.3");
                show_Ew.setText("63.9");
                show_light.setText("16");
            }
            if (data.equals("50")) {
                show_Dfi.setText("115");
                show_Bw.setText("1949");
                show_Ep.setText("91");
                show_Ew.setText("63.9");
                show_light.setText("16");
            }
            if (data.equals("51")) {
                show_Dfi.setText("115");
                show_Bw.setText("1953");
                show_Ep.setText("90.6");
                show_Ew.setText("64");
                show_light.setText("16");
            }
            if (data.equals("52")) {
                show_Dfi.setText("115");
                show_Bw.setText("1956");
                show_Ep.setText("90.3");
                show_Ew.setText("64.1");
                show_light.setText("16");
            }
            if (data.equals("53")) {
                show_Dfi.setText("115");
                show_Bw.setText("1959");
                show_Ep.setText("89.9");
                show_Ew.setText("64.1");
                show_light.setText("16");
            }
            if (data.equals("54")) {
                show_Dfi.setText("115");
                show_Bw.setText("1962");
                show_Ep.setText("89.6");
                show_Ew.setText("64.2");
                show_light.setText("16");
            }
            if (data.equals("55")) {
                show_Dfi.setText("115");
                show_Bw.setText("1965");
                show_Ep.setText("89.2");
                show_Ew.setText("64.2");
                show_light.setText("16");
            }
            if (data.equals("56")) {
                show_Dfi.setText("115");
                show_Bw.setText("1967");
                show_Ep.setText("88.8");
                show_Ew.setText("64.3");
                show_light.setText("16");
            }
            if (data.equals("57")) {
                show_Dfi.setText("115");
                show_Bw.setText("1969");
                show_Ep.setText("88.4");
                show_Ew.setText("64.3");
                show_light.setText("16");
            }
            if (data.equals("58")) {
                show_Dfi.setText("115");
                show_Bw.setText("1971");
                show_Ep.setText("88");
                show_Ew.setText("64.4");
                show_light.setText("16");
            }
            if (data.equals("59")) {
                show_Dfi.setText("115");
                show_Bw.setText("1973");
                show_Ep.setText("87.6");
                show_Ew.setText("64.4");
                show_light.setText("16");
            }
            if (data.equals("60")) {
                show_Dfi.setText("115");
                show_Bw.setText("1975");
                show_Ep.setText("87.2");
                show_Ew.setText("64.5");
                show_light.setText("16");
            }
            if (data.equals("61")) {
                show_Dfi.setText("115");
                show_Bw.setText("1976");
                show_Ep.setText("86.8");
                show_Ew.setText("64.5");
                show_light.setText("16");
            }
            if (data.equals("62")) {
                show_Dfi.setText("115");
                show_Bw.setText("1978");
                show_Ep.setText("86.3");
                show_Ew.setText("64.6");
                show_light.setText("16");
            }
            if (data.equals("63")) {
                show_Dfi.setText("115");
                show_Bw.setText("1980");
                show_Ep.setText("85.9");
                show_Ew.setText("64.6");
                show_light.setText("16");
            }
            if (data.equals("64")) {
                show_Dfi.setText("115");
                show_Bw.setText("1981");
                show_Ep.setText("85.5");
                show_Ew.setText("64.7");
                show_light.setText("16");
            }
            if (data.equals("65")) {
                show_Dfi.setText("115");
                show_Bw.setText("1980");
                show_Ep.setText("85");
                show_Ew.setText("64.7");
                show_light.setText("16");
            }
            if (data.equals("66")) {
                show_Dfi.setText("115");
                show_Bw.setText("1984");
                show_Ep.setText("84.6");
                show_Ew.setText("64.8");
                show_light.setText("16");
            }
            if (data.equals("67")) {
                show_Dfi.setText("116");
                show_Bw.setText("1985");
                show_Ep.setText("84.1");
                show_Ew.setText("64.8");
                show_light.setText("16");
            }
            if (data.equals("68")) {
                show_Dfi.setText("116");
                show_Bw.setText("1986");
                show_Ep.setText("83.7");
                show_Ew.setText("64.9");
                show_light.setText("16");
            }
            if (data.equals("69")) {
                show_Dfi.setText("116");
                show_Bw.setText("1987");
                show_Ep.setText("83.2");
                show_Ew.setText("64.9");
                show_light.setText("16");
            }
            if (data.equals("70")) {
                show_Dfi.setText("116");
                show_Bw.setText("1988");
                show_Ep.setText("82.7");
                show_Ew.setText("65");
                show_light.setText("16");
            }
            if (data.equals("71")) {
                show_Dfi.setText("116");
                show_Bw.setText("1989");
                show_Ep.setText("82.3");
                show_Ew.setText("65");
                show_light.setText("16");
            }
            if (data.equals("72")) {
                show_Dfi.setText("116");
                show_Bw.setText("1990");
                show_Ep.setText("81.8");
                show_Ew.setText("65.1");
                show_light.setText("16");
            }
            if (data.equals("73")) {
                show_Dfi.setText("116");
                show_Bw.setText("1991");
                show_Ep.setText("81.3");
                show_Ew.setText("65.1");
                show_light.setText("16");
            }
            if (data.equals("74")) {
                show_Dfi.setText("116");
                show_Bw.setText("1991");
                show_Ep.setText("80.8");
                show_Ew.setText("65.2");
                show_light.setText("16");
            }
            if (data.equals("75")) {
                show_Dfi.setText("116");
                show_Bw.setText("1992");
                show_Ep.setText("80.4");
                show_Ew.setText("65.3");
                show_light.setText("16");
            }
            if (data.equals("76")) {
                show_Dfi.setText("116");
                show_Bw.setText("1993");
                show_Ep.setText("79.9");
                show_Ew.setText("65.3");
                show_light.setText("16");
            }
            if (data.equals("77")) {
                show_Dfi.setText("116");
                show_Bw.setText("1993");
                show_Ep.setText("79.4");
                show_Ew.setText("65.4");
                show_light.setText("16");
            }
            if (data.equals("78")) {
                show_Dfi.setText("116");
                show_Bw.setText("1994");
                show_Ep.setText("78.9");
                show_Ew.setText("65.4");
                show_light.setText("16");
            }
            if (data.equals("79")) {
                show_Dfi.setText("113");
                show_Bw.setText("1995");
                show_Ep.setText("78.4");
                show_Ew.setText("65.5");
                show_light.setText("16");
            }
            if (data.equals("80")) {
                show_Dfi.setText("116");
                show_Bw.setText("1995");
                show_Ep.setText("77.9");
                show_Ew.setText("65.5");
                show_light.setText("16");
            }
            if (data.equals("81")) {
                show_Dfi.setText("116");
                show_Bw.setText("1996");
                show_Ep.setText("77.3");
                show_Ew.setText("65.6");
                show_light.setText("16");
            }
            if (data.equals("82")) {
                show_Dfi.setText("116");
                show_Bw.setText("1996");
                show_Ep.setText("76.8");
                show_Ew.setText("65.7");
                show_light.setText("16");
            }
            if (data.equals("83")) {
                show_Dfi.setText("116");
                show_Bw.setText("1997");
                show_Ep.setText("76.3");
                show_Ew.setText("65.7");
                show_light.setText("16");
            }
            if (data.equals("84")) {
                show_Dfi.setText("116");
                show_Bw.setText("1997");
                show_Ep.setText("75.8");
                show_Ew.setText("65.8");
                show_light.setText("16");
            }
            if (data.equals("85")) {
                show_Dfi.setText("116");
                show_Bw.setText("1998");
                show_Ep.setText("75.3");
                show_Ew.setText("65.8");
                show_light.setText("16");
            }
            if (data.equals("86")) {
                show_Dfi.setText("116");
                show_Bw.setText("1998");
                show_Ep.setText("74.7");
                show_Ew.setText("65.9");
                show_light.setText("16");
            }
            if (data.equals("87")) {
                show_Dfi.setText("116");
                show_Bw.setText("1999");
                show_Ep.setText("74.2");
                show_Ew.setText("65.9");
                show_light.setText("16");
            }
            if (data.equals("88")) {
                show_Dfi.setText("116");
                show_Bw.setText("1999");
                show_Ep.setText("73.7");
                show_Ew.setText("66");
                show_light.setText("16");
            }
            if (data.equals("89")) {
                show_Dfi.setText("116");
                show_Bw.setText("2000");
                show_Ep.setText("73.1");
                show_Ew.setText("66.1");
                show_light.setText("16");
            }
            if (data.equals("90")) {
                show_Dfi.setText("116");
                show_Bw.setText("2000");
                show_Ep.setText("72.6");
                show_Ew.setText("66.1");
                show_light.setText("16");
            }


        }
    }
}
