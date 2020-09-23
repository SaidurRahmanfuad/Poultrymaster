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
public class MctcFragment extends Fragment implements View.OnClickListener{
//work done
private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    public MctcFragment() {
        // Required empty public constructor
    }
    private EditText input_mctc;
    private Button mctc_cleare, show;
    TextView show_Dfi, show_Dw, show_Cfi, show_Bw, show_fcr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mctc, container, false);
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
        mInterstitialAd.setAdUnitId("ca-app-pub-7815226488144324/6847795050");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        show_Dfi = view.findViewById(R.id.show_white_dfi);
        show_Dw = view.findViewById(R.id.show_white_dw);
        show_Cfi = view.findViewById(R.id.show_white_cfi);
        show_Bw = view.findViewById(R.id.show_white_bw);
        show_fcr = view.findViewById(R.id.show_white_fcr);



        input_mctc = view.findViewById(R.id.take_input_white);
        mctc_cleare = view.findViewById(R.id.clear_all_white);
        show = view.findViewById(R.id.show_result_white);
        show.setOnClickListener(this);
        mctc_cleare.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_white:
                mctc_data();
                break;
            case R.id.clear_all_white:
                input_mctc.setText("");
                show_Dfi.setText("");
                show_Bw.setText("");
                show_Dw.setText("");
                show_Cfi.setText("");
                show_fcr.setText("");

                break;

        }
    }
    public void mctc_data(){

        String data;
        data=input_mctc.getText().toString();
        if(data!=null) {
            if (data.equals("0")) {
                show_Dfi.setText("0");
                show_Dw.setText("0");
                show_Cfi.setText("0");
                show_Bw.setText("22-25");
                show_fcr.setText("0");
            }
            if (data.equals("1")) {
                show_Dfi.setText("7-10");
                show_Dw.setText("20-25");
                show_Cfi.setText("50-70");
                show_Bw.setText("80-85");
                show_fcr.setText("0.63-0.82");
            }
            if (data.equals("2")) {
                show_Dfi.setText("13-16");
                show_Dw.setText("35-45");
                show_Cfi.setText("145-180");
                show_Bw.setText("135-155");
                show_fcr.setText("1.07-1.16");
            }
            if (data.equals("3")) {
                show_Dfi.setText("28-32");
                show_Dw.setText("65-75");
                show_Cfi.setText("345-400");
                show_Bw.setText("246-265");
                show_fcr.setText("1.40-1.50");
            }
            if (data.equals("4")) {
                show_Dfi.setText("36-39");
                show_Dw.setText("75-95");
                show_Cfi.setText("600-670");
                show_Bw.setText("362-382");
                show_fcr.setText("1.66-1.75");
            }
            if (data.equals("5")) {
                show_Dfi.setText("46-49");
                show_Dw.setText("95-120");
                show_Cfi.setText("925-1010");
                show_Bw.setText("495-515");
                show_fcr.setText("1.87-1.96");
            }
            if (data.equals("6")) {
                show_Dfi.setText("55-57");
                show_Dw.setText("120-145");
                show_Cfi.setText("1310-1410");
                show_Bw.setText("635-652");
                show_fcr.setText("2.06-2.16");
            }
            if (data.equals("7")) {
                show_Dfi.setText("57-68");
                show_Dw.setText("125-150");
                show_Cfi.setText("1711-1885");
                show_Bw.setText("780-815");
                show_fcr.setText("2.19-2.31");
            }  if (data.equals("8")) {
                show_Dfi.setText("77-79");
                show_Dw.setText("140-175");
                show_Cfi.setText("2200-2400");
                show_Bw.setText("975-1000");
                show_fcr.setText("2.20-2.40");
            }


        }
    }
}
