package com.example.scrollingapplication;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class BookFragment extends Fragment {
    public ConstraintLayout top;

    //others from Adapter
    public ArrayList<Integer> imageIds = new ArrayList<>();
    public ArrayList<Integer> bookIds = new ArrayList<>();

    //layout manager
    RecyclerView.LayoutManager layoutManager;

    public BookFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v2 = inflater.inflate(R.layout.fragment_book, container, false);
        RecyclerView recyclerViewB = v2.findViewById(R.id.recycle_book);
        //the arrayLists to put inside the RecycleViewBooks Adapter
        layoutManager = new LinearLayoutManager(getActivity());
        RecyclerViewAdapterBooks adapterBook = new RecyclerViewAdapterBooks(imageIds, getActivity());
        recyclerViewB.setAdapter(adapterBook);
        recyclerViewB.setLayoutManager(layoutManager);
        initImageIds();

        return v2;
    }


    //method is to obtain the imageIds and place them into an arrayList
    public void initImageIds() {
        imageIds.add(R.drawable.bed);
        imageIds.add(R.drawable.money);
        imageIds.add(R.drawable.blueshades);
        imageIds.add(R.drawable.ey);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
