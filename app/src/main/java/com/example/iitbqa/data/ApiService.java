package com.example.iitbqa.data;

import com.example.iitbqa.data.models.PostAnswerRequest;
import com.example.iitbqa.data.models.PostQuestionRequest;
import com.example.iitbqa.data.models.Question;
import com.example.iitbqa.data.models.QuestionResponse;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    @GET("QuestionList/{userId}")
    Observable<List<Question>> getQuestionList(
            @Path("userId") String ldapId);

    @POST("PostQuestion")
    Observable<List<Question>> postQuestion(
            @Body PostQuestionRequest question
    );

    @POST("PostAnswer")
    Observable<QuestionResponse> postAnswer(
            @Body PostAnswerRequest postAnswerRequest
    );

    @GET("GetQuestion/{ldapId}/{questionId}")
    Observable<QuestionResponse> getQuestion(
            @Path("ldapId") String ldapId,
            @Path("questionId") int questionId
    );
}
