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
public class Hubb_arborFragment extends Fragment implements View.OnClickListener {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    //work done
    public Hubb_arborFragment() {
        // Required empty public constructor
    }

    private EditText input_hubb;
    private Button hub_cleare, show;
    TextView show_Dfi, show_Cfi, show_Bw, show_Fs, show_Fe, show_Wa, show_Fcr;
    TextView show_aDfi, show_aCfi, show_aBw, show_aFs, show_aFe, show_aWa, show_aFcr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hubb, container, false);

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

        show_Dfi = view.findViewById(R.id.show_hubb_dfi);
        show_Cfi = view.findViewById(R.id.show_hubb_cfi);
        show_Bw = view.findViewById(R.id.show_hubb_bw);
        show_Fs = view.findViewById(R.id.show_hubb_fs);
        show_Fe = view.findViewById(R.id.show_hubb_feeder);
        show_Wa = view.findViewById(R.id.show_hubb_water);
        show_Fcr = view.findViewById(R.id.show_hubb_fcr);
        //arb
        show_aDfi = view.findViewById(R.id.show_arbor_dfi);
        show_aCfi = view.findViewById(R.id.show_arbor_cfi);
        show_aBw = view.findViewById(R.id.show_arbor_bw);
        show_aFs = view.findViewById(R.id.show_arbor_fs);
        show_aFe = view.findViewById(R.id.show_arbor_feeder);
        show_aWa = view.findViewById(R.id.show_arbor_water);
        show_aFcr = view.findViewById(R.id.show_arbor_fcr);


        input_hubb = view.findViewById(R.id.take_input_hubb);
        hub_cleare = view.findViewById(R.id.clear_all_hubb);
        show = view.findViewById(R.id.show_result_hubb);
        show.setOnClickListener(this);
        hub_cleare.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.show_result_hubb:
                hubb_data();
                arbor_data();
                break;
            case R.id.clear_all_hubb:
                input_hubb.setText("");
                show_Dfi.setText("");
                show_Cfi.setText("");
                show_Bw.setText("");
                show_Fs.setText("");
                show_Fe.setText("");
                show_Wa.setText("");
                show_Fcr.setText("");

                show_aDfi.setText("");
                show_aCfi.setText("");
                show_aBw.setText("");
                show_aFs.setText("");
                show_aFe.setText("");
                show_aWa.setText("");
                show_aFcr.setText("");

                break;

        }

    }

    public void hubb_data() {

        String data;
        data = input_hubb.getText().toString();
        if (data != null) {
            if (data.equals("0")) {
                Toast.makeText(getContext(), "Nothing to show!!", Toast.LENGTH_SHORT).show();
            }
            if (data.equals("1")) {
                show_Dfi.setText("14");
                show_Cfi.setText("14");
                show_Bw.setText("59");
                show_Fs.setText("0.2");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.237");

                show_aDfi.setText("12");
                show_aCfi.setText("12");
                show_aBw.setText("60");

                show_aFs.setText("0.2");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.202");
            }
            if (data.equals("2")) {
                show_Dfi.setText("18");
                show_Cfi.setText("32");
                show_Bw.setText("76");
                show_Fs.setText("0.25");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.421");
            }
            if (data.equals("3")) {
                show_Dfi.setText("21");
                show_Cfi.setText("53");
                show_Bw.setText("94");
                show_Fs.setText("0.3");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.496");
            }
            if (data.equals("4")) {
                show_Dfi.setText("25");
                show_Cfi.setText("78");
                show_Bw.setText("115");
                show_Fs.setText("0.35");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.678");
            }
            if (data.equals("5")) {
                show_Dfi.setText("28");
                show_Cfi.setText("106");
                show_Bw.setText("140");
                show_Fs.setText("0.4");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.757");
            }
            if (data.equals("6")) {
                show_Dfi.setText("30");
                show_Cfi.setText("136");
                show_Bw.setText("168");
                show_Fs.setText("0.4");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.81");
            }
            if (data.equals("7")) {
                show_Dfi.setText("33");
                show_Cfi.setText("169");
                show_Bw.setText("197");
                show_Fs.setText("0.4");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.858");
            }
            if (data.equals("8")) {
                show_Dfi.setText("35");
                show_Cfi.setText("204");
                show_Bw.setText("226");
                show_Fs.setText("0.45");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.903");
            }
            if (data.equals("9")) {
                show_Dfi.setText("41");
                show_Cfi.setText("245");
                show_Bw.setText("262");
                show_Fs.setText("0.5");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.915");
            }
            if (data.equals("10")) {
                show_Dfi.setText("46");
                show_Cfi.setText("292");
                show_Bw.setText("301");
                show_Fs.setText("0.55");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.97");
            }
            if (data.equals("11")) {
                show_Dfi.setText("52");
                show_Cfi.setText("344");
                show_Bw.setText("346");
                show_Fs.setText("0.6");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.994");
            }
            if (data.equals("12")) {
                show_Dfi.setText("58");
                show_Cfi.setText("402");
                show_Bw.setText("394");
                show_Fs.setText("0.65");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.02");
            }
            if (data.equals("13")) {
                show_Dfi.setText("65");
                show_Cfi.setText("467");
                show_Bw.setText("446");
                show_Fs.setText("0.7");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.047");
            }
            if (data.equals("14")) {
                show_Dfi.setText("71");
                show_Cfi.setText("538");
                show_Bw.setText("502");
                show_Fs.setText("0.7");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.07");
            }
            if (data.equals("15")) {
                show_Dfi.setText("78");
                show_Cfi.setText("617");
                show_Bw.setText("561");
                show_Fs.setText("0.75");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.1");
            }
            if (data.equals("16")) {
                show_Dfi.setText("85");
                show_Cfi.setText("701");
                show_Bw.setText("624");
                show_Fs.setText("0.8");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.12");
            }
            if (data.equals("17")) {
                show_Dfi.setText("92");
                show_Cfi.setText("793");
                show_Bw.setText("690");
                show_Fs.setText("0.85");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.15");
            }
            if (data.equals("18")) {
                show_Dfi.setText("99");
                show_Cfi.setText("892");
                show_Bw.setText("760");
                show_Fs.setText("0.9");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.17");
            }
            if (data.equals("19")) {
                show_Dfi.setText("107");
                show_Cfi.setText("999");
                show_Bw.setText("833");
                show_Fs.setText("0.95");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.2");
            }

            if (data.equals("20")) {
                show_Dfi.setText("113");
                show_Cfi.setText("1112");
                show_Bw.setText("906");
                show_Fs.setText("1");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.22");
            }
            if (data.equals("21")) {
                show_Dfi.setText("120");
                show_Cfi.setText("1232");
                show_Bw.setText("986");
                show_Fs.setText("1");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.25");
            }
            if (data.equals("22")) {
                show_Dfi.setText("127");
                show_Cfi.setText("1359");
                show_Bw.setText("1095");
                show_Fs.setText("1.2");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.28");
            }
            if (data.equals("23")) {
                show_Dfi.setText("132");
                show_Cfi.setText("1491");
                show_Bw.setText("1147");
                show_Fs.setText("1.12");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("1.3");
            }
            if (data.equals("24")) {
                show_Dfi.setText("138");
                show_Cfi.setText("1629");
                show_Bw.setText("1230");
                show_Fs.setText("1.2");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.32");
            }
            if (data.equals("25")) {
                show_Dfi.setText("144");
                show_Cfi.setText("1773");
                show_Bw.setText("1315");
                show_Fs.setText("1.2");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.35");
            }
            if (data.equals("26")) {
                show_Dfi.setText("150");
                show_Cfi.setText("1923");
                show_Bw.setText("1401");
                show_Fs.setText("1.2");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.37");
            }
            if (data.equals("27")) {
                show_Dfi.setText("156");
                show_Cfi.setText("2079");
                show_Bw.setText("1489");
                show_Fs.setText("1.2");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.4");
            }
            if (data.equals("28")) {
                show_Dfi.setText("162");
                show_Cfi.setText("2240");
                show_Bw.setText("1578");
                show_Fs.setText("1.2");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.42");
            }
            if (data.equals("29")) {
                show_Dfi.setText("166");
                show_Cfi.setText("2406");
                show_Bw.setText("1667");
                show_Fs.setText("1.3");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.44");
            }
            if (data.equals("30")) {
                show_Dfi.setText("171");
                show_Cfi.setText("2577");
                show_Bw.setText("1758");
                show_Fs.setText("1.3");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.47");
            }
            if (data.equals("31")) {
                show_Dfi.setText("176");
                show_Cfi.setText("2754");
                show_Bw.setText("1851");
                show_Fs.setText("1.3");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.49");
            }
            if (data.equals("32")) {
                show_Dfi.setText("182");
                show_Cfi.setText("2935");
                show_Bw.setText("1944");
                show_Fs.setText("1.4");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.51");
            }
            if (data.equals("33")) {
                show_Dfi.setText("186");
                show_Cfi.setText("3121");
                show_Bw.setText("2039");
                show_Fs.setText("1.4");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.53");
            }
            if (data.equals("34")) {
                show_Dfi.setText("190");
                show_Cfi.setText("3311");
                show_Bw.setText("2134");
                show_Fs.setText("1.4");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.55");
            }
            if (data.equals("35")) {
                show_Dfi.setText("194");
                show_Cfi.setText("3505");
                show_Bw.setText("2229");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.57");
            }
            if (data.equals("36")) {
                show_Dfi.setText("198");
                show_Cfi.setText("3703");
                show_Bw.setText("2324");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.59");
            }
            if (data.equals("37")) {
                show_Dfi.setText("201");
                show_Cfi.setText("3905");
                show_Bw.setText("2418");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.62");
            }
            if (data.equals("38")) {
                show_Dfi.setText("205");
                show_Cfi.setText("4110");
                show_Bw.setText("2512");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.64");
            }
            if (data.equals("39")) {
                show_Dfi.setText("209");
                show_Cfi.setText("4318");
                show_Bw.setText("2606");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.66");
            }
            if (data.equals("40")) {
                show_Dfi.setText("212");
                show_Cfi.setText("4530");
                show_Bw.setText("2699");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.68");
            }
            if (data.equals("41")) {
                show_Dfi.setText("215");
                show_Cfi.setText("4745");
                show_Bw.setText("2792");
                show_Fs.setText("1.7");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.7");
            }
            if (data.equals("42")) {
                show_Dfi.setText("217");
                show_Cfi.setText("4962");
                show_Bw.setText("2885");
                show_Fs.setText("1.7");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.72");
            }
            if (data.equals("43")) {
                show_Dfi.setText("219");
                show_Cfi.setText("5181");
                show_Bw.setText("2977");
                show_Fs.setText("1.7");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.74");
            }
            if (data.equals("44")) {
                show_Dfi.setText("222");
                show_Cfi.setText("5403");
                show_Bw.setText("3068");
                show_Fs.setText("1.8");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.76");
            }
            if (data.equals("45")) {
                show_Dfi.setText("224");
                show_Cfi.setText("5627");
                show_Bw.setText("3159");
                show_Fs.setText("1.8");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.78");
            }


        }
    }

    public void arbor_data() {
        String data;
        data = input_hubb.getText().toString();
        if (data != null) {
            if (data.equals("0")) {
                Toast.makeText(getContext(), "Nothing to show!!", Toast.LENGTH_SHORT).show();
            }
            if (data.equals("1")) {
                show_aDfi.setText("12");
                show_aCfi.setText("12");
                show_aBw.setText("60");

                show_aFs.setText("0.2");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.202");
            }
            if (data.equals("2")) {
                show_aDfi.setText("16");
                show_aCfi.setText("28");
                show_aBw.setText("77");
                show_aFs.setText("0.25");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.364");
            }
            if (data.equals("3")) {
                show_aDfi.setText("20");
                show_aCfi.setText("48");
                show_aBw.setText("96");
                show_aFs.setText("0.3");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.496");
            }
            if (data.equals("4")) {
                show_aDfi.setText("24");
                show_aCfi.setText("71");
                show_aBw.setText("118");
                show_aFs.setText("0.35");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.602");
            }
            if (data.equals("5")) {
                show_aDfi.setText("28");
                show_aCfi.setText("99");
                show_aBw.setText("144");
                show_aFs.setText("0.4");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.689");
            }
            if (data.equals("6")) {
                show_aDfi.setText("32");
                show_aCfi.setText("131");
                show_aBw.setText("172");
                show_aFs.setText("0.4");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.761");
            }
            if (data.equals("7")) {
                show_aDfi.setText("36");
                show_aCfi.setText("167");
                show_aBw.setText("203");
                show_aFs.setText("0.4");
                show_aFe.setText("50");
                show_aWa.setText("50");
                show_aFcr.setText("0.821");
            }
            if (data.equals("8")) {
                show_aDfi.setText("40");
                show_aCfi.setText("207");
                show_aBw.setText("238");
                show_aFs.setText("0.45");
                show_aFe.setText("40");
                show_aWa.setText("40");
                show_aFcr.setText("0.872");
            }
            if (data.equals("9")) {
                show_aDfi.setText("45");
                show_aCfi.setText("252");
                show_aBw.setText("276");
                show_aFs.setText("0.5");
                show_aFe.setText("40");
                show_aWa.setText("40");
                show_aFcr.setText("0.915");
            }
            if (data.equals("10")) {
                show_aDfi.setText("50");
                show_aCfi.setText("302");
                show_aBw.setText("317");
                show_aFs.setText("0.55");
                show_aFe.setText("40");
                show_aWa.setText("40");
                show_aFcr.setText("0.952");
            }
            if (data.equals("11")) {
                show_aDfi.setText("55");
                show_aCfi.setText("357");
                show_aBw.setText("363");
                show_aFs.setText("0.6");
                show_aFe.setText("40");
                show_aWa.setText("40");
                show_aFcr.setText("0.985");
            }
            if (data.equals("12")) {
                show_aDfi.setText("60");
                show_aCfi.setText("418");
                show_aBw.setText("412");
                show_aFs.setText("0.65");
                show_aFe.setText("40");
                show_aWa.setText("40");
                show_aFcr.setText("1.015");
            }
            if (data.equals("13")) {
                show_aDfi.setText("66");
                show_aCfi.setText("484");
                show_aBw.setText("464");
                show_aFs.setText("0.7");
                show_aFe.setText("40");
                show_aWa.setText("40");
                show_aFcr.setText("1.042");
            }
            if (data.equals("14")) {
                show_aDfi.setText("72");
                show_aCfi.setText("555");
                show_aBw.setText("520");
                show_aFs.setText("0.7");
                show_aFe.setText("40");
                show_aWa.setText("40");
                show_aFcr.setText("1.067");
            }
            if (data.equals("15")) {
                show_aDfi.setText("77");
                show_aCfi.setText("632");
                show_aBw.setText("580");
                show_aFs.setText("0.75");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.09");
            }
            if (data.equals("16")) {
                show_aDfi.setText("83");
                show_aCfi.setText("716");
                show_aBw.setText("644");
                show_aFs.setText("0.8");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.112");
            }
            if (data.equals("17")) {
                show_aDfi.setText("90");
                show_aCfi.setText("805");
                show_aBw.setText("710");
                show_aFs.setText("0.85");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.134");
            }
            if (data.equals("18")) {
                show_aDfi.setText("96");
                show_aCfi.setText("901");
                show_aBw.setText("781");
                show_aFs.setText("0.9");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.154");
            }
            if (data.equals("19")) {
                show_aDfi.setText("102");
                show_aCfi.setText("1003");
                show_aBw.setText("854");
                show_aFs.setText("0.95");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.174");
            }

            if (data.equals("20")) {
                show_aDfi.setText("103");
                show_aCfi.setText("1081");
                show_aBw.setText("903");
                show_aFs.setText("0.95");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.197");
            }
            if (data.equals("21")) {
                show_aDfi.setText("115");
                show_aCfi.setText("1190");
                show_aBw.setText("1011");
                show_aFs.setText("1");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.213");
            }
            if (data.equals("22")) {
                show_aDfi.setText("118");
                show_aCfi.setText("1349");
                show_aBw.setText("1094");
                show_aFs.setText("1");
                show_aFe.setText("35");
                show_aWa.setText("35");
                show_aFcr.setText("1.232");
            }
            if (data.equals("23")) {
                show_aDfi.setText("121");
                show_aCfi.setText("1477");
                show_aBw.setText("1180");
                show_aFs.setText("1.2");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.252");
            }
            if (data.equals("24")) {
                show_aDfi.setText("135");
                show_aCfi.setText("1552");
                show_aBw.setText("1296");
                show_aFs.setText("1.12");
                show_aFe.setText("30");
                show_aWa.setText("30");
                show_aFcr.setText("1.271");
            }
            if (data.equals("25")) {
                show_aDfi.setText("141");
                show_aCfi.setText("153");
                show_aBw.setText("1360");
                show_aFs.setText("1.2");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.29");
            }
            if (data.equals("26")) {
                show_aDfi.setText("148");
                show_aCfi.setText("1901");
                show_aBw.setText("1453");
                show_aFs.setText("1.2");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.306");
            }
            if (data.equals("27")) {
                show_aDfi.setText("154");
                show_aCfi.setText("2055");
                show_aBw.setText("1548");
                show_aFs.setText("1.2");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.327");
            }
            if (data.equals("28")) {
                show_aDfi.setText("150");
                show_aCfi.setText("2118");
                show_aBw.setText("1567");
                show_aFs.setText("1.2");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.352");
            }
            if (data.equals("29")) {
                show_aDfi.setText("167");
                show_aCfi.setText("2382");
                show_aBw.setText("1745");
                show_aFs.setText("1.2");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.365");
            }

            if (data.equals("30")) {
                show_aDfi.setText("173");
                show_aCfi.setText("2555");
                show_aBw.setText("1845");
                show_aFs.setText("1.3");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.384");
            }
            if (data.equals("31")) {
                show_aDfi.setText("179");
                show_aCfi.setText("2733");
                show_aBw.setText("1948");
                show_aFs.setText("1.3");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.403");
            }
            if (data.equals("32")) {
                show_aDfi.setText("184");
                show_aCfi.setText("2918");
                show_aBw.setText("2051");
                show_aFs.setText("1.3");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.423");
            }
            if (data.equals("33")) {
                show_aDfi.setText("190");
                show_aCfi.setText("3108");
                show_aBw.setText("2156");
                show_aFs.setText("1.4");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.442");
            }
            if (data.equals("34")) {
                show_aDfi.setText("195");
                show_aCfi.setText("3303");
                show_aBw.setText("2261");
                show_aFs.setText("1.4");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.461");
            }
            if (data.equals("35")) {
                show_aDfi.setText("200");
                show_aCfi.setText("3503");
                show_aBw.setText("2367");
                show_aFs.setText("1.4");
                show_aFe.setText("25");
                show_aWa.setText("25");
                show_aFcr.setText("1.48");
            }
            if (data.equals("36")) {
                show_aDfi.setText("205");
                show_aCfi.setText("3708");
                show_aBw.setText("2474");
                show_aFs.setText("1.5");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.499");
            }
            if (data.equals("37")) {
                show_aDfi.setText("210");
                show_aCfi.setText("3918");
                show_aBw.setText("2581");
                show_aFs.setText("1.5");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.518");
            }
            if (data.equals("38")) {
                show_aDfi.setText("215");
                show_aCfi.setText("4133");
                show_aBw.setText("2689");
                show_aFs.setText("1.5");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.537");
            }
            if (data.equals("39")) {
                show_aDfi.setText("219");
                show_aCfi.setText("4352");
                show_aBw.setText("2796");
                show_aFs.setText("1.5");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.556");
            }
            if (data.equals("40")) {
                show_aDfi.setText("223");
                show_aCfi.setText("4575");
                show_aBw.setText("2904");
                show_aFs.setText("1.5");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.576");
            }
            if (data.equals("41")) {
                show_aDfi.setText("227");
                show_aCfi.setText("4801");
                show_aBw.setText("3011");
                show_aFs.setText("1.5");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.595");
            }
            if (data.equals("42")) {
                show_aDfi.setText("230");
                show_aCfi.setText("5032");
                show_aBw.setText("3118");
                show_aFs.setText("1.7");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.614");
            }
            if (data.equals("43")) {
                show_aDfi.setText("234");
                show_aCfi.setText("5265");
                show_aBw.setText("3225");
                show_aFs.setText("1.7");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.633");
            }
            if (data.equals("44")) {
                show_aDfi.setText("237");
                show_aCfi.setText("5502");
                show_aBw.setText("3331");
                show_aFs.setText("1.7");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.652");
            }
            if (data.equals("45")) {
                show_aDfi.setText("240");
                show_aCfi.setText("5742");
                show_aBw.setText("3436");
                show_aFs.setText("1.8");
                show_aFe.setText("20");
                show_aWa.setText("20");
                show_aFcr.setText("1.671");
            }


        }
    }
}
