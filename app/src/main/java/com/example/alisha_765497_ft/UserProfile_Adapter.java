package com.example.alisha_765497_ft;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class UserProfile_Adapter extends ArrayAdapter {

 private List<UserData>user;
 private final LayoutInflater layoutInflater;
 private final int layoutResource;



    public UserProfile_Adapter(@NonNull Context context, int resource,List<UserData> user) {
        super(context, resource, resource);
        this.layoutInflater = LayoutInflater.from(context);
        layoutResource = resource;
    }

}
