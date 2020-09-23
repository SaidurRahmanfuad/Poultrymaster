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
public class ShaverFragment extends Fragment implements View.OnClickListener {
    private EditText input_shaver;
    private Button shaver_cleare, show;
    TextView show_Dfi, show_Bw, show_Ep, show_Ew, show_light;
//work done
private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    public ShaverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shaver, container, false);
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

        show_Dfi = view.findViewById(R.id.show_shaver_dfi);
        show_Bw = view.findViewById(R.id.show_shaver_bw);
        show_Ep = view.findViewById(R.id.show_shaver_production);
        show_Ew = view.findViewById(R.id.show_shaver_eggweight);
        show_light = view.findViewById(R.id.show_shaver_light);


        input_shaver = view.findViewById(R.id.take_input_shaver);
        shaver_cleare = view.findViewById(R.id.clear_all_shaver);
        show = view.findViewById(R.id.show_result_shaver);
        show.setOnClickListener(this);
        shaver_cleare.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_shaver:
                shaver_data();
                break;
            case R.id.clear_all_shaver:
                input_shaver.setText("");
                show_Dfi.setText("");
                show_Bw.setText("");
                show_Ep.setText("");
                show_Ew.setText("");

                break;

        }
    }

    public void shaver_data() {

        String data;
        data = input_shaver.getText().toString();
        if (data != null) {
            if (data.equals("0")) {
                Toast.makeText(getContext(), "Nothing to show!!", Toast.LENGTH_SHORT).show();
            }
            if (data.equals("1")) {
                show_Dfi.setText("10-12");
                show_Bw.setText("63-67");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("24");
            }
            if (data.equals("2")) {
                show_Dfi.setText("16-18");
                show_Bw.setText("129-136");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("23");
            }
            if (data.equals("3")) {
                show_Dfi.setText("24-26");
                show_Bw.setText("205-215");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("22");
            }
            if (data.equals("4")) {
                show_Dfi.setText("31-33");
                show_Bw.setText("63-67");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("21");
            }
            if (data.equals("5")) {

                show_Dfi.setText("36-38");
                show_Bw.setText("288-303");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("20");
            }
            if (data.equals("6")) {

                show_Dfi.setText("41-43");
                show_Bw.setText("473-497");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("19");
            }
            if (data.equals("7")) {

                show_Dfi.setText("45-47");
                show_Bw.setText("570-599");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("18");
            }
            if (data.equals("8")) {

                show_Dfi.setText("49-51");
                show_Bw.setText("669-703");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("17");
            }
            if (data.equals("9")) {

                show_Dfi.setText("53-55");
                show_Bw.setText("767-807");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("15");
            }
            if (data.equals("10")) {

                show_Dfi.setText("57-59");
                show_Bw.setText("865-909");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("11")) {

                show_Dfi.setText("60-62");
                show_Bw.setText("960-1009");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("12")) {

                show_Dfi.setText("63-65");
                show_Bw.setText("1052-1100");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12");
            }
            if (data.equals("13")) {

                show_Dfi.setText("66-68");
                show_Bw.setText("1140-1190");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12:30");
            }
            if (data.equals("14")) {

                show_Dfi.setText("69-71");
                show_Bw.setText("1223-1280");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("15")) {

                show_Dfi.setText("72-74");
                show_Bw.setText("1301-1360");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13:30");
            }
            if (data.equals("16")) {

                show_Dfi.setText("75-77");
                show_Bw.setText("1373-1440");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("17")) {

                show_Dfi.setText("78-80");
                show_Bw.setText("1438-1510");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14:30");
            }

            if (data.equals("18")) {

                show_Dfi.setText("83-85");
                show_Bw.setText("1536");
                show_Ep.setText("3.8");
                show_Ew.setText("43.5");
                show_light.setText("15");
            }
            if (data.equals("19")) {
                show_Dfi.setText("89");
                show_Bw.setText("1590");
                show_Ep.setText("16.7");
                show_Ew.setText("43.5");
                show_light.setText("15:30");
            }
            if (data.equals("20")) {
                show_Dfi.setText("96");
                show_Bw.setText("1638");
                show_Ep.setText("39.7");
                show_Ew.setText("47.3");
                show_light.setText("16");
            }
            if (data.equals("21")) {
                show_Dfi.setText("102");
                show_Bw.setText("1669");
                show_Ep.setText("63.3");
                show_Ew.setText("50.4");
                show_light.setText("16");
            }
            if (data.equals("22")) {
                show_Dfi.setText("108");
                show_Bw.setText("1700");
                show_Ep.setText("81.3");
                show_Ew.setText("52.9");
                show_light.setText("16");
            }
            if (data.equals("23")) {
                show_Dfi.setText("111");
                show_Bw.setText("1718");
                show_Ep.setText("91.4");
                show_Ew.setText("54.9");
                show_light.setText("16");
            }
            if (data.equals("24")) {
                show_Dfi.setText("111");
                show_Bw.setText("1734");
                show_Ep.setText("94.6");
                show_Ew.setText("56.5");
                show_light.setText("16");
            }
            if (data.equals("25")) {
                show_Dfi.setText("111");
                show_Bw.setText("1748");
                show_Ep.setText("95.5");
                show_Ew.setText("57.7");
                show_light.setText("16");
            }
            if (data.equals("26")) {
                show_Dfi.setText("111");
                show_Bw.setText("1762");
                show_Ep.setText("95.8");
                show_Ew.setText("58.7");
                show_light.setText("16");
            }
            if (data.equals("27")) {
                show_Dfi.setText("111");
                show_Bw.setText("1774");
                show_Ep.setText("95.7");
                show_Ew.setText("59.4");
                show_light.setText("16");
            }
            if (data.equals("28")) {
                show_Dfi.setText("111");
                show_Bw.setText("1785");
                show_Ep.setText("95.6");
                show_Ew.setText("60");
                show_light.setText("16");
            }
            if (data.equals("29")) {
                show_Dfi.setText("111");
                show_Bw.setText("1795");
                show_Ep.setText("95.5");
                show_Ew.setText("60.4");
                show_light.setText("16");
            }
            if (data.equals("30")) {
                show_Dfi.setText("111");
                show_Bw.setText("1804");
                show_Ep.setText("95.4");
                show_Ew.setText("60.8");
                show_light.setText("16");
            }
            if (data.equals("31")) {
                show_Dfi.setText("111");
                show_Bw.setText("1813");
                show_Ep.setText("95.3");
                show_Ew.setText("61.1");
                show_light.setText("16");
            }
            if (data.equals("32")) {
                show_Dfi.setText("111");
                show_Bw.setText("1820");
                show_Ep.setText("95.1");
                show_Ew.setText("61.4");
                show_light.setText("16");
            }
            if (data.equals("33")) {
                show_Dfi.setText("111");
                show_Bw.setText("1827");
                show_Ep.setText("95");
                show_Ew.setText("61.6");
                show_light.setText("16");
            }
            if (data.equals("34")) {
                show_Dfi.setText("111");
                show_Bw.setText("1834");
                show_Ep.setText("94.9");
                show_Ew.setText("61.9");
                show_light.setText("16");
            }
            if (data.equals("35")) {

                show_Dfi.setText("111");
                show_Bw.setText("1840");
                show_Ep.setText("94.7");
                show_Ew.setText("62.1");
                show_light.setText("16");
            }
            if (data.equals("36")) {

                show_Dfi.setText("111");
                show_Bw.setText("1845");
                show_Ep.setText("94.5");
                show_Ew.setText("62.3");
                show_light.setText("16");
            }
            if (data.equals("37")) {

                show_Dfi.setText("111");
                show_Bw.setText("1850");
                show_Ep.setText("94.3");
                show_Ew.setText("62.5");
                show_light.setText("16");
            }
            if (data.equals("38")) {

                show_Dfi.setText("111");
                show_Bw.setText("1855");
                show_Ep.setText("94.2");
                show_Ew.setText("62.6");
                show_light.setText("16");
            }
            if (data.equals("39")) {

                show_Dfi.setText("111");
                show_Bw.setText("1859");
                show_Ep.setText("94");
                show_Ew.setText("62.8");
                show_light.setText("16");
            }
            if (data.equals("40")) {

                show_Dfi.setText("111");
                show_Bw.setText("1864");
                show_Ep.setText("93.8");
                show_Ew.setText("62.8");
                show_light.setText("16");
            }
            //40
            if (data.equals("41")) {

                show_Dfi.setText("111");
                show_Bw.setText("1868");
                show_Ep.setText("93.5");
                show_Ew.setText("62.8");
                show_light.setText("16");
            }
            if (data.equals("42")) {

                show_Dfi.setText("111");
                show_Bw.setText("1871");
                show_Ep.setText("93.3");
                show_Ew.setText("62.8");
                show_light.setText("16");
            }
            if (data.equals("43")) {

                show_Dfi.setText("111");
                show_Bw.setText("1875");
                show_Ep.setText("93.1");
                show_Ew.setText("62.8");
                show_light.setText("16");
            }
            if (data.equals("44")) {

                show_Dfi.setText("111");
                show_Bw.setText("1879");
                show_Ep.setText("92.8");
                show_Ew.setText("62.9");
                show_light.setText("16");
            }
            if (data.equals("45")) {

                show_Dfi.setText("111");
                show_Bw.setText("1882");
                show_Ep.setText("92.5");
                show_Ew.setText("62.9");
                show_light.setText("16");
            }


            if (data.equals("46")) {
                show_Dfi.setText("111");
                show_Bw.setText("1886");
                show_Ep.setText("92.3");
                show_Ew.setText("62.9");
                show_light.setText("16");
            }
            if (data.equals("47")) {
                show_Dfi.setText("111");
                show_Bw.setText("1889");
                show_Ep.setText("92");
                show_Ew.setText("62.9");
                show_light.setText("16");
            }
            if (data.equals("48")) {
                show_Dfi.setText("111");
                show_Bw.setText("1893");
                show_Ep.setText("91.7");
                show_Ew.setText("62.9");
                show_light.setText("16");
            }
            if (data.equals("49")) {
                show_Dfi.setText("111");
                show_Bw.setText("1896");
                show_Ep.setText("91.4");
                show_Ew.setText("63");
                show_light.setText("16");
            }
            if (data.equals("50")) {
                show_Dfi.setText("111");
                show_Bw.setText("1899");
                show_Ep.setText("91.1");
                show_Ew.setText("63");
                show_light.setText("16");
            }
            if (data.equals("51")) {
                show_Dfi.setText("111");
                show_Bw.setText("1903");
                show_Ep.setText("90.7");
                show_Ew.setText("63");
                show_light.setText("16");
            }
            if (data.equals("52")) {
                show_Dfi.setText("111");
                show_Bw.setText("1906");
                show_Ep.setText("90.4");
                show_Ew.setText("63");
                show_light.setText("16");
            }
            if (data.equals("53")) {
                show_Dfi.setText("111");
                show_Bw.setText("1909");
                show_Ep.setText("90");
                show_Ew.setText("63");
                show_light.setText("16");
            }
            if (data.equals("54")) {
                show_Dfi.setText("112");
                show_Bw.setText("1912");
                show_Ep.setText("89.7");
                show_Ew.setText("63.1");
                show_light.setText("16");
            }
            if (data.equals("55")) {
                show_Dfi.setText("112");
                show_Bw.setText("1915");
                show_Ep.setText("89.3");
                show_Ew.setText("63.1");
                show_light.setText("16");
            }
            if (data.equals("56")) {
                show_Dfi.setText("112");
                show_Bw.setText("1918");
                show_Ep.setText("88.9");
                show_Ew.setText("63.1");
                show_light.setText("16");
            }
            if (data.equals("57")) {
                show_Dfi.setText("112");
                show_Bw.setText("1920");
                show_Ep.setText("88.5");
                show_Ew.setText("63.1");
                show_light.setText("16");
            }
            if (data.equals("58")) {
                show_Dfi.setText("112");
                show_Bw.setText("1922");
                show_Ep.setText("88.1");
                show_Ew.setText("63.1");
                show_light.setText("16");
            }
            if (data.equals("59")) {
                show_Dfi.setText("112");
                show_Bw.setText("1924");
                show_Ep.setText("87.7");
                show_Ew.setText("63.2");
                show_light.setText("16");
            }
            if (data.equals("60")) {
                show_Dfi.setText("112");
                show_Bw.setText("1925");
                show_Ep.setText("87.3");
                show_Ew.setText("63.2");
                show_light.setText("16");
            }
            if (data.equals("61")) {
                show_Dfi.setText("112");
                show_Bw.setText("1927");
                show_Ep.setText("86.9");
                show_Ew.setText("63.2");
                show_light.setText("16");
            }
            if (data.equals("62")) {
                show_Dfi.setText("112");
                show_Bw.setText("1929");
                show_Ep.setText("86.4");
                show_Ew.setText("63.2");
                show_light.setText("16");
            }
            if (data.equals("63")) {
                show_Dfi.setText("112");
                show_Bw.setText("1930");
                show_Ep.setText("86");
                show_Ew.setText("63.2");
                show_light.setText("16");
            }
            if (data.equals("64")) {
                show_Dfi.setText("112");
                show_Bw.setText("1932");
                show_Ep.setText("85.5");
                show_Ew.setText("63.3");
                show_light.setText("16");
            }
            if (data.equals("65")) {
                show_Dfi.setText("112");
                show_Bw.setText("1933");
                show_Ep.setText("85.1");
                show_Ew.setText("63.3");
                show_light.setText("16");
            }
            if (data.equals("66")) {
                show_Dfi.setText("112");
                show_Bw.setText("1934");
                show_Ep.setText("84.6");
                show_Ew.setText("63.3");
                show_light.setText("16");
            }
            if (data.equals("67")) {
                show_Dfi.setText("112");
                show_Bw.setText("1935");
                show_Ep.setText("84.1");
                show_Ew.setText("63.3");
                show_light.setText("16");
            }
            if (data.equals("68")) {
                show_Dfi.setText("112");
                show_Bw.setText("1936");
                show_Ep.setText("83.7");
                show_Ew.setText("63.3");
                show_light.setText("16");
            }
            if (data.equals("69")) {
                show_Dfi.setText("112");
                show_Bw.setText("1937");
                show_Ep.setText("83.2");
                show_Ew.setText("63.4");
                show_light.setText("16");
            }
            if (data.equals("70")) {
                show_Dfi.setText("112");
                show_Bw.setText("1938");
                show_Ep.setText("82.7");
                show_Ew.setText("63.4");
                show_light.setText("");
            }
            if (data.equals("71")) {
                show_Dfi.setText("112");
                show_Bw.setText("1939");
                show_Ep.setText("82.2");
                show_Ew.setText("63.4");
                show_light.setText("16");
            }
            if (data.equals("72")) {
                show_Dfi.setText("112");
                show_Bw.setText("1940");
                show_Ep.setText("81.7");
                show_Ew.setText("63.4");
                show_light.setText("16");
            }
            if (data.equals("73")) {
                show_Dfi.setText("112");
                show_Bw.setText("1941");
                show_Ep.setText("81.3");
                show_Ew.setText("63.4");
                show_light.setText("16");
            }
            if (data.equals("74")) {
                show_Dfi.setText("112");
                show_Bw.setText("1942");
                show_Ep.setText("80.8");
                show_Ew.setText("63.5");
                show_light.setText("16");
            }
            if (data.equals("75")) {
                show_Dfi.setText("112");
                show_Bw.setText("1942");
                show_Ep.setText("80.3");
                show_Ew.setText("63.5");
                show_light.setText("16");
            }
            if (data.equals("76")) {
                show_Dfi.setText("112");
                show_Bw.setText("1943");
                show_Ep.setText("79.8");
                show_Ew.setText("63.5");
                show_light.setText("16");
            }
            if (data.equals("77")) {
                show_Dfi.setText("112");
                show_Bw.setText("1944");
                show_Ep.setText("79.3");
                show_Ew.setText("63.5");
                show_light.setText("16");
            }
            if (data.equals("78")) {
                show_Dfi.setText("112");
                show_Bw.setText("1944");
                show_Ep.setText("78.9");
                show_Ew.setText("63.5");
                show_light.setText("16");
            }
            if (data.equals("79")) {
                show_Dfi.setText("112");
                show_Bw.setText("1945");
                show_Ep.setText("78.4");
                show_Ew.setText("63.6");
                show_light.setText("16");
            }
            if (data.equals("80")) {
                show_Dfi.setText("112");
                show_Bw.setText("1945");
                show_Ep.setText("77.9");
                show_Ew.setText("63.6");
                show_light.setText("16");
            }
            if (data.equals("81")) {
                show_Dfi.setText("112");
                show_Bw.setText("1946");
                show_Ep.setText("77.5");
                show_Ew.setText("63.6");
                show_light.setText("16");
            }
            if (data.equals("82")) {
                show_Dfi.setText("112");
                show_Bw.setText("1946");
                show_Ep.setText("77");
                show_Ew.setText("63.6");
                show_light.setText("16");
            }
            if (data.equals("83")) {
                show_Dfi.setText("112");
                show_Bw.setText("1947");
                show_Ep.setText("76.5");
                show_Ew.setText("63.6");
                show_light.setText("16");
            }
            if (data.equals("84")) {
                show_Dfi.setText("112");
                show_Bw.setText("1947");
                show_Ep.setText("76.1");
                show_Ew.setText("63.7");
                show_light.setText("16");
            }
            if (data.equals("85")) {
                show_Dfi.setText("112");
                show_Bw.setText("1948");
                show_Ep.setText("75.6");
                show_Ew.setText("63.7");
                show_light.setText("16");
            }
            if (data.equals("86")) {
                show_Dfi.setText("112");
                show_Bw.setText("1948");
                show_Ep.setText("75.1");
                show_Ew.setText("63.7");
                show_light.setText("16");
            }
            if (data.equals("87")) {
                show_Dfi.setText("112");
                show_Bw.setText("1949");
                show_Ep.setText("74.6");
                show_Ew.setText("63.7");
                show_light.setText("16");
            }
            if (data.equals("88")) {
                show_Dfi.setText("112");
                show_Bw.setText("1949");
                show_Ep.setText("74.2");
                show_Ew.setText("63.7");
                show_light.setText("16");
            }
            if (data.equals("89")) {
                show_Dfi.setText("112");
                show_Bw.setText("1950");
                show_Ep.setText("73.7");
                show_Ew.setText("63.8");
                show_light.setText("16");
            }
            if (data.equals("90")) {
                show_Dfi.setText("112");
                show_Bw.setText("1950");
                show_Ep.setText("73.2");
                show_Ew.setText("63.8");
                show_light.setText("16");
            }


        }
    }
}
