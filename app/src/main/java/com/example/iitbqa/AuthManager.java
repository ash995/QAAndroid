package com.example.iitbqa;

import android.content.SharedPreferences;

import com.example.iitbqa.data.models.User;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AuthManager {

    private final SharedPreferences sharedPreferences;
    private final Gson gson;

    String[] topicsArray = {"General", "Computer Science", "Theory", "Systems", "Machine Learning", "Artificial Intelligence", "Cryptography", "Algorithms", "Complexity", "Quantum Physics", "Physics", "Chemistry", "Biology", "Sciences"};


    public String[] getTopicList() {
        return topicsArray;
    }


    public AuthManager(SharedPreferences sharedPreferences, Gson gson) {
        this.sharedPreferences = sharedPreferences;
        this.gson = gson;
    }

    public void saveUser(User user) {
        List<Integer> subscribedTopics = new ArrayList<>();
        subscribedTopics.add(1);
        subscribedTopics.add(2);
        subscribedTopics.add(7);
        //subscribedTopics.add(13);
        User user1 = new User(1, "roshanp", "Roshan", "CSE", "$Money#", subscribedTopics, "PMRF fellow", "PHD", "F");
        User user2 = new User(2, "muthumani", "Muthu", "PHY", "NoFan%", subscribedTopics, "South Indian Guy", "PHD", "F");
        String userJson = gson.toJson(user1, User.class);
        sharedPreferences.edit().putString(Constants.PrefKeys.USER, userJson).commit();
    }

    public int getUserId() {
        return gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getId();
    }

    public String getLdapId() {
        return gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getLdapId();
    }

    public List<String> getCustomerTopics() {
        List<Integer> customerTopics = gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getSubscribedTopics();
        List<String> topics = new ArrayList<>();
        for (int i: customerTopics) {
            topics.add(topicsArray[i]);
        }
        return topics;
    }

    public String getBio() {
        return gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getBio();
    }

    public String getName() {
        return gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getName();
    }
}
