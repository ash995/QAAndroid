package com.example.iitbqa.presentation.question;

import com.example.iitbqa.presentation.BasePresenter;
import com.example.iitbqa.presentation.BaseView;

public interface QuestionContract {
    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<QuestionContract.View> {

    }

}
