package com.example.scrollingapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import java.util.ArrayList;


public class ArticleFragment extends Fragment {

    //others from Adapter
    public ArrayList<Integer> imageIds = new ArrayList<>();

    //layout manager
    RecyclerView.LayoutManager layoutManager;

    public ArticleFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_article, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.recyclerv_view);
        //the arrayLists to put inside the RecycleView Adapter
        layoutManager = new LinearLayoutManager(getActivity());
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imageIds, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        initImageIds();

        return v;
    }


    //method is to obtain the imageIds and place them into an arrayList
    public void initImageIds() {
        imageIds.add(R.drawable.centralafrica);
        imageIds.add(R.drawable.bidens);
        imageIds.add(R.drawable.francemourn);
        imageIds.add(R.drawable.inmates);
        imageIds.add(R.drawable.northpole);
        imageIds.add(R.drawable.posthappy);
    }

}
