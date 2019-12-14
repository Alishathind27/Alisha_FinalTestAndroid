package com.example.alisha_765497_ft;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class profile_fragment extends Fragment {



    public void ShowDescription(int id){

        View view = getView();
        if(view != null){
            TextView name = view.findViewById(R.id.name_textView);
            TextView email = view.findViewById(R.id.email_textView);
            TextView phone = view.findViewById(R.id.phone_textView);
            ImageView imageView = view.findViewById(R.id.User_image);

    UserData userData = UserData.userdetail.get(id);
    name.setText(userData.getName());
    email.setText(userData.getEmail());
    phone.setText(userData.getPhone());
    imageView.setImageResource(R.drawable.icon01_01);
        }


    }
    public profile_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_fragment, container, false);
    }

}
