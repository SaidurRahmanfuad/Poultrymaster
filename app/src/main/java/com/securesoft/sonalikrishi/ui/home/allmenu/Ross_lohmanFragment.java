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
public class Ross_lohmanFragment extends Fragment implements View.OnClickListener{
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    public Ross_lohmanFragment() {
        // Required empty public constructor
    }
    //work done

    private EditText input_rossloh;
    private Button ross_cleare, show;
    TextView show_Dfi, show_Cfi, show_Bw, show_Fs, show_Fe, show_Wa, show_Fcr;
    TextView show_lDfi, show_lCfi, show_lBw, show_lFs, show_lFe, show_lWa, show_lFcr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ross, container, false);
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

        show_Dfi = view.findViewById(R.id.show_ross_dfi);
        show_Cfi = view.findViewById(R.id.show_ross_cfi);
        show_Bw = view.findViewById(R.id.show_ross_bw);
        show_Fs = view.findViewById(R.id.show_ross_fs);
        show_Fe = view.findViewById(R.id.show_ross_feeder);
        show_Wa = view.findViewById(R.id.show_ross_water);
        show_Fcr = view.findViewById(R.id.show_ross_fcr);

        show_lDfi = view.findViewById(R.id.show_lohman_dfi);
        show_lCfi = view.findViewById(R.id.show_lohman_cfi);
        show_lBw = view.findViewById(R.id.show_lohman_bw);
        show_lFs = view.findViewById(R.id.show_lohman_fs);
        show_lFe = view.findViewById(R.id.show_lohman_feeder);
        show_lWa = view.findViewById(R.id.show_lohman_water);
        show_lFcr = view.findViewById(R.id.show_lohman_fcr);

        input_rossloh = view.findViewById(R.id.take_input_rossloh);
        ross_cleare = view.findViewById(R.id.clear_all_rossloh);
        show = view.findViewById(R.id.show_result_rossloh);
        show.setOnClickListener(this);
        ross_cleare.setOnClickListener(this);
        return view;
    }
