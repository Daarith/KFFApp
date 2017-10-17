package com.example.chandarith.kffapp.RecyclerView;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chandarith.kffapp.R;

/**
 * Created by Chan Darith on 10/17/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView img;
    TextView nametxt;
    ItemClickListener itemClickListener;

    public MyViewHolder(View itemView) {
        super(itemView);

        nametxt = itemView.findViewById(R.id.nametxt);
        img = (ImageView)itemView.findViewById(R.id.foodimage);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener ic){

        this.itemClickListener = ic;

    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(view,getLayoutPosition());
    }
}
