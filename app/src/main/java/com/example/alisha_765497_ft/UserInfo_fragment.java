package com.example.alisha_765497_ft;


import android.content.Context;
import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */

interface Listener{
    void onItemClick(int id);
}

    public class UserInfo_fragment extends Fragment {

//        public Context context;

        public UserInfo_fragment() {
            // Required empty public constructor
        }

        private Listener listener;


        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            this.listener = (Listener) context;
        }

        @Override
        public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            View view = inflater.inflate(R.layout.fragment_user_info_fragment, container, false);

////
            return view;
        }

//        View view = getView();
//        Button btn = view.findViewById(R.id.btn);

        @Override
        public void onStart() {
            super.onStart();

            View view = getView();
            if (view != null) {


                ListView listView = view.findViewById(R.id.User_listView);
                Button button = view.findViewById(R.id.btn);
                UserProfile_Adapter userProfileAdapter = new UserProfile_Adapter(getContext(), R.layout.userprofile_layout, UserData.userdetail);
               listView.setAdapter(userProfileAdapter);
               listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                       if (listener != null)
                           listener.onItemClick(i);
                   }
               });


                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(), RegisterUserInfo.class);
                        startActivity(intent);
                    }
                });
                listView.deferNotifyDataSetChanged();

            }
        }
    }

