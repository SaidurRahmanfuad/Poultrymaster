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
public class HylinFragment extends Fragment implements View.OnClickListener{
//work done
private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    public HylinFragment() {
        // Required empty public constructor
    }

    private EditText input_hylin;
    private Button hylin_cleare, show;
    TextView show_Dfi,show_Ep, show_Ew,show_Bw,show_light;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_hylin, container, false);
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


        show_Dfi = view.findViewById(R.id.show_hylin_dfi);
        show_Bw = view.findViewById(R.id.show_hylin_bw);
        show_Ep = view.findViewById(R.id.show_hylin_production);
        show_Ew = view.findViewById(R.id.show_hylin_eggweight);
        show_light = view.findViewById(R.id.show_hylin_light);



        input_hylin = view.findViewById(R.id.take_input_hylin);
        hylin_cleare = view.findViewById(R.id.clear_all_hylin);
        show = view.findViewById(R.id.show_result_hylin);
        show.setOnClickListener(this);
        hylin_cleare.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_hylin:
                hylin_data();
                break;
            case R.id.clear_all_hylin:
                hylin_cleare.setText("");
                show_Dfi.setText("");
                show_Bw.setText("");
                show_Ep.setText("");
                show_Ew.setText("");
                show_light.setText("");

                break;

        }
    }
    public void hylin_data(){

        String data;
        data=input_hylin.getText().toString();
        if(data!=null) {
            if (data.equals("0")) {
                Toast.makeText(getContext(), "Nothing to show!!", Toast.LENGTH_SHORT).show();
            }
            if (data.equals("1")) {
                show_Dfi.setText("14-15");
                show_Bw.setText("0.06-0.07");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("24");
            }
            if (data.equals("2")) {
                show_Dfi.setText("17-21");
                show_Bw.setText("0.12-0.13");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("23");
            }
            if (data.equals("3")) {
                show_Dfi.setText("23-25");
                show_Bw.setText("0.18-0.20");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("22");
            }
            if (data.equals("4")) {
                show_Dfi.setText("27-29");
                show_Bw.setText("0.26-0.27");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("21");
            }
            if (data.equals("5")) {
                show_Dfi.setText("34-36");
                show_Bw.setText("0.35-0.37");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("20");
            }
            if (data.equals("6")) {
                show_Dfi.setText("38-40");
                show_Bw.setText("0.65-0.69");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("19");
            }
            if (data.equals("7")) {
                show_Dfi.setText("41-43");
                show_Bw.setText("0.54-0.58");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("18");
            }
            if (data.equals("8")) {
                show_Dfi.setText("45-47");
                show_Bw.setText("0.65-1.69");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("17");
            }
            if (data.equals("9")) {
                show_Dfi.setText("49-53");
                show_Bw.setText("0.76-0.80");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("15");
            }
            if (data.equals("10")) {
                show_Dfi.setText("52-56");
                show_Bw.setText("0.86-0.92");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("11")) {
                show_Dfi.setText("58-62");
                show_Bw.setText("0.96-1.02");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("12")) {
                show_Dfi.setText("62-66");
                show_Bw.setText("1.05-1.11");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12");
            }
            if (data.equals("13")) {
                show_Dfi.setText("67-71");
                show_Bw.setText("1.13-1.20");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12:30");
            }
            if (data.equals("14")) {
                show_Dfi.setText("70-74");
                show_Bw.setText("1.19-1.27");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("15")) {
                show_Dfi.setText("72-76");
                show_Bw.setText("1.26-1.34");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13:30");
            }
            if (data.equals("16")) {
                show_Dfi.setText("75-79");
                show_Bw.setText("1.33-1.41");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("17")) {
                show_Dfi.setText("78-82");
                show_Bw.setText("1.4-1.48");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14:30");
            }
            if (data.equals("18")) {
                show_Dfi.setText("82-88");
                show_Bw.setText("1.47-1.57");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("15");
            }
            if (data.equals("19")) {
                show_Dfi.setText("85-91");
                show_Bw.setText("1.57-1.67");
                show_Ep.setText("24-38");
                show_Ew.setText("49-51");
                show_light.setText("15:30");
            }
            if (data.equals("20")) {
                show_Dfi.setText("91-97");
                show_Bw.setText("1.63-1.73");
                show_Ep.setText("45-72");
                show_Ew.setText("50.2-52.2");
                show_light.setText("16");
            }
            if (data.equals("21")) {
                show_Dfi.setText("95-101");
                show_Bw.setText("1.67-1.77");
                show_Ep.setText("75-86");
                show_Ew.setText("51.5-53.6");
                show_light.setText("16");
            }
            if (data.equals("22")) {
                show_Dfi.setText("99-105");
                show_Bw.setText("1.72-1.82");
                show_Ep.setText("87-92");
                show_Ew.setText("53.1-55.3");
                show_light.setText("16");
            }
            if (data.equals("23")) {
                show_Dfi.setText("103-109");
                show_Bw.setText("1.75-1.89");
                show_Ep.setText("92-94");
                show_Ew.setText("54.4-56.6");
                show_light.setText("16");
            }
            if (data.equals("24")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.78-1.90");
                show_Ep.setText("92-95");
                show_Ew.setText("55.5-57.7");
                show_light.setText("16");
            }
            if (data.equals("25")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1..79-1.91");
                show_Ep.setText("93-95");
                show_Ew.setText("56.6-59");
                show_light.setText("16");
            }
            if (data.equals("26")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.80-1.92");
                show_Ep.setText("94-96");
                show_Ew.setText("57.3-59.7");
                show_light.setText("16");
            }
            if (data.equals("27")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.82-1.94");
                show_Ep.setText("95-96");
                show_Ew.setText("58.4-60.8");
                show_light.setText("16");
            }
            if (data.equals("28")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.83-1.95");
                show_Ep.setText("95-96");
                show_Ew.setText("59-61.4");
                show_light.setText("16");
            }
            if (data.equals("29")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.84-1.96");
                show_Ep.setText("95-96");
                show_Ew.setText("59.3-61.7");
                show_light.setText("16");
            }
            if (data.equals("30")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.84-1.96");
                show_Ep.setText("94-96");
                show_Ew.setText("59.7-62.1");
                show_light.setText("16");
            } if (data.equals("31")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.84-1.96");
                show_Ep.setText("94-96");
                show_Ew.setText("59.6-62.3");
                show_light.setText("16");
            }
            if (data.equals("32")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.84-1.97");
                show_Ep.setText("94-96");
                show_Ew.setText("60.1-62.5");
                show_light.setText("16");
            }
            if (data.equals("33")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.84-1.97");
                show_Ep.setText("94-95");
                show_Ew.setText("60.3-62.7");
                show_light.setText("16");
            } if (data.equals("34")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.84-1.97");
                show_Ep.setText("94-95");
                show_Ew.setText("60.5-62.9");
                show_light.setText("16");
            } if (data.equals("35")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.84-1.97");
                show_Ep.setText("94-95");
                show_Ew.setText("60.6-63");
                show_light.setText("16");
            } if (data.equals("36")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.86-1.98");
                show_Ep.setText("93-94");
                show_Ew.setText("60.7-63.1");
                show_light.setText("16");
            } if (data.equals("37")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.86-1.98");
                show_Ep.setText("93-94");
                show_Ew.setText("60.8-63.2");
                show_light.setText("16");
            }
            if (data.equals("38")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.86-1.98");
                show_Ep.setText("93-94");
                show_Ew.setText("60.9-63.3");
                show_light.setText("16");
            } if (data.equals("39")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.87-1.99");
                show_Ep.setText("92-93");
                show_Ew.setText("61-63.4");
                show_light.setText("16");
            } if (data.equals("40")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.87-1.99");
                show_Ep.setText("92-93");
                show_Ew.setText("61.1-63.5");
                show_light.setText("16");
            }
            if (data.equals("41")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.87-1.99");
                show_Ep.setText("91-93");
                show_Ew.setText("61.2-63.6");
                show_light.setText("16");
            }
            if (data.equals("42")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.88-2");
                show_Ep.setText("91-92");
                show_Ew.setText("61.3-63.9");
                show_light.setText("16");
            }
            if (data.equals("43")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.88-2");
                show_Ep.setText("90-92");
                show_Ew.setText("61.5-64.1");
                show_light.setText("16");
            } if (data.equals("44")) {
                show_Dfi.setText("108-114");
                show_Bw.setText("1.88-2");
                show_Ep.setText("90-92");
                show_Ew.setText("61.6-64.2");
                show_light.setText("16");
            }
            if (data.equals("45")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("89-91");
                show_Ew.setText("61.6-64.2");
                show_light.setText("16");
            } if (data.equals("46")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("89-91");
                show_Ew.setText("61.7-64.3");
                show_light.setText("16");
            } if (data.equals("47")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("88-90");
                show_Ew.setText("61.8-64.4");
                show_light.setText("16");
            } if (data.equals("48")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("88-90");
                show_Ew.setText("61.9-64.5");
                show_light.setText("16");
            } if (data.equals("49")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("88-90");
                show_Ew.setText("62-64.6");
                show_light.setText("16");
            }
            if (data.equals("50")) {
                show_Dfi.setText("107-113");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("88-89");
                show_Ew.setText("62.1-64.7");
                show_light.setText("16");
            }
            if (data.equals("51")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("87-89");
                show_Ew.setText("62.1-64.7");
                show_light.setText("16");
            }
            if (data.equals("52")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("87-89");
                show_Ew.setText("62.2-64.8");
                show_light.setText("16");
            }
            if (data.equals("53")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("87-89");
                show_Ew.setText("62.2-64.8");
                show_light.setText("16");
            }
            if (data.equals("54")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.89-2.01");
                show_Ep.setText("87-88");
                show_Ew.setText("62.2-64.8");
                show_light.setText("16");
            }
            if (data.equals("55")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("86-88");
                show_Ew.setText("62.2-64.8");
                show_light.setText("16");
            }
            if (data.equals("56")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("86-87");
                show_Ew.setText("62.3-64.9");
                show_light.setText("16");
            }
            if (data.equals("57")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("85-87");
                show_Ew.setText("62.3-64.9");
                show_light.setText("16");
            }
            if (data.equals("58")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("85-87");
                show_Ew.setText("62.3-64.9");
                show_light.setText("16");
            }
            if (data.equals("59")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("85-87");
                show_Ew.setText("62.4-65.0");
                show_light.setText("16");
            }
            if (data.equals("60")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("84-86");
                show_Ew.setText("62.4-65.0");
                show_light.setText("16");
            }
            if (data.equals("61")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("84-86");
                show_Ew.setText("62.5-65.1");
                show_light.setText("16");
            }
            if (data.equals("62")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("83-86");
                show_Ew.setText("62.5-65.1");
                show_light.setText("16");
            }
            if (data.equals("63")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("83-85");
                show_Ew.setText("62.6-65.2");
                show_light.setText("16");
            }
            if (data.equals("64")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("83-85");
                show_Ew.setText("62.6-65.2");
                show_light.setText("16");
            }
            if (data.equals("65")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("83-85");
                show_Ew.setText("62.7-65.3");
                show_light.setText("16");
            }
            if (data.equals("66")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("82-84");
                show_Ew.setText("62.7-65.3");
                show_light.setText("16");
            }
            if (data.equals("67")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("81-84");
                show_Ew.setText("62.8-65.4");
                show_light.setText("16");
            }
            if (data.equals("68")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("81-83");
                show_Ew.setText("62.8-65.4");
                show_light.setText("16");
            }
            if (data.equals("69")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.9-2.02");
                show_Ep.setText("81-82");
                show_Ew.setText("62.9-65.5");
                show_light.setText("16");
            }
            if (data.equals("70")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("80-82");
                show_Ew.setText("62.9-65.5");
                show_light.setText("");
            }
            if (data.equals("71")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("79-81");
                show_Ew.setText("63.0-65.6");
                show_light.setText("16");
            }
            if (data.equals("72")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("79-81");
                show_Ew.setText("63.0-65.6");
                show_light.setText("16");
            }
            if (data.equals("73")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("78-80");
                show_Ew.setText("63.1-65.7");
                show_light.setText("16");
            }
            if (data.equals("74")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("77-80");
                show_Ew.setText("63.1-65.7");
                show_light.setText("16");
            }
            if (data.equals("75")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("76-79");
                show_Ew.setText("63.2-65.8");
                show_light.setText("16");
            }
            if (data.equals("76")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("76-78");
                show_Ew.setText("63.2-65.8");
                show_light.setText("16");
            }
            if (data.equals("77")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("75-77");
                show_Ew.setText("63.3-65.9");
                show_light.setText("16");
            }
            if (data.equals("78")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("75-77");
                show_Ew.setText("63.3-65.9");
                show_light.setText("16");
            }
            if (data.equals("79")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("74-77");
                show_Ew.setText("63.4-66.0");
                show_light.setText("16");
            } if (data.equals("80")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("74-76");
                show_Ew.setText("63.5-66.1");
                show_light.setText("16");
            }
            if (data.equals("81")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("74-76");
                show_Ew.setText("63.5-66.1");
                show_light.setText("16");
            }
            if (data.equals("82")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("74-76");
                show_Ew.setText("63.5-66.1");
                show_light.setText("16");
            } if (data.equals("83")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("73-75");
                show_Ew.setText("63.6-66.2");
                show_light.setText("16");
            } if (data.equals("84")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("73-75");
                show_Ew.setText("63.6-66.2");
                show_light.setText("16");
            } if (data.equals("85")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("73-75");
                show_Ew.setText("63.6-66.2");
                show_light.setText("16");
            } if (data.equals("86")) {
                show_Dfi.setText("106-112");
                show_Bw.setText("1.91-2.03");
                show_Ep.setText("73-75");
                show_Ew.setText("63.6-66.2");
                show_light.setText("16");
            }
                if (data.equals("87")) {
                    show_Dfi.setText("106-112");
                    show_Bw.setText("1.91-2.03");
                    show_Ep.setText("72-74");
                    show_Ew.setText("63.7-66.3");
                    show_light.setText("16");
                }
                if (data.equals("88")) {
                    show_Dfi.setText("106-112");
                    show_Bw.setText("1.91-2.03");
                    show_Ep.setText("72-74");
                    show_Ew.setText("63.7-66.3");
                    show_light.setText("16");
                }
                if (data.equals("89")) {
                    show_Dfi.setText("106-112");
                    show_Bw.setText("1.91-2.03");
                    show_Ep.setText("72-74");
                    show_Ew.setText("63.7-66.3");
                    show_light.setText("16");
                }
                if (data.equals("90")) {
                    show_Dfi.setText("106-112");
                    show_Bw.setText("1.91-2.03");
                    show_Ep.setText("72-74");
                    show_Ew.setText("63.7-66.3");
                    show_light.setText("16");
                }
                if (data.equals("91")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.92-2.04");
                show_Ep.setText("71-73");
                show_Ew.setText("63.8-66.4");
                show_light.setText("16");
            } if (data.equals("92")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.92-2.04");
                show_Ep.setText("71-73");
                show_Ew.setText("63.8-66.4");
                show_light.setText("16");
            } if (data.equals("93")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.92-2.04");
                show_Ep.setText("71-73");
                show_Ew.setText("63.8-66.4");
                show_light.setText("16");
            } if (data.equals("94")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.92-2.04");
                show_Ep.setText("71-73");
                show_Ew.setText("63.9-66.5");
                show_light.setText("16");
            } if (data.equals("95")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.92-2.04");
                show_Ep.setText("70-72");
                show_Ew.setText("63.9-66.5");
                show_light.setText("16");
            } if (data.equals("96")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.92-2.04");
                show_Ep.setText("70-72");
                show_Ew.setText("63.9-66.5");
                show_light.setText("16");
            } if (data.equals("97")) {
                show_Dfi.setText("105-111");
                show_Bw.setText("1.92-2.04");
                show_Ep.setText("70-72");
                show_Ew.setText("64.0-66.6");
                show_light.setText("16");
            }

        if (data.equals("98")) {
            show_Dfi.setText("105-111");
            show_Bw.setText("1.92-2.04");
            show_Ep.setText("69-71");
            show_Ew.setText("64.0-66.6");
            show_light.setText("16");
        }
        if (data.equals("99")) {
            show_Dfi.setText("105-111");
            show_Bw.setText("1.92-2.04");
            show_Ep.setText("69-71");
            show_Ew.setText("64.0-66.6");
            show_light.setText("16");
        }
        if (data.equals("100")) {
            show_Dfi.setText("105-111");
            show_Bw.setText("1.92-2.04");
            show_Ep.setText("69-71");
            show_Ew.setText("64.0-66.7");
            show_light.setText("16");
        }

        }
    }
}
