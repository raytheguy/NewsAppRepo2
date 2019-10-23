package com.example.scrollingapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//removed some imports as they are now handled by the recycler
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ConstraintLayout top;

    //spinner
    public Spinner topSpin;

    //others from Adapter
    public ArrayList<Integer> imageIds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create bottom navigation bar
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //button to go to another activity
        top = findViewById(R.id.top);

        //save layout when rotated
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ArticleFragment()).commit();
        }

        initImageIds();

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


    //listener for going to other fragments
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.articleBar:
                            selectedFragment = new ArticleFragment();
                            break;
                        case R.id.bookBar:
                            selectedFragment = new BookFragment();
                            break;
                        case R.id.profileBar:
                            selectedFragment = new ProfileFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
