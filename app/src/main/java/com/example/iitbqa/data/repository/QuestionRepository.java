package com.example.iitbqa.data.repository;

import android.content.SharedPreferences;

import com.example.iitbqa.AuthManager;
import com.example.iitbqa.data.ApiService;
import com.example.iitbqa.data.models.PostQuestionRequest;
import com.example.iitbqa.data.models.Question;
import com.example.iitbqa.exception.EmptyListException;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;

public class QuestionRepository {

    private final Retrofit retrofit;
    private final SharedPreferences sharedPreferences;
    private final AuthManager authManager;

    private List<Question> questionList;

    public QuestionRepository(Retrofit retrofit, SharedPreferences sharedPreferences, AuthManager authManager) {
        this.retrofit = retrofit;
        this.sharedPreferences = sharedPreferences;
        this.authManager = authManager;
    }

    public Observable<List<Question>> getUserFeed(boolean fromRemote) {
        if (fromRemote) {
            return retrofit.create(ApiService.class).getQuestionList(authManager.getUserId())
                    .flatMap(questions -> {
                        questionList = questions;
                        return Observable.just(questions);
                    });
        } else if (questionList != null && !questionList.isEmpty()) {
            return Observable.just(questionList);
        } else {
            return Observable.error(new EmptyListException());
        }
    }

    public Observable<List<Question>> postQuestion(String question, String description, List<Integer> topics) {
        PostQuestionRequest questionObj = new PostQuestionRequest(authManager.getUserId(), topics, question, description);
        return retrofit.create(ApiService.class).postQuestion(questionObj)
                .flatMap(questions -> {
                    questionList = questions;
                    return Observable.just(questionList);
                });

    }
}