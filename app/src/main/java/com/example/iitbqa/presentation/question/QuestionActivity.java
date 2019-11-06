package com.example.iitbqa.presentation.question;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.TextView;

import com.example.iitbqa.Constants;
import com.example.iitbqa.IITBQA;
import com.example.iitbqa.R;
import com.example.iitbqa.data.models.QuestionResponse;
import com.example.iitbqa.presentation.home.feed.FeedListAdapter;

import javax.inject.Inject;

public class QuestionActivity extends AppCompatActivity implements QuestionContract.View, AnswerAdapter.ClickListener {

    @BindView(R.id.rv_answer)
    RecyclerView rvAnswer;

    @BindView(R.id.tv_question)
    TextView tvQuestion;

    @Inject
    QuestionContract.Presenter presenter;

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        ButterKnife.bind(this);

        ((IITBQA)getApplication()).createQuestionComponent().inject(this);

        id = getIntent().getIntExtra(Constants.IntentKeys.QUESTION_ID, 0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.getQuestion(id);
    }

    @Override
    public void displayQuestion(QuestionResponse questionResponse) {
        tvQuestion.setText(questionResponse.getQuestion().getQues());
        rvAnswer.setAdapter(new AnswerAdapter(questionResponse.getAnswerList(), this, this));
        rvAnswer.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showInternetError() {

    }

    @Override
    public void showSnackBar(String message) {

    }


}
