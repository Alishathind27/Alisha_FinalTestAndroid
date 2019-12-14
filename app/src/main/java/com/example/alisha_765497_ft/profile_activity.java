package com.example.alisha_765497_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;

public class profile_activity extends AppCompatActivity {


    public static final String TAG = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_activity);

     profile_fragment profileFragment = (profile_fragment) getSupportFragmentManager().findFragmentById(R.id.profile);
     Intent intent = getIntent();
     int id = intent.getExtras().getInt(TAG);
     profileFragment.ShowDescription(id);
    }
}
