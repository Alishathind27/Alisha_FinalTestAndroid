package com.example.alisha_765497_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class Verification extends AppCompatActivity {


    public void checked(View view){
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
//        imageView.setBackgroundResource(R.drawable.img1);
    }

    GridView gridView;

    int[] image = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,
            R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        gridView = findViewById(R.id.gridView);

        final ImageAdapter imageAdapter = new ImageAdapter(this, image);
        gridView.setAdapter(imageAdapter);



    }
}
