package com.securesoft.sonalikrishi.ui.developer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.securesoft.sonalikrishi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SocialFragment extends Fragment implements View.OnClickListener {

    public SocialFragment() {
        // Required empty public constructor
    }
    CardView fb,utub,web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_social, container, false);
        fb=view.findViewById(R.id.fbgo);
        utub=view.findViewById(R.id.utubego);
        web=view.findViewById(R.id.webgo);

        fb.setOnClickListener(this);
        utub.setOnClickListener(this);
        web.setOnClickListener(this);

        return view;
    }
    private void onlineLink(String link)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(link));
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fbgo:
                onlineLink("https://facebook.com/PoultryMasterApp/");
                break;
            case R.id.utubego:

                onlineLink("https://youtube.com/DrSrabonHasanSajal/");
                break;
            case R.id.webgo:

                onlineLink("https://sonalikrishi.com/");
                break;


        }
    }
}
