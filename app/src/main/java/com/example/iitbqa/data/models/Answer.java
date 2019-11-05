package com.example.iitbqa.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Answer {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("user")
    @Expose
    private String userId;

    @SerializedName("content")
    @Expose
    private String content;

    @SerializedName("question")
    @Expose
    private int quesId;

    @SerializedName("votes")
    @Expose
    private int votes;

    @SerializedName("timestamp")
    @Expose
    private Date timestamp;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getQuesId() {
        return quesId;
    }

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
