package com.example.brunopereira.movies_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.request.RequestOptions;
import com.example.brunopereira.movies_app.Activity.Movie_Activity;
import com.example.brunopereira.movies_app.Model.Movie;
import com.example.brunopereira.movies_app.R;

import java.util.List;

/**
 * Created by bruno.pereira on 04/04/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context myContext;
    private List<Movie> mData;
    RequestOptions options;

    public RecyclerViewAdapter(Context myContext, List<Movie> mData){
        this.myContext = myContext;
        this.mData = mData;

        /////Requerindo option para guide
        options = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;


        LayoutInflater inflater = LayoutInflater.from(myContext);

        view = inflater.inflate(R.layout.lst_movie_item,parent,false);
        final MyViewHolder viewHolder =  new MyViewHolder(view);
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(myContext, Movie_Activity.class);
                i.putExtra("movie_name",mData.get(viewHolder.getAdapterPosition()).getName());
                i.putExtra("movie_plot",mData.get(viewHolder.getAdapterPosition()).getPlot());
                i.putExtra("movie_genres",mData.get(viewHolder.getAdapterPosition()).getGenres());
                i.putExtra("movie_year",mData.get(viewHolder.getAdapterPosition()).getYear());
                i.putExtra("movie_runtime",mData.get(viewHolder.getAdapterPosition()).getRuntime());
                i.putExtra("movie_director",mData.get(viewHolder.getAdapterPosition()).getDirector());
                i.putExtra("movie_actors",mData.get(viewHolder.getAdapterPosition()).getActors());
                i.putExtra("movie_poster",mData.get(viewHolder.getAdapterPosition()).getPoster_url());

                myContext.startActivity(i);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_genres.setText(mData.get(position).getName());
        holder.tv_year.setText(mData.get(position).getName());
        holder.tv_runtime.setText(mData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name;
        TextView tv_genres;
        TextView tv_year;
        TextView tv_runtime;
        ImageView img_thumbnail;
        LinearLayout view_container;

        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            tv_name = itemView.findViewById(R.id.movie_name);
            tv_genres = itemView.findViewById(R.id.genero);
            tv_year = itemView.findViewById(R.id.ano);
            tv_runtime = itemView.findViewById(R.id.tempo);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }
}
