package com.securesoft.lucid.ui.home.poultry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.securesoft.lucid.R;
import com.securesoft.lucid.ui.help.DoctorAdapter;
import com.securesoft.lucid.ui.help.DoctorModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PoltriFragment extends Fragment {
    RecyclerView recyclerViewpoltry;
    List<PoltryModel> poltryList;
    public PoltriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_poltri, container, false);
        recyclerViewpoltry = view.findViewById(R.id.recycler_poltrishow);
        recyclerViewpoltry.setHasFixedSize(true);
        recyclerViewpoltry.setLayoutManager(new GridLayoutManager(getContext(),2));

        // initData();
        recyclerViewpoltry.setAdapter(new PoltryAdapter(initDatapoltry()));
        return view;
    }
    private List<PoltryModel> initDatapoltry() {
        poltryList=new ArrayList<>();
        poltryList.add(new PoltryModel(R.drawable.mur,"Cobb 500 & Indian River(IR)"));
        poltryList.add(new PoltryModel(R.drawable.mur,"Sonali (Meat)"));
        poltryList.add(new PoltryModel(R.drawable.murgi,"Breeder(IR)"));
        poltryList.add(new PoltryModel(R.drawable.mur,"Hyline Brown"));
        poltryList.add(new PoltryModel(R.drawable.murgi,"ISA Brown"));
        poltryList.add(new PoltryModel(R.drawable.mur,"Novogen Brown"));
        poltryList.add(new PoltryModel(R.drawable.mur,"Bovans Brown"));
        poltryList.add(new PoltryModel(R.drawable.murgi,"Shaver Brown"));
        poltryList.add(new PoltryModel(R.drawable.mur,"Sajal Brown"));
        poltryList.add(new PoltryModel(R.drawable.murgi,"Sajal Red"));


        return poltryList;
    }
}
