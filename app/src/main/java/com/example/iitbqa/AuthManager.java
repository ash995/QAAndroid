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
        List<Integer> subscribedTopics1 = new ArrayList<>();
        List<Integer> subscribedTopics2 = new ArrayList<>();
        subscribedTopics1.add(1);
        subscribedTopics1.add(2);
        subscribedTopics1.add(7);
        subscribedTopics2.add(2);
        subscribedTopics2.add(9);
        subscribedTopics2.add(10);
        subscribedTopics2.add(13);
        //subscribedTopics.add(13);
        User user1 = new User(1, "roshanp", "Roshan", "CSE", "$Money#", subscribedTopics1, "PMRF fellow", "PHD", "F", 10);
        User user2 = new User(2, "muthumani", "Muthu", "PHY", "NoFan%", subscribedTopics2, "South Indian Guy", "PHD", "F", 10);
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

    public String getDegree() {
        return gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getDegree();
    }

    public String getDepartment() {
        return gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getDepartment();
    }

    public int getUpvotes() {
        return gson.fromJson(sharedPreferences.getString(Constants.PrefKeys.USER, null), User.class).getUpvotes();
    }
}
