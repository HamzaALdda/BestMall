package com.team10.bestmalls;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jenev4computer.bestmall.R;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentViewHolder>{


    private Context mCtx;
    private List<Comment> commentList;

    public CommentAdapter(Context mCtx, List<Mall> mallList) {
        this.mCtx = mCtx;
        this.commentList = commentList;
    }


    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        //Todo: change the LayoutFrom RaitingVIew and complete the code below
        //View view = inflater.inflate(R.id.
        //return new CommentViewHolder(new View());

        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder holder, int position) {
        Comment comment = commentList.get(position);

        holder.username.setText(comment.getUsername());
        holder.comment.setText(comment.getComment());
        holder.date.setText(comment.getDate());
    }

    @Override
    public int getItemCount() {
       return commentList.size();
    }

    class CommentViewHolder extends RecyclerView.ViewHolder{

        TextView username, comment, date;


        public CommentViewHolder(View itemView) {
            super(itemView);
            username   = (TextView) itemView.findViewById(R.id.commentLayoutUsernamer);
            comment    = (TextView) itemView.findViewById(R.id.commentLayoutComment);
            date        = (TextView) itemView.findViewById(R.id.commentLayoutDate);

        }

    }
}
