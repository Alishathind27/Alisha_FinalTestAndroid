package com.example.alisha_765497_ft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class UserProfile_Adapter extends ArrayAdapter {

 private List<UserData> user;
 private final LayoutInflater layoutInflater;
 private final int layoutResource;



    public UserProfile_Adapter(@NonNull Context context, int resource,List<UserData> user) {
        super(context, resource, resource);
        this.layoutInflater = LayoutInflater.from(context);
        layoutResource = resource;
        this.user = user;
    }

    @Override
    public int getCount() {
        return user.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null)
            view = layoutInflater.inflate(layoutResource, parent, false );
        TextView Text_name = view.findViewById(R.id.name);
        TextView Text_email = view.findViewById(R.id.email);
        TextView Text_phone = view.findViewById(R.id.Phone);

        Text_name.setText(user.get(position).name);
        Text_email.setText(user.get(position).email);
        Text_phone.setText(user.get(position).phone);

        return view;
    }
}
