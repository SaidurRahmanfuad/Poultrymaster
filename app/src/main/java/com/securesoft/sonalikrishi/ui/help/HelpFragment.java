package com.securesoft.sonalikrishi.ui.help;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.securesoft.sonalikrishi.R;

public class HelpFragment extends Fragment {

    public HelpFragment() {
        // Required empty public constructor
    }

    LinearLayout call;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help, container, false);


        call = view.findViewById(R.id.callnow);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_NO_USER_ACTION);
                callIntent.setData(Uri.parse("tel:"+"+8801775662647"));
                startActivity(callIntent);
            }
        });
        return view;
    }

}
