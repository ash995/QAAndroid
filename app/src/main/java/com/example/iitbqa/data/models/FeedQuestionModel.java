package com.example.iitbqa.data.models;

import java.util.ArrayList;
import java.util.List;

public class FeedQuestionModel {

    String user;
    List<String> topicsList;
    String question;
    String description;
    String numAnswers;

    String[] topicsArray = {"General", "Computer Science", "Theory", "Systems", "Machine Learning", "Artificial Intelligence", "Cryptography", "Algorithms", "Complexity", "Quantum Physics", "Physics", "Chemistry", "Biology", "Sciences"};

    public FeedQuestionModel(Question question) {
        this.user = question.getUserId();
        this.question = question.getQues();
        this.description = question.getDescription();
        this.numAnswers = question.getNumAnswers() + " have answered this question";

        List<String> topicList = new ArrayList<>();
        for (int i: question.getTopics()) {
            topicList.add(topicsArray[i]);
        }
        this.topicsList = topicList;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<String> getTopicsList() {
        return topicsList;
    }

    public void setTopicsList(List<String> topicsList) {
        this.topicsList = topicsList;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumAnswers() {
        return numAnswers;
    }

    public void setNumAnswers(String numAnswers) {
        this.numAnswers = numAnswers;
    }
}
