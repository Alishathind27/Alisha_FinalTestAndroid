package com.example.alisha_765497_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class RegisterUserInfo extends AppCompatActivity  {

    EditText name_text;
    EditText email_text;
    EditText phone_text;
    Button   Savebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user_info);

         name_text = findViewById(R.id.name);
         email_text = findViewById(R.id.email);
         phone_text = findViewById(R.id.Phone);
         Savebutton = findViewById(R.id.SaveBtn);

         Savebutton.setOnClickListener(new View.OnClickListener() {

             String n = name_text.getText().toString();
             String Em = email_text.getText().toString();
             String phn = phone_text.getText().toString();

             @Override
             public void onClick(View view) {
               if (!n.isEmpty() & !Em.isEmpty() & !phn.isEmpty()) {

                  UserData data = new UserData(n,Em,phn);
                  Toast.makeText(RegisterUserInfo.this,"Successfull", Toast.LENGTH_LONG).show();
               }
               else
               {
                   Toast.makeText(RegisterUserInfo.this,"you should fill all the fields", Toast.LENGTH_LONG).show();
               }
             }


          });
     }
}
