package com.example.chandarith.kffapp.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.chandarith.kffapp.R;
import com.example.chandarith.kffapp.RecyclerView.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chan Darith on 10/12/2017.
 */

public class HomeActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //
        toolbar = (Toolbar) findViewById(R.id.navigation_action);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home);
            finish();
        return super.onOptionsItemSelected(item);
    }
}
