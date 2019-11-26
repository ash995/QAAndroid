package com.example.iitbqa.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SplashData {
    @Expose
    @SerializedName("department_choices")
    List<DepartmentChoice> departmentChoiceList;

    @Expose
    @SerializedName("topics")
    List<Topic> topics;

    @Expose
    @SerializedName("degree_choices")
    List<DegreeChoice> degreeChoiceList;

    public List<DepartmentChoice> getDepartmentChoiceList() {
        return departmentChoiceList;
    }

    public void setDepartmentChoiceList(List<DepartmentChoice> departmentChoiceList) {
        this.departmentChoiceList = departmentChoiceList;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<DegreeChoice> getDegreeChoiceList() {
        return degreeChoiceList;
    }

    public void setDegreeChoiceList(List<DegreeChoice> degreeChoiceList) {
        this.degreeChoiceList = degreeChoiceList;
    }
}
