package com.example.alisha_765497_ft;

import java.io.Serializable;
import java.util.ArrayList;

public class UserData implements Serializable
{
    public String name;
    public String email;
    public String phone;

    public UserData(String name, String email, String phone)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public static ArrayList<String> userdetail = new ArrayList<>();


}
