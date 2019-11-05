package com.example.iitbqa.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Question {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("user")
    @Expose
    private String userId;

    @SerializedName("topics")
    @Expose
    private List<Integer> topics;

    @SerializedName("question")
    @Expose
    private String ques;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("numAnswers")
    @Expose
    private int numAnswers;

    @SerializedName("timestamp")
    @Expose
    private Date timestamp;

    public Question(String userId, List<Integer> topics, String ques, String description) {
        this.userId = userId;
        this.topics = topics;
        this.ques = ques;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Integer> getTopics() {
        return topics;
    }

    public void setTopics(List<Integer> topics) {
        this.topics = topics;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getNumAnswers() {
        return numAnswers;
    }

    public void setNumAnswers(int numAnswers) {
        this.numAnswers = numAnswers;
    }
}
