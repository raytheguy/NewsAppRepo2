package com.example.scrollingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DetailBooksActivity extends AppCompatActivity {

    public TextView bookText;
    public TextView bookName;
    public TextView authorText;
    public ImageView mainImage;

    //THIS METHOD HAS NOT BEEN EDITED YET
    //TO BE COMPLETED

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //retrieve the string and place it into the textView
        Intent intentBtn1 = getIntent();
//        //get back the integer -> note there is no default string
        final int backString = intentBtn1.getIntExtra("BookToPass", 1);
        //get back the reference integer of image
        int backImage = intentBtn1.getIntExtra("ImageToPass", 0);


        //set the article Text
        bookText = findViewById(R.id.mainLine);
        bookText.setText(FakeBooks.getBooksById(backString).getBookContent());

        //set the headline Text
        bookName = findViewById(R.id.headLine);
        bookName.setText(FakeBooks.getBooksById(backString).getBookTitle());

        //set the author Text
        authorText = findViewById(R.id.authorText);
        authorText.setText(FakeBooks.getBooksById(backString).getBookAuthor());

        //set the image
        //note, the image is a reference number
        mainImage = findViewById(R.id.detailedImage);
        mainImage.setImageResource(backImage);

        //floating button with a email or mail symbol
        //don't know how to remove this but will now serve as an implicit extent
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Intent initiated", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                //intent for the button send thing
                Intent textIntent = new Intent(Intent.ACTION_SEND);
                textIntent.setType("text/plain");
                textIntent.putExtra(Intent.EXTRA_TEXT, FakeBooks.getBooksById(backString).getBookTitle());
                startActivity(textIntent);

            }
        });


    }

}
