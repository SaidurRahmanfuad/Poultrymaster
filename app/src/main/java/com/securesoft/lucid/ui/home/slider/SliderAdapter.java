package com.securesoft.lucid.ui.home.slider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.securesoft.lucid.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.sliderViewHolder> {
    public Context context;


    public SliderAdapter(Context context) {
        this.context = context;
    }


    @Override
    public sliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_models, null,false);

        return new sliderViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(sliderViewHolder viewHolder, int position) {
        switch (position) {
            case 0:

                Glide.with(viewHolder.itemView)
                        .load(R.drawable.khamar)
                        .into(viewHolder.imageViewBackground);
                break;
            case 1:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.has)
                        .into(viewHolder.imageViewBackground);
                break;
            case 2:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.murgi)
                        .into(viewHolder.imageViewBackground);
                break;
            case 3:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.koyel)
                        .into(viewHolder.imageViewBackground);
                break;
      /*      case 4:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.slider5)
                        .into(viewHolder.imageViewBackground);
                break;
            case 5:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.slider6)
                        .into(viewHolder.imageViewBackground);
                break;
            case 6:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.slider7)
                        .into(viewHolder.imageViewBackground);
                break;*/
            default:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.khamar)
                        .into(viewHolder.imageViewBackground);
                break;

        }
    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 7;
    }
    static class sliderViewHolder extends SliderViewAdapter.ViewHolder{
        View itemView;
        ImageView imageViewBackground;
        public sliderViewHolder(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            this.itemView = itemView;
        }

    }
}
