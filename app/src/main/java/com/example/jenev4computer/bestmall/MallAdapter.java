package com.example.jenev4computer.bestmall;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class MallAdapter extends RecyclerView.Adapter<MallAdapter.MallViewHolder> {

    private Context mCtx;
    private List<Mall> mallList;

    public MallAdapter(Context mCtx, List<Mall> mallList) {
        this.mCtx = mCtx;
        this.mallList = mallList;
    }

    @NonNull
    @Override
    public MallViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.mall_list_layout,null);
        return new MallViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MallViewHolder holder, int position) {
        Mall mall = mallList.get(position);

        holder.title.setText(mall.getTitle());
        holder.city.setText(mall.getCity());

        Utilities utilities = new Utilities();
        holder.dist.setText(""+ utilities.getDistanceBetween2Coord(51.022740, 7.562001 ,mall.getLatitude(),mall.getLongitude())+" Km");
        //Todo: add a rating calculator
        holder.ratingBar.setEnabled(false);
        holder.ratingBar.setRating(4.4f);


    }

    @Override
    public int getItemCount() {
        return mallList.size();
    }

    class MallViewHolder extends RecyclerView.ViewHolder{

        TextView title, city, dist;
        RatingBar ratingBar;


        public MallViewHolder(View itemView) {
            super(itemView);
            title   = (TextView) itemView.findViewById(R.id.mallListLayoutTitle);
            city    = (TextView) itemView.findViewById(R.id.mallListCity);
            dist    = (TextView) itemView.findViewById(R.id.mallListDistance);
            ratingBar   = (RatingBar) itemView.findViewById(R.id.mallListLayoutRatingbar);


        }
    }
}
