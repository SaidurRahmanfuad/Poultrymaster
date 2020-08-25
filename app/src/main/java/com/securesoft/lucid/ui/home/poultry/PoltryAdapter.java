package com.securesoft.lucid.ui.home.poultry;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.securesoft.lucid.R;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class PoltryAdapter extends RecyclerView.Adapter<PoltryAdapter.poltryViewholder>{
    List<PoltryModel> poltrylist;

    public PoltryAdapter(List<PoltryModel> poltrylist) {
        this.poltrylist = poltrylist;

    }

    @NonNull
    @Override
    public PoltryAdapter.poltryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.poltri_item_layout, parent, false);
        PoltryAdapter.poltryViewholder holder = new PoltryAdapter.poltryViewholder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PoltryAdapter.poltryViewholder holder, int position) {
        holder.poltryimg.setImageResource(poltrylist.get(position).getImage());
        holder.poltryname.setText(poltrylist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return poltrylist.size();
    }

    public class poltryViewholder extends RecyclerView.ViewHolder {
        CircleImageView poltryimg;
        TextView poltryname;
        public poltryViewholder(@NonNull View itemView) {
            super(itemView);
            poltryimg = itemView.findViewById(R.id.poltri_img);
            poltryname = itemView.findViewById(R.id.poltri_name);
        }
    }
}