//data entry done
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_result_rossloh:
                ross_data();
                lohman_data();
                break;
            case R.id.clear_all_rossloh:
                input_rossloh.setText("");
                show_Dfi.setText("");
                show_Cfi.setText("");
                show_Bw.setText("");
                show_Fs.setText("");
                show_Fe.setText("");
                show_Wa.setText("");
                show_Fcr.setText("");

                show_lDfi.setText("");
                show_lCfi.setText("");
                show_lBw.setText("");
                show_lFs.setText("");
                show_lFe.setText("");
                show_lWa.setText("");
                show_lFcr.setText("");

                break;

        }
    }
    public void ross_data(){

        String data;
        data=input_rossloh.getText().toString();
        if(data!=null) {
            if (data.equals("0")) {
                show_Bw.setText("43");
            }
            if (data.equals("1")) {

                show_Dfi.setText("13");
                show_Cfi.setText("13");
                show_Bw.setText("61");
                show_Fs.setText("0.2");
                show_Fe.setText("50");
                show_Wa.setText("50");

                show_Fcr.setText("0.206");

            }
            if (data.equals("2")) {

                show_Dfi.setText("17");
                show_Cfi.setText("29");
                show_Bw.setText("79");
                show_Fs.setText("0.25");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.37");

            }
            if (data.equals("3")) {

                show_Dfi.setText("21");
                show_Cfi.setText("50");
                show_Bw.setText("99");
                show_Fs.setText("0.3");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.502");

            }
            if (data.equals("4")) {

                show_Dfi.setText("24");
                show_Cfi.setText("74");
                show_Bw.setText("122");
                show_Fs.setText("0.35");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.607");

            }
            if (data.equals("5")) {

                show_Dfi.setText("28");
                show_Cfi.setText("102");
                show_Bw.setText("148");
                show_Fs.setText("0.4");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.693");

            }
            if (data.equals("6")) {

                show_Dfi.setText("32");
                show_Cfi.setText("134");
                show_Bw.setText("176");
                show_Fs.setText("0.4");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.763");

            }
            if (data.equals("7")) {

                show_Dfi.setText("36");
                show_Cfi.setText("170");
                show_Bw.setText("168");
                show_Fs.setText("0.4");
                show_Fe.setText("50");
                show_Wa.setText("50");
                show_Fcr.setText("0.821");

            }
            if (data.equals("8")) {

                show_Dfi.setText("40");
                show_Cfi.setText("211");
                show_Bw.setText("242");
                show_Fs.setText("0.45");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.869");

            }
            if (data.equals("9")) {

                show_Dfi.setText("45");
                show_Cfi.setText("255");
                show_Bw.setText("280");
                show_Fs.setText("0.5");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.911");

            }
            if (data.equals("10")) {

                show_Dfi.setText("49");
                show_Cfi.setText("304");
                show_Bw.setText("321");
                show_Fs.setText("0.55");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.947");

            }
            if (data.equals("11")) {

                show_Dfi.setText("54");
                show_Cfi.setText("358");
                show_Bw.setText("366");
                show_Fs.setText("0.6");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("0.979");

            }
            if (data.equals("12")) {

                show_Dfi.setText("58");
                show_Cfi.setText("416");
                show_Bw.setText("414");
                show_Fs.setText("0.65");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.007");

            }
            if (data.equals("13")) {

                show_Dfi.setText("63");
                show_Cfi.setText("480");
                show_Bw.setText("465");
                show_Fs.setText("0.7");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.033");

            }
            if (data.equals("14")) {

                show_Dfi.setText("69");
                show_Cfi.setText("548");
                show_Bw.setText("519");
                show_Fs.setText("0.7");
                show_Fe.setText("40");
                show_Wa.setText("40");
                show_Fcr.setText("1.057");

            }
            if (data.equals("15")) {

                show_Dfi.setText("74");
                show_Cfi.setText("622");
                show_Bw.setText("576");
                show_Fs.setText("0.75");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.08");

            }
            if (data.equals("16")) {

                show_Dfi.setText("79");
                show_Cfi.setText("702");
                show_Bw.setText("637");
                show_Fs.setText("0.8");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.101");

            }
            if (data.equals("17")) {

                show_Dfi.setText("85");
                show_Cfi.setText("786");
                show_Bw.setText("701");
                show_Fs.setText("0.85");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.122");

            }
            if (data.equals("18")) {

                show_Dfi.setText("90");
                show_Cfi.setText("877");
                show_Bw.setText("668");
                show_Fs.setText("0.9");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.142");

            }
            if (data.equals("19")) {

                show_Dfi.setText("96");
                show_Cfi.setText("973");
                show_Bw.setText("837");
                show_Fs.setText("0.95");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.162");

            }
            if (data.equals("20")) {

                show_Dfi.setText("102");
                show_Cfi.setText("1075");
                show_Bw.setText("910");
                show_Fs.setText("1");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.182");

            }
            //20
            if (data.equals("21")) {

                show_Dfi.setText("108");
                show_Cfi.setText("1183");
                show_Bw.setText("985");
                show_Fs.setText("1");
                show_Fe.setText("35");
                show_Wa.setText("35");
                show_Fcr.setText("1.201");

            }
            if (data.equals("22")) {

                show_Dfi.setText("114");
                show_Cfi.setText("1297");
                show_Bw.setText("1062");
                show_Fs.setText("1.2");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("1.221");

            }
            if (data.equals("23")) {

                show_Dfi.setText("120");
                show_Cfi.setText("1416");
                show_Bw.setText("1142");
                show_Fs.setText("1.12");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("1.24");

            }
            if (data.equals("24")) {

                show_Dfi.setText("125");
                show_Cfi.setText("1542");
                show_Bw.setText("1225");
                show_Fs.setText("1.2");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("1.259");

            }
            if (data.equals("25")) {

                show_Dfi.setText("131");
                show_Cfi.setText("1673");
                show_Bw.setText("1309");
                show_Fs.setText("1.2");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("1.278");

            }
            if (data.equals("26")) {

                show_Dfi.setText("137");
                show_Cfi.setText("1810");
                show_Bw.setText("1395");
                show_Fs.setText("1.2");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("1.297");

            }
            if (data.equals("27")) {

                show_Dfi.setText("143");
                show_Cfi.setText("1953");
                show_Bw.setText("1483");
                show_Fs.setText("1.2");
                show_Fe.setText("30");
                show_Wa.setText("30");
                show_Fcr.setText("1.317");

            }
            if (data.equals("28")) {

                show_Dfi.setText("149");
                show_Cfi.setText("2102");
                show_Bw.setText("1573");
                show_Fs.setText("1.2");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.336");

            }
            if (data.equals("29")) {

                show_Dfi.setText("154");
                show_Cfi.setText("2256");
                show_Bw.setText("1664");
                show_Fs.setText("1.3");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.355");

            }
            if (data.equals("30")) {

                show_Dfi.setText("160");
                show_Cfi.setText("2415");
                show_Bw.setText("1757");
                show_Fs.setText("1.3");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.375");

            }
            if (data.equals("31")) {

                show_Dfi.setText("165");
                show_Cfi.setText("2580");
                show_Bw.setText("1851");
                show_Fs.setText("1.3");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.394");

            }
            if (data.equals("32")) {

                show_Dfi.setText("170");
                show_Cfi.setText("2750");
                show_Bw.setText("1946");
                show_Fs.setText("1.4");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.414");

            }
            if (data.equals("33")) {

                show_Dfi.setText("175");
                show_Cfi.setText("2926");
                show_Bw.setText("2041");
                show_Fs.setText("1.4");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.433");

            }
            if (data.equals("34")) {

                show_Dfi.setText("180");
                show_Cfi.setText("3106");
                show_Bw.setText("2138");
                show_Fs.setText("1.4");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.453");

            }
            if (data.equals("35")) {

                show_Dfi.setText("185");
                show_Cfi.setText("3290");
                show_Bw.setText("2235");
                show_Fs.setText("1.5");
                show_Fe.setText("25");
                show_Wa.setText("25");
                show_Fcr.setText("1.473");

            }
            if (data.equals("36")) {

                show_Dfi.setText("189");
                show_Cfi.setText("3480");
                show_Bw.setText("2332");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.492");

            }
            if (data.equals("37")) {

                show_Dfi.setText("194");
                show_Cfi.setText("3674");
                show_Bw.setText("2430");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.512");

            }
            if (data.equals("38")) {

                show_Dfi.setText("198");
                show_Cfi.setText("3872");
                show_Bw.setText("2527");
                show_Fs.setText("");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.532");

            }
            if (data.equals("39")) {

                show_Dfi.setText("202");
                show_Cfi.setText("4074");
                show_Bw.setText("2625");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.552");

            }

            if (data.equals("40")) {

                show_Dfi.setText("206");
                show_Cfi.setText("4279");
                show_Bw.setText("2723");
                show_Fs.setText("1.5");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.571");

            }
            if (data.equals("41")) {

                show_Dfi.setText("209");
                show_Cfi.setText("4489");
                show_Bw.setText("2821");
                show_Fs.setText("1.7");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.591");

            }
            if (data.equals("42")) {

                show_Dfi.setText("213");
                show_Cfi.setText("4702");
                show_Bw.setText("2918");
                show_Fs.setText("1.7");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.611");

            }
            if (data.equals("43")) {

                show_Dfi.setText("216");
                show_Cfi.setText("4918");
                show_Bw.setText("3015");
                show_Fs.setText("1.7");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.631");

            }
            if (data.equals("44")) {

                show_Dfi.setText("219");
                show_Cfi.setText("5137");
                show_Bw.setText("3112");
                show_Fs.setText("1.8");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.651");

            }
            if (data.equals("45")) {

                show_Dfi.setText("222");
                show_Cfi.setText("5359");
                show_Bw.setText("3207");
                show_Fs.setText("1.8");
                show_Fe.setText("20");
                show_Wa.setText("20");
                show_Fcr.setText("1.671");

            }


        }
    }
    public void lohman_data(){
        String data;
        data=input_rossloh.getText().toString();
        if (data.equals("0")) {
            show_Bw.setText("42");
        }
        if (data.equals("1")) {

            show_lDfi.setText("13");
            show_lCfi.setText("13");
            show_lBw.setText("55");
            show_lFs.setText("0.2");
            show_lFe.setText("50");
            show_lWa.setText("50");

            show_lFcr.setText("0.236");

        }
        if (data.equals("2")) {

            show_lDfi.setText("15");
            show_lCfi.setText("28");
            show_lBw.setText("68");
            show_lFs.setText("0.25");
            show_lFe.setText("50");
            show_lWa.setText("50");
            show_lFcr.setText("0.412");

        }
        if (data.equals("3")) {

            show_lDfi.setText("18");
            show_lCfi.setText("46");
            show_lBw.setText("83");
            show_lFs.setText("0.3");
            show_lFe.setText("50");
            show_lWa.setText("50");
            show_lFcr.setText("0.554");

        }
        if (data.equals("4")) {

            show_lDfi.setText("21");
            show_lCfi.setText("67");
            show_lBw.setText("101");
            show_lFs.setText("0.35");
            show_lFe.setText("50");
            show_lWa.setText("50");
            show_lFcr.setText("0.663");

        }
        if (data.equals("5")) {

            show_lDfi.setText("25");
            show_lCfi.setText("92");
            show_lBw.setText("121");
            show_lFs.setText("0.4");
            show_lFe.setText("50");
            show_lWa.setText("50");
            show_lFcr.setText("0.760");

        }
        if (data.equals("6")) {

            show_lDfi.setText("27");
            show_lCfi.setText("119");
            show_lBw.setText("143");
            show_lFs.setText("0.4");
            show_lFe.setText("50");
            show_lWa.setText("50");
            show_lFcr.setText("0.832");

        }
        if (data.equals("7")) {

            show_lDfi.setText("31");
            show_lCfi.setText("150");
            show_lBw.setText("168");
            show_lFs.setText("0.4");
            show_lFe.setText("50");
            show_lWa.setText("50");
            show_lFcr.setText("0.893");

        }
        if (data.equals("8")) {

            show_lDfi.setText("35");
            show_lCfi.setText("185");
            show_lBw.setText("195");
            show_lFs.setText("0.45");
            show_lFe.setText("40");
            show_lWa.setText("40");
            show_lFcr.setText("0.949");

        }
        if (data.equals("9")) {

            show_lDfi.setText("39");
            show_lCfi.setText("224");
            show_lBw.setText("226");
            show_lFs.setText("0.5");
            show_lFe.setText("40");
            show_lWa.setText("40");
            show_lFcr.setText("0.991");

        }
        if (data.equals("10")) {

            show_lDfi.setText("43");
            show_lCfi.setText("267");
            show_lBw.setText("260");
            show_lFs.setText("0.55");
            show_lFe.setText("40");
            show_lWa.setText("40");
            show_lFcr.setText("1.027");

        }
        if (data.equals("11")) {

            show_lDfi.setText("48");
            show_lCfi.setText("315");
            show_lBw.setText("296");
            show_lFs.setText("0.6");
            show_lFe.setText("40");
            show_lWa.setText("40");
            show_lFcr.setText("1.064");

        }
        if (data.equals("12")) {

            show_lDfi.setText("53");
            show_lCfi.setText("368");
            show_lBw.setText("336");
            show_lFs.setText("0.65");
            show_lFe.setText("40");
            show_lWa.setText("40");
            show_lFcr.setText("1.095");

        }
        if (data.equals("13")) {

            show_lDfi.setText("58");
            show_lCfi.setText("426");
            show_lBw.setText("378");
            show_lFs.setText("0.7");
            show_lFe.setText("40");
            show_lWa.setText("40");
            show_lFcr.setText("1.127");

        }
        if (data.equals("14")) {

            show_lDfi.setText("63");
            show_lCfi.setText("419");
            show_lBw.setText("425");
            show_lFs.setText("0.7");
            show_lFe.setText("40");
            show_lWa.setText("40");
            show_lFcr.setText("1.151");

        }
        if (data.equals("15")) {

            show_lDfi.setText("69");
            show_lCfi.setText("558");
            show_lBw.setText("474");
            show_lFs.setText("0.75");
            show_lFe.setText("35");
            show_lWa.setText("35");
            show_lFcr.setText("1.177");

        }
        if (data.equals("16")) {

            show_lDfi.setText("74");
            show_lCfi.setText("632");
            show_lBw.setText("526");
            show_lFs.setText("0.8");
            show_lFe.setText("35");
            show_lWa.setText("35");
            show_lFcr.setText("1.202");

        }
        if (data.equals("17")) {

            show_lDfi.setText("81");
            show_lCfi.setText("713");
            show_lBw.setText("581");
            show_lFs.setText("0.85");
            show_lFe.setText("35");
            show_lWa.setText("35");
            show_lFcr.setText("1.227");

        }
        if (data.equals("18")) {

            show_lDfi.setText("86");
            show_lCfi.setText("799");
            show_lBw.setText("640");
            show_lFs.setText("0.9");
            show_lFe.setText("35");
            show_lWa.setText("35");
            show_lFcr.setText("1.248");

        }
        if (data.equals("19")) {

            show_lDfi.setText("93");
            show_lCfi.setText("892");
            show_lBw.setText("701");
            show_lFs.setText("0.95");
            show_lFe.setText("35");
            show_lWa.setText("35");
            show_lFcr.setText("1.272");

        }
        if (data.equals("20")) {

            show_lDfi.setText("99");
            show_lCfi.setText("991");
            show_lBw.setText("765");
            show_lFs.setText("1");
            show_lFe.setText("35");
            show_lWa.setText("35");
            show_lFcr.setText("1.295");

        }
        //20
        if (data.equals("21")) {

            show_lDfi.setText("105");
            show_lCfi.setText("1096");
            show_lBw.setText("832");
            show_lFs.setText("1");
            show_lFe.setText("35");
            show_lWa.setText("35");
            show_lFcr.setText("1.317");

        }
        if (data.equals("22")) {

            show_lDfi.setText("111");
            show_lCfi.setText("1207");
            show_lBw.setText("902");
            show_lFs.setText("1.2");
            show_lFe.setText("30");
            show_lWa.setText("30");
            show_lFcr.setText("1.338");

        }
        if (data.equals("23")) {

            show_lDfi.setText("118");
            show_lCfi.setText("1325");
            show_lBw.setText("974");
            show_lFs.setText("1.12");
            show_lFe.setText("30");
            show_lWa.setText("30");
            show_lFcr.setText("1.36");

        }
        if (data.equals("24")) {

            show_lDfi.setText("124");
            show_lCfi.setText("1449");
            show_lBw.setText("1048");
            show_lFs.setText("1.2");
            show_lFe.setText("30");
            show_lWa.setText("30");
            show_lFcr.setText("1.383");

        }
        if (data.equals("25")) {

            show_lDfi.setText("130");
            show_lCfi.setText("1579");
            show_lBw.setText("1125");
            show_lFs.setText("1.2");
            show_lFe.setText("30");
            show_lWa.setText("30");
            show_lFcr.setText("1.404");

        }
        if (data.equals("26")) {

            show_lDfi.setText("137");
            show_lCfi.setText("176");
            show_lBw.setText("1204");
            show_lFs.setText("1.2");
            show_lFe.setText("30");
            show_lWa.setText("30");
            show_lFcr.setText("1.425");

        }
        if (data.equals("27")) {

            show_lDfi.setText("142");
            show_lCfi.setText("1858");
            show_lBw.setText("1284");
            show_lFs.setText("1.2");
            show_lFe.setText("30");
            show_lWa.setText("30");
            show_lFcr.setText("1.447");

        }
        if (data.equals("28")) {

            show_lDfi.setText("149");
            show_lCfi.setText("2007");
            show_lBw.setText("1366");
            show_lFs.setText("1.2");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.469");

        }
        if (data.equals("29")) {

            show_lDfi.setText("154");
            show_lCfi.setText("2161");
            show_lBw.setText("1450");
            show_lFs.setText("1.3");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.49");

        }
        if (data.equals("30")) {

            show_lDfi.setText("160");
            show_lCfi.setText("2321");
            show_lBw.setText("1535");
            show_lFs.setText("1.3");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.512");

        }
        if (data.equals("31")) {

            show_lDfi.setText("166");
            show_lCfi.setText("2487");
            show_lBw.setText("1622");
            show_lFs.setText("1.3");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.533");

        }
        if (data.equals("32")) {

            show_lDfi.setText("170");
            show_lCfi.setText("2657");
            show_lBw.setText("1709");
            show_lFs.setText("1.4");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.555");

        }
        if (data.equals("33")) {

            show_lDfi.setText("176");
            show_lCfi.setText("2833");
            show_lBw.setText("1797");
            show_lFs.setText("1.4");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.577");

        }
        if (data.equals("34")) {

            show_lDfi.setText("180");
            show_lCfi.setText("3013");
            show_lBw.setText("1886");
            show_lFs.setText("1.4");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.598");

        }
        if (data.equals("35")) {

            show_lDfi.setText("185");
            show_lCfi.setText("3198");
            show_lBw.setText("1976");
            show_lFs.setText("1.5");
            show_lFe.setText("25");
            show_lWa.setText("25");
            show_lFcr.setText("1.618");

        }
        if (data.equals("36")) {

            show_lDfi.setText("190");
            show_lCfi.setText("3388");
            show_lBw.setText("2066");
            show_lFs.setText("1.5");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.64");

        }
        if (data.equals("37")) {

            show_lDfi.setText("194");
            show_lCfi.setText("3582");
            show_lBw.setText("2156");
            show_lFs.setText("1.5");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.661");

        }
        if (data.equals("38")) {

            show_lDfi.setText("198");
            show_lCfi.setText("3780");
            show_lBw.setText("2246");
            show_lFs.setText("");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.683");

        }
        if (data.equals("39")) {

            show_lDfi.setText("201");
            show_lCfi.setText("3981");
            show_lBw.setText("2336");
            show_lFs.setText("1.5");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.704");

        }

        if (data.equals("40")) {

            show_lDfi.setText("205");
            show_lCfi.setText("4186");
            show_lBw.setText("2426");
            show_lFs.setText("1.5");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.725");

        }
        if (data.equals("41")) {

            show_lDfi.setText("208");
            show_lCfi.setText("4394");
            show_lBw.setText("2515");
            show_lFs.setText("1.7");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.747");

        }
        if (data.equals("42")) {

            show_lDfi.setText("211");
            show_lCfi.setText("4605");
            show_lBw.setText("2604");
            show_lFs.setText("1.7");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.768");

        }
        if (data.equals("43")) {

            show_lDfi.setText("215");
            show_lCfi.setText("4820");
            show_lBw.setText("2692");
            show_lFs.setText("1.7");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.79");

        }
        if (data.equals("44")) {

            show_lDfi.setText("216");
            show_lCfi.setText("5036");
            show_lBw.setText("2780");
            show_lFs.setText("1.8");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.812");

        }
        if (data.equals("45")) {

            show_lDfi.setText("219");
            show_lCfi.setText("5255");
            show_lBw.setText("2866");
            show_lFs.setText("1.8");
            show_lFe.setText("20");
            show_lWa.setText("20");
            show_lFcr.setText("1.834");

        }
    }
}
