package com.example.alisha_765497_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
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

//             String n = name_text.getText().toString();
//             String Em = email_text.getText().toString();
//             String phn = phone_text.getText().toString();

             @Override
             public void onClick(View view) {
               if (!name_text.getText().toString().isEmpty() & !email_text.getText().toString().isEmpty() & !phone_text.getText().toString().isEmpty()) {
                   UserData d = new UserData(name_text.getText().toString(),email_text.getText().toString(),phone_text.getText().toString());
                   UserData.userdetail.add(d);
                   System.out.println("append");
                   Toast.makeText(RegisterUserInfo.this,"print",Toast.LENGTH_LONG).show();
                   Intent intent = new Intent(RegisterUserInfo.this, Verification.class);
                   startActivity(intent);
                   UserData a = new UserData("name","dhnnejsk","75");
                   UserData.userdetail.add(a);
                   UserData b = new UserData("name","dhnnejsk","75");
                   UserData.userdetail.add(b);
                   System.out.println(UserData.userdetail.get(1).getEmail());
               }
               else
               {
                   Toast.makeText(RegisterUserInfo.this,"you should fill all the fields", Toast.LENGTH_LONG).show();
               }
             }


          });
     }
}
