package com.example.iitbqa.presentation.question;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.iitbqa.R;
import com.example.iitbqa.data.models.Answer;
import com.example.iitbqa.presentation.home.feed.FeedListAdapter;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.ViewHolder> {

    private List<Answer> answerList;
    private AnswerAdapter.ClickListener listener;
    private Context context;

    public AnswerAdapter(List<Answer> answerList, ClickListener listener, Context context) {
        this.answerList = answerList;
        this.listener = listener;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.answer_card, parent, false);
        return new AnswerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindViews(answerList.get(position));
    }

    @Override
    public int getItemCount() {
        return answerList.size();
    }

    public interface ClickListener {
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_user)
        TextView tvUser;

        @BindView(R.id.tv_date)
        TextView tvDate;

        @BindView(R.id.tv_answer)
        TextView tvAnswer;

        @BindView(R.id.ll_upvote)
        LinearLayout llUpvote;

        @BindView(R.id.iv_upvote)
        ImageView ivUpvote;

        @BindView(R.id.tv_upvote)
        TextView tvUpvote;

        @BindView(R.id.iv_downvote)
        ImageView ivDownvote;

        @BindView(R.id.tv_upvoted)
        TextView tvUpvoted;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindViews(Answer answer) {


        }
    }
}
