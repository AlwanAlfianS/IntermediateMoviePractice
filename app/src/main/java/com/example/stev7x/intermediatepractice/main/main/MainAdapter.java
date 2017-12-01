package com.example.stev7x.intermediatepractice.main.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.stev7x.intermediatepractice.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stev7x on 01/12/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {

    private List<MainDao> mData = new ArrayList<>();

    public MainAdapter(List<MainDao> mData) {
        this.mData = mData;
    }

    @Override
    public MainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_main, parent, false);
        MainHolder holder = new MainHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MainHolder holder, int position) {
        holder.textTitleRow.setText(mData.get(position).getTitle());
        Picasso.with(holder.imageViewRow.getContext())
                .load(mData.get(position).getImageUrl())
                .fit()
                .into(holder.imageViewRow);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MainHolder extends RecyclerView.ViewHolder {
        TextView textTitleRow;
        ImageView imageViewRow;

        public MainHolder(View itemView) {
            super(itemView);

            textTitleRow = itemView.findViewById(R.id.titleRow);
            imageViewRow = itemView.findViewById(R.id.imageRow);
        }
    }


}
