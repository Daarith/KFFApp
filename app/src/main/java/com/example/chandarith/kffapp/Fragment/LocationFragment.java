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
public class LocationFragment extends Fragment {


    public LocationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_location,null);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_viewlocation);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyAdapter(this.getActivity(),getLocationFrag()));

        return view;
    }

    private ArrayList<Movie> getLocationFrag() {

        ArrayList<Movie> movies=new ArrayList<>();
        Movie movie = new Movie("The Pizza Company - TK Avenue \n Address: Corner of Street 315 and Street 516, Phnom Penh 12152, Cambodia \n Phone: +855 23 993 549 ",R.drawable.pizzacompany);
        movies.add(movie);

        movie = new Movie("KFC \n Address: 97, Preah Sisowath Quay, Phnom Penh, Cambodia \n Phone: +855 23 996 000",R.drawable.kfc);
        movies.add(movie);

        movie = new Movie("Lotteria \n Address: Preah Monivong blvd, Sangkat Beung Raing, Khan Daun Penh, Phnom Penh, Cambodia \n Phone: +855 93 911 000",R.drawable.lotteria);
        movies.add(movie);

        movie = new Movie("Bonchon",R.drawable.bonchon);
        movies.add(movie);

        movie = new Movie("Burger King",R.drawable.burgerking);
        movies.add(movie);

        return movies;
    }

    @Override
    public String toString() {
        return "Location";
    }
}
