package com.example.alisha_765497_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Listener {

    private boolean misDualPane  = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View detailView = findViewById(R.id.list_view);
        misDualPane = detailView != null && detailView.getVisibility() == View.VISIBLE;

    }


    @Override
    public void onItemClick(int id) {
        if(misDualPane) {
            profile_fragment profileFragment = (profile_fragment) getSupportFragmentManager().findFragmentById(R.id.profile);
            profileFragment.ShowDescription(id);
        }else{
            Intent intent = new Intent (this,profile_activity.class);
            intent.putExtra(profile_activity.TAG,id);
            startActivity(intent);

        }
    }
}
