package com.example.bangkumist.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridPresidentAdapter extends RecyclerView.Adapter<GridPresidentAdapter.GridViewHolder> {

    private Context context;
    private ArrayList<President> listpresident;

    public GridPresidentAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<President> getListpresident() {
        return listpresident;
    }

    public void setListpresident(ArrayList<President> listpresident) {
        this.listpresident = listpresident;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_president, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder Holder, int position) {
        Glide.with(context)
                .load(getListpresident().get(position).getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(Holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListpresident().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder{
    ImageView imgPhoto;

    GridViewHolder(View itemView){
        super(itemView);
        imgPhoto = itemView.findViewById(R.id.img_item_photo);
    }
    }
}
