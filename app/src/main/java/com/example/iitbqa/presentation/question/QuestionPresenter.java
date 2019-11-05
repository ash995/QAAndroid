package com.example.iitbqa.presentation.question;

import com.example.iitbqa.interactors.GetQuestionUseCase;

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
}
