package com.example.iitbqa.presentation.question;

import android.util.Log;

import com.example.iitbqa.Constants;
import com.example.iitbqa.interactors.GetQuestionUseCase;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Scheduler;

public class QuestionPresenter implements QuestionContract.Presenter {

    private QuestionContract.View view;

    private final Scheduler networkScheduler;
    private final Scheduler mainScheduler;
    private final GetQuestionUseCase getQuestionUseCase;

    public QuestionPresenter(Scheduler networkScheduler, Scheduler mainScheduler, GetQuestionUseCase getQuestionUseCase) {
        this.networkScheduler = networkScheduler;
        this.mainScheduler = mainScheduler;
        this.getQuestionUseCase = getQuestionUseCase;
    }

    @Override
    public void attachView(QuestionContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void getQuestion(int id) {
        Map<String, Integer> queryMap = new HashMap<>();
        queryMap.put(Constants.MapKeys.QUESTION_ID, id);
        getQuestionUseCase.execute(queryMap)
                .subscribeOn(networkScheduler)
                .observeOn(mainScheduler)
                .subscribe(
                        questionResponse -> {
                            Log.d("QUESTION", questionResponse.toString());
                            view.displayQuestion(questionResponse);
                        },
                        error -> {

                        }
                );
    }
}
