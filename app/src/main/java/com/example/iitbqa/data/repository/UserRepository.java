package com.example.iitbqa.data.repository;

import android.content.SharedPreferences;

import retrofit2.Retrofit;

public class UserRepository {

    private final Retrofit retrofit;
    private final SharedPreferences sharedPreferences;

    public UserRepository(Retrofit retrofit, SharedPreferences sharedPreferences) {
        this.retrofit = retrofit;
        this.sharedPreferences = sharedPreferences;
    }
}
