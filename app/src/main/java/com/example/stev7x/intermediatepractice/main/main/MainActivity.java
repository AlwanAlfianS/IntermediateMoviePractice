package com.example.stev7x.intermediatepractice.main.main;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.stev7x.intermediatepractice.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerMain;
    private List<MainDao> mData = new ArrayList<>();
    private MainAdapter mainAdapter;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainAdapter = new MainAdapter(mData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        mRecyclerMain = (RecyclerView) findViewById(R.id.recyclermain);
        mRecyclerMain.setAdapter(mainAdapter);
        mRecyclerMain.setLayoutManager(gridLayoutManager);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mData.add(new MainDao("Satu", "http://sguru.org/wp-content/uploads/2017/06/cool-anonymous-profile-pictures-1699946_orig.jpg"));
                mData.add(new MainDao("Dua", "http://sguru.org/wp-content/uploads/2017/06/cool-anonymous-profile-pictures-1699946_orig.jpg"));
                mData.add(new MainDao("Tiga", "http://sguru.org/wp-content/uploads/2017/06/cool-anonymous-profile-pictures-1699946_orig.jpg"));
                mData.add(new MainDao("Empat", "http://sguru.org/wp-content/uploads/2017/06/cool-anonymous-profile-pictures-1699946_orig.jpg"));
                mData.add(new MainDao("Lima", "http://sguru.org/wp-content/uploads/2017/06/cool-anonymous-profile-pictures-1699946_orig.jpg"));
                mData.add(new MainDao("Enam", "http://sguru.org/wp-content/uploads/2017/06/cool-anonymous-profile-pictures-1699946_orig.jpg"));

                mainAdapter.notifyDataSetChanged();
            }
        }, 5000);
        Toast.makeText(this, "Loading data 5 detik...", Toast.LENGTH_SHORT).show();
    }
}
