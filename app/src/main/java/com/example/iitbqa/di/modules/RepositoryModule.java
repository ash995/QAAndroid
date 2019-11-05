package com.example.iitbqa.di.modules;

import android.content.SharedPreferences;

import com.example.iitbqa.AuthManager;
import com.example.iitbqa.data.repository.QuestionRepository;
import com.example.iitbqa.data.repository.UserRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    UserRepository provideUserRepository(Retrofit retrofit, SharedPreferences sharedPreferences) {
        return  new UserRepository(retrofit, sharedPreferences);
    }

    @Provides
    @Singleton
    QuestionRepository provideQuestionRepository(Retrofit retrofit, SharedPreferences sharedPreferences, AuthManager authManager) {
        return new QuestionRepository(retrofit, sharedPreferences, authManager);
    }
}
