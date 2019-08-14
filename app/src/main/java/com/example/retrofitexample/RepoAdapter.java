package com.example.retrofitexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder> {

    List<Repo> repoList;

    public RepoAdapter(List<Repo> repoList) {
        this.repoList = repoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.rating.setText(repoList.get(i).getRating().toString());
        viewHolder.releaseYear.setText(repoList.get(i).getReleaseYear().toString());
        viewHolder.genre.setText(repoList.get(i).getGenre().toString());
        viewHolder.title.setText(repoList.get(i).getTitle());

        String imageUrl = repoList.get(i).getImage();
        Picasso.get().load(imageUrl).into(viewHolder.image);

    }

    @Override
    public int getItemCount() {
        return repoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView rating;
        TextView releaseYear;
        TextView genre;
        TextView title;
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);

            rating = itemView.findViewById(R.id.rating);
            releaseYear = itemView.findViewById(R.id.releaseYear);
            genre = itemView.findViewById(R.id.genre);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
        }
    }
}
