package com.example.iitbqa.di.component;

import com.example.iitbqa.di.modules.AppModule;
import com.example.iitbqa.di.modules.FeedModule;
import com.example.iitbqa.di.modules.NetworkModule;
import com.example.iitbqa.di.modules.PostQuestionModule;
import com.example.iitbqa.di.modules.QuestionModule;
import com.example.iitbqa.di.modules.RepositoryModule;
import com.example.iitbqa.di.modules.UserModule;
import com.example.iitbqa.presentation.home.HomeActivity;
import com.example.iitbqa.presentation.question.AnswerDialog;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class, RepositoryModule.class})
public interface AppComponent {

    UserComponent plus(UserModule userModule);

    FeedComponent plus(FeedModule feedModule);

    PostQuestionComponent plus(PostQuestionModule postQuestionModule);

    QuestionComponent plus(QuestionModule module);

    void inject(HomeActivity homeActivity);

    void inject(AnswerDialog answerDialog);
}
