package com.securesoft.lucid.ui.help;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.securesoft.lucid.MainActivity;
import com.securesoft.lucid.R;
import com.securesoft.lucid.ui.home.HomeFragment;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HelpFragment extends Fragment {

    public HelpFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerViewdoctor;
    List<DoctorModel>doctorList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help, container, false);
        recyclerViewdoctor = view.findViewById(R.id.recycler_doctorshow);
        recyclerViewdoctor.setHasFixedSize(true);
        recyclerViewdoctor.setLayoutManager(new LinearLayoutManager(getContext()));

     // initData();
      recyclerViewdoctor.setAdapter(new DoctorAdapter(initData()));

        
        return view;
    }

    private List<DoctorModel> initData() {
        doctorList=new ArrayList<>();
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));
        doctorList.add(new DoctorModel(R.drawable.sayed,"Dr.Provat","Senior docto"));


        return doctorList;
    }

}
