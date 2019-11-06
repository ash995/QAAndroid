package com.example.iitbqa.data.models;

import java.util.List;

public class User {

    private int id;
    private String ldapId;
    private String name;
    private String department;
    private String password;
    private List<Integer> subscribedTopics;
    private String bio;
    private String degree;
    private String year;
    private int upvotes;


    public User(int id, String ldapId, String name, String department, String password, List<Integer> subscribedTopics, String bio, String degree, String year, int upvotes) {
        this.id = id;
        this.ldapId = ldapId;
        this.name = name;
        this.department = department;
        this.password = password;
        this.subscribedTopics = subscribedTopics;
        this.bio = bio;
        this.degree = degree;
        this.year = year;
        this.upvotes = upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLdapId() {
        return ldapId;
    }

    public void setLdapId(String ldapId) {
        this.ldapId = ldapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getSubscribedTopics() {
        return subscribedTopics;
    }

    public void setSubscribedTopics(List<Integer> subscribedTopics) {
        this.subscribedTopics = subscribedTopics;
    }
}
