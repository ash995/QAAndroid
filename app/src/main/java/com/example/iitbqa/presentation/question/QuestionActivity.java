package com.example.iitbqa.presentation.question;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;

import com.example.iitbqa.IITBQA;
import com.example.iitbqa.R;

import javax.inject.Inject;

public class QuestionActivity extends AppCompatActivity {

    @BindView(R.id.rv_answer)
    RecyclerView rvAnswer;

    @Inject
    QuestionContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        ButterKnife.bind(this);

        ((IITBQA)getApplication()).createQuestionComponent().inject(this);
    }
}
