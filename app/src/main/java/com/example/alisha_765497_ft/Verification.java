package com.example.alisha_765497_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Random;

public class Verification extends AppCompatActivity {


//    public void checked(View view){
//        ImageView imageView = (ImageView) view;
//        imageView.setImageResource(R.drawable.checked);
////        imageView.setBackgroundResource(R.drawable.img1);
//    }

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

         gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 ImageView imageView = view.findViewById(R.id.image_view);
                 imageView.setImageResource(R.drawable.checked);
             }
         });
        ImageButton ref_btn = findViewById(R.id.refresh_btn);
        Button bt = findViewById(R.id.verify);
        final CheckBox check = findViewById(R.id.checkbox);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check.isChecked()) {

                    Intent intent = new Intent(Verification.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Verification.this, "failed", Toast.LENGTH_SHORT).show();
                }
            }
            });
            ref_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gridView.setAdapter(imageAdapter);
                    int index, temp;
                    Random random = new Random();
                    for (int i = image.length - 1; i > 0; i--)
                    {
                        index = random.nextInt(i + 1);
                        temp = image[index];
                        image[index] = image[i];
                        image[i] = temp;
                    }
                    gridView.deferNotifyDataSetChanged();
                }
            })
;

    }
}
