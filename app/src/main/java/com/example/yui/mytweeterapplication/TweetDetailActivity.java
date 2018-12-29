package com.example.yui.mytweeterapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

// TODO: AppCompatActivityとActivityの違いを調べる
public class TweetDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_detail);

        TweetListItem tweetItem = (TweetListItem) getIntent().getSerializableExtra("TWEET_DATA");
        setTweetData(tweetItem);
    }

    protected void setTweetData(TweetListItem tweetListItem){
        ((TextView)findViewById(R.id.userName)).setText(tweetListItem.getUserName());
        ((TextView)findViewById(R.id.tweet)).setText(tweetListItem.getTweet());
    }
}
