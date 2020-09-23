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
public class NovoFragment extends Fragment implements View.OnClickListener{
//work done
private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    public NovoFragment() {
        // Required empty public constructor
    }
    private EditText input_novo;
    private Button novo_cleare, show;
    TextView show_nDfi,show_Ep, show_Ew,show_Bw,show_light;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_novo, container, false);
        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-7815226488144324/4318916201");

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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/5248854494");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        show_nDfi = view.findViewById(R.id.show_novo_dfi);
        show_Bw = view.findViewById(R.id.show_novo_bw);
        show_Ep = view.findViewById(R.id.show_novo_production);
        show_Ew = view.findViewById(R.id.show_novo_eggweight);
        show_light = view.findViewById(R.id.show_novo_light);



        input_novo = view.findViewById(R.id.take_input_novo);
        novo_cleare = view.findViewById(R.id.clear_all_novo);
        show = view.findViewById(R.id.show_result_novo);
        show.setOnClickListener(this);
        novo_cleare.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_novo:
               novo_data();
                break;
            case R.id.clear_all_novo:
                input_novo.setText("");
                show_nDfi.setText("");
                show_Bw.setText("");
                show_Ep.setText("");
                show_Ew.setText("");
                show_light.setText("");
                break;

        }
    }public void novo_data(){

        String data;
        data=input_novo.getText().toString();
        if(data!=null) {
            if (data.equals("0")) {
                Toast.makeText(getContext(), "Nothing to show!!", Toast.LENGTH_SHORT).show();
            }
            if (data.equals("1")) {
                show_nDfi.setText("12");
                show_Bw.setText("65-70");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("24");
            }
            if (data.equals("2")) {
                show_nDfi.setText("18");
                show_Bw.setText("110-120");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("23");
            }
            if (data.equals("3")) {
                show_nDfi.setText("26");
                show_Bw.setText("190-200");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("22");
            }
            if (data.equals("4")) {
                show_nDfi.setText("33");
                show_Bw.setText("280-295");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("21");
            }
            if (data.equals("5")) {
                show_nDfi.setText("38");
                show_Bw.setText("380-400");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("20");
            }
            if (data.equals("6")) {
                show_nDfi.setText("43");
                show_Bw.setText("475-500");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("19");
            }
            if (data.equals("7")) {
                show_nDfi.setText("47");
                show_Bw.setText("570-600");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("18");
            }
            if (data.equals("8")) {
                show_nDfi.setText("51");
                show_Bw.setText("660-695");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("17");
            }
            if (data.equals("9")) {
                show_nDfi.setText("55");
                show_Bw.setText("750-790");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("15");
            }
            if (data.equals("10")) {
                show_nDfi.setText("59");
                show_Bw.setText("840-900");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("11")) {
                show_nDfi.setText("64");
                show_Bw.setText("930-990");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("12")) {
                show_nDfi.setText("69");
                show_Bw.setText("1020-1090");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12");
            }
            if (data.equals("13")) {
                show_nDfi.setText("70");
                show_Bw.setText("1110-1180");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("12:30");
            }
            if (data.equals("14")) {
                show_nDfi.setText("73");
                show_Bw.setText("1190-1250");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13");
            }
            if (data.equals("15")) {
                show_nDfi.setText("76");
                show_Bw.setText("1270-1340");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("13:30");
            }
            if (data.equals("16")) {
                show_nDfi.setText("79");
                show_Bw.setText("1350-1420");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14");
            }
            if (data.equals("17")) {
                show_nDfi.setText("81");
                show_Bw.setText("1430-1510");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("14:30");
            }
            if (data.equals("18")) {
                show_nDfi.setText("83");
                show_Bw.setText("1500");
                show_Ep.setText("0");
                show_Ew.setText("0");
                show_light.setText("15");
            }
            if (data.equals("19")) {
                show_nDfi.setText("87");
                show_Bw.setText("1580");
                show_Ep.setText("15");
                show_Ew.setText("44");
                show_light.setText("15:30");
            }
            if (data.equals("20")) {
                show_nDfi.setText("94");
                show_Bw.setText("1640");
                show_Ep.setText("41");
                show_Ew.setText("48.3");
                show_light.setText("16");
            }
            if (data.equals("21")) {
                show_nDfi.setText("104");
                show_Bw.setText("1685");
                show_Ep.setText("65");
                show_Ew.setText("51");
                show_light.setText("16");
            } if (data.equals("22")) {
                show_nDfi.setText("108");
                show_Bw.setText("1720");
                show_Ep.setText("82");
                show_Ew.setText("53.5");
                show_light.setText("16");
            } if (data.equals("23")) {
                show_nDfi.setText("112");
                show_Bw.setText("1745");
                show_Ep.setText("90");
                show_Ew.setText("55.6");
                show_light.setText("16");
            } if (data.equals("24")) {
                show_light.setText("16");
                show_nDfi.setText("113");
                show_Bw.setText("1765");
                show_Ep.setText("93");
                show_Ew.setText("56.9");
            } if (data.equals("25")) {
                show_light.setText("16");
                show_nDfi.setText("114");
                show_Bw.setText("1780");
                show_Ep.setText("94");
                show_Ew.setText("58.2");
            } if (data.equals("26")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1790");
                show_Ep.setText("95");
                show_Ew.setText("59.1");
            } if (data.equals("27")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1805");
                show_Ep.setText("95");
                show_Ew.setText("59.7");
            } if (data.equals("28")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1815");
                show_Ep.setText("95");
                show_Ew.setText("60.2");
            } if (data.equals("29")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1820");
                show_Ep.setText("95");
                show_Ew.setText("60.7");
            } if (data.equals("30")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1820");
                show_Ep.setText("95");
                show_Ew.setText("61.1");
            }
            if (data.equals("31")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1825");
                show_Ep.setText("95");
                show_Ew.setText("61.5");
            }
            if (data.equals("32")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1825");
                show_Ep.setText("95");
                show_Ew.setText("61.8");
            }
            if (data.equals("33")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1825");
                show_Ep.setText("95");
                show_Ew.setText("62.1");
            }
            if (data.equals("34")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1830");
                show_Ep.setText("95");
                show_Ew.setText("62.4");
            } if (data.equals("35")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1830");
                show_Ep.setText("94");
                show_Ew.setText("62.7");
            } if (data.equals("36")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1835");
                show_Ep.setText("94");
                show_Ew.setText("62.9");
            } if (data.equals("37")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1835");
                show_Ep.setText("94");
                show_Ew.setText("63.1");
            } if (data.equals("38")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1840");
                show_Ep.setText("94");
                show_Ew.setText("63.3");
            } if (data.equals("39")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1840");
                show_Ep.setText("94");
                show_Ew.setText("63.3");
            } if (data.equals("40")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1840");
                show_Ep.setText("94");
                show_Ew.setText("63.5");
            } if (data.equals("41")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1845");
                show_Ep.setText("94");
                show_Ew.setText("63.6");
            } if (data.equals("42")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1845");
                show_Ep.setText("93");
                show_Ew.setText("63.7");
            } if (data.equals("43")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1850");
                show_Ep.setText("93");
                show_Ew.setText("63.8");
            } if (data.equals("44")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1850");
                show_Ep.setText("93");
                show_Ew.setText("63.9");
            } if (data.equals("45")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1850");
                show_Ep.setText("92");
                show_Ew.setText("64");
            } if (data.equals("46")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1855");
                show_Ep.setText("92");
                show_Ew.setText("64.1");
            } if (data.equals("47")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1855");
                show_Ep.setText("92");
                show_Ew.setText("64.2");
            } if (data.equals("48")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1860");
                show_Ep.setText("91");
                show_Ew.setText("64.3");
            } if (data.equals("49")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1860");
                show_Ep.setText("91");
                show_Ew.setText("64.4");
            }
            if (data.equals("50")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1800");
                show_Ep.setText("91");
                show_Ew.setText("64.1");
            }
            if (data.equals("51")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1865");
                show_Ep.setText("90");
                show_Ew.setText("64.6");
            } if (data.equals("52")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1865");
                show_Ep.setText("90");
                show_Ew.setText("64.7");
            } if (data.equals("53")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1865");
                show_Ep.setText("89");
                show_Ew.setText("64.8");
            } if (data.equals("54")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1870");
                show_Ep.setText("89");
                show_Ew.setText("64.9");
            } if (data.equals("55")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1870");
                show_Ep.setText("88");
                show_Ew.setText("65");
            } if (data.equals("56")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1875");
                show_Ep.setText("88");
                show_Ew.setText("65");
            } if (data.equals("57")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1875");
                show_Ep.setText("87");
                show_Ew.setText("65.1");
            } if (data.equals("58")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1880");
                show_Ep.setText("87");
                show_Ew.setText("65.1");
            } if (data.equals("59")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1880");
                show_Ep.setText("86");
                show_Ew.setText("65.2");
            } if (data.equals("60")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1880");
                show_Ep.setText("86");
                show_Ew.setText("65.2");
            } if (data.equals("61")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1885");
                show_Ep.setText("85");
                show_Ew.setText("65.3");
            } if (data.equals("62")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1885");
                show_Ep.setText("85");
                show_Ew.setText("65.3");
            } if (data.equals("63")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1890");
                show_Ep.setText("84");
                show_Ew.setText("65.4");
            } if (data.equals("64")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1890");
                show_Ep.setText("84");
                show_Ew.setText("65.4");
            }
            if (data.equals("65")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1890");
                show_Ep.setText("83");
                show_Ew.setText("65.5");
            } if (data.equals("66")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1895");
                show_Ep.setText("83");
                show_Ew.setText("65.5");
            } if (data.equals("67")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1895");
                show_Ep.setText("82");
                show_Ew.setText("65.6");
            } if (data.equals("68")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1900");
                show_Ep.setText("82");
                show_Ew.setText("65.6");
            }
            if (data.equals("69")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1900");
                show_Ep.setText("81");
                show_Ew.setText("65.7");
            }
            if (data.equals("70")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1900");
                show_Ep.setText("81");
                show_Ew.setText("65.7");
            } if (data.equals("71")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1905");
                show_Ep.setText("80");
                show_Ew.setText("65.8");
            } if (data.equals("72")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1905");
                show_Ep.setText("79");
                show_Ew.setText("65.8");
            } if (data.equals("73")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1910");
                show_Ep.setText("79");
                show_Ew.setText("65.9");
            } if (data.equals("74")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1910");
                show_Ep.setText("78");
                show_Ew.setText("65.9");
            } if (data.equals("75")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1910");
                show_Ep.setText("77");
                show_Ew.setText("66");
            }
            if (data.equals("76")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1915");
                show_Ep.setText("77");
                show_Ew.setText("66");
            }
            if (data.equals("77")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1915");
                show_Ep.setText("76");
                show_Ew.setText("66.1");
            } if (data.equals("78")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("76");
                show_Ew.setText("66.1");
            } if (data.equals("79")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("75");
                show_Ew.setText("66.1");
            }
            if (data.equals("80")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("74");
                show_Ew.setText("66.1");
            }
            if (data.equals("81")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("74");
                show_Ew.setText("66.2");
            }
            if (data.equals("82")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("74");
                show_Ew.setText("66.2");
            } if (data.equals("83")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("73");
                show_Ew.setText("66.3");
            } if (data.equals("84")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("72");
                show_Ew.setText("66.3");
            } if (data.equals("85")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("72");
                show_Ew.setText("66.4");
            } if (data.equals("86")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("71");
                show_Ew.setText("66.4");
            } if (data.equals("87")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("71");
                show_Ew.setText("66.5");
            } if (data.equals("88")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("70");
                show_Ew.setText("66.5");
            } if (data.equals("89")) {
                show_light.setText("16");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("70");
                show_Ew.setText("66.6");
            }
            if (data.equals("90")) {
                show_light.setText("16 ");
                show_nDfi.setText("115");
                show_Bw.setText("1920");
                show_Ep.setText("69");
                show_Ew.setText("66.6");
            }




        }
    }


}
