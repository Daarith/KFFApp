package com.example.chandarith.kffapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chandarith.kffapp.R;
import com.example.chandarith.kffapp.RecyclerView.Movie;
import com.example.chandarith.kffapp.RecyclerView.MyAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_food,null);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_viewfood);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyAdapter(this.getActivity(),getFoodFrag()));

        return view;
    }

    private ArrayList<Movie> getFoodFrag() {

        ArrayList<Movie> movies=new ArrayList<>();
        Movie movie = new Movie("Hamburger",R.drawable.hamburger);
        movies.add(movie);

        movie = new Movie("Chicken fries",R.drawable.chicken_fries);
        movies.add(movie);

        movie = new Movie("Potato fries",R.drawable.potato_fries);
        movies.add(movie);

        movie = new Movie("Coca Cola",R.drawable.coca_cola);
        movies.add(movie);

        movie = new Movie("Sandwich",R.drawable.sandwich);
        movies.add(movie);

        return movies;
    }

    @Override
    public String toString() {
        return "Food";
    }

    
}
