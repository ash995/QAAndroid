package com.example.iitbqa.interactors;

import com.example.iitbqa.data.models.Question;
import com.example.iitbqa.data.repository.QuestionRepository;

import java.util.Map;

import io.reactivex.Observable;

public class GetQuestionUseCase implements BaseUseCase<Question>{

    private final QuestionRepository questionRepository;

    public GetQuestionUseCase(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Observable<Question> execute(Map<?, ?> queryMap) {

        return null;
    }
}
