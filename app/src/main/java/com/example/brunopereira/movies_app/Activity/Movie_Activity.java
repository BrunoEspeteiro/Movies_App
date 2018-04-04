package com.example.brunopereira.movies_app.Activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.brunopereira.movies_app.R;
/**
 * Created by bruno.pereira on 04/04/2018.
 */

public class Movie_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_layout);

        //escondendo a actionbar

        getSupportActionBar().hide();


        //Recuperando dados

        String name = getIntent().getExtras().getString("movie_name");
        String genres = getIntent().getExtras().getString("movie_genres");
        int year = getIntent().getExtras().getInt("movie_year");
        int runtime = getIntent().getExtras().getInt("movie_runtime");
        String director = getIntent().getExtras().getString("movie_director");
        String actors = getIntent().getExtras().getString("movie_actors");
        String plot = getIntent().getExtras().getString("movie_plot");
        String poster_url = getIntent().getExtras().getString("movie_poster");

        //iniciando as views

        CollapsingToolbarLayout collapsingToolbarLayout =
                findViewById(R.id.collapsingtollbar_id);

        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_name = findViewById(R.id.aa_movie_name);
        TextView tv_genres = findViewById(R.id.aa_genero);
        TextView tv_year = findViewById(R.id.aa_ano);
        TextView tv_runtime = findViewById(R.id.aa_tempo);
        TextView tv_director = findViewById(R.id.aa_diretor);
        TextView tv_actors = findViewById(R.id.aa_elenco);
        TextView tv_plot = findViewById(R.id.aa_sinopse);
        ImageView tv_poster_url = findViewById(R.id.aa_thumpnail);

        //setando os valores
        tv_name.setText(name);
        tv_genres.setText(genres);
        tv_year.setText(year);
        tv_runtime.setText(runtime);
        tv_director.setText(director);
        tv_actors.setText(actors);
        tv_plot.setText(plot);


        collapsingToolbarLayout.setTitle(name);

        RequestOptions requestOptions = new RequestOptions().centerCrop().
                placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

        //setando a imagem usando o Glide

        Glide.with(this).load(poster_url).apply(requestOptions).into(tv_poster_url);
    }
}
