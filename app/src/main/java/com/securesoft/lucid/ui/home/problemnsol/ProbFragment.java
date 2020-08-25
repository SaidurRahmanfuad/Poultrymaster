package com.securesoft.lucid.ui.home.problemnsol;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.securesoft.lucid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProbFragment extends Fragment {

    public ProbFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prob, container, false);
    }
}
