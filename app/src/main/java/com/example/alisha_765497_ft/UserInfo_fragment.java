package com.example.alisha_765497_ft;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserInfo_fragment extends Fragment {

public Context context;


    public UserInfo_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.context = inflater.getContext();
        return inflater.inflate(R.layout.fragment_user_info_fragment, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        if (view != null)
        {
           Button btn = view.findViewById(R.id.btn);
           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(context, RegisterUserInfo.class);
                   startActivity(intent);
               }
           });

        }
    }
}
