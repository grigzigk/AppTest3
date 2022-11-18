package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;



public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        setTitle("Informations");

        //create the get Intent object
        Intent intent = getIntent();

        //receive the value by getStringExtra() method and
        //key must be same which is send by first activity
        String str = intent.getStringExtra("message_key"); //receive string
        Place place = (Place) intent.getSerializableExtra("sampleObject"); //receive object


        TextView infoTxt = findViewById(R.id.PlaceInfoTxtView);
        //display the string into TextView
        //infoTxt.setText("Informations for place: "+str);
        // OR display the string into TextView from object
        infoTxt.setText("Informations for place: "+place.getNameP());

        //Show the Place image
        ImageView img = findViewById(R.id.imageViewP1);
        Picasso.with(this).load(place.getImagePath()).resize(600,300).into(img);

        //Show the Place description
        TextView descriptionTxt = findViewById(R.id.descriptionTextView);
        descriptionTxt.setText(place.getDescriptionP());
        descriptionTxt.setMovementMethod(new ScrollingMovementMethod());//create scroll

    }
}