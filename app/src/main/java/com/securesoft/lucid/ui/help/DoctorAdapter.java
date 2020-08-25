package com.securesoft.lucid.ui.help;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.securesoft.lucid.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.myViewholder> {
    List<DoctorModel> doctorlist;

    public DoctorAdapter(List<DoctorModel> doctorlist) {
        this.doctorlist = doctorlist;

    }

    @NonNull
    @Override
    public DoctorAdapter.myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.doctor_layout, parent, false);
        myViewholder holder = new myViewholder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorAdapter.myViewholder holder, int position) {
        holder.doctorimg.setImageResource(doctorlist.get(position).getImage());
        holder.docname.setText(doctorlist.get(position).getName());
        holder.docdesig.setText(doctorlist.get(position).getDesig());

    }

    @Override
    public int getItemCount() {
        return doctorlist.size();
    }

    public class myViewholder extends RecyclerView.ViewHolder {
        ImageView doctorimg;
        TextView docname, docdesig;

        public myViewholder(@NonNull View itemView) {
            super(itemView);
            doctorimg = itemView.findViewById(R.id.dotor_img);
            docname = itemView.findViewById(R.id.doctorName);
            docdesig = itemView.findViewById(R.id.doctordesig);

        }
    }
}
