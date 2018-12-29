package com.example.yui.mytweeterapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// 新規ツイート画面の処理
public class NewTweetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tweet);

        // 閉じるボタンの処理
        Button closeButton = (Button)findViewById(R.id.close_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });

        // ツイートボタンの処理
        Button tweetButton = (Button)findViewById(R.id.tweet_button);
        tweetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TweetListItem tweet = new TweetListItem();
                tweet.setUserName("yui");
                EditText newTweet = findViewById(R.id.tweet_context);
                tweet.setTweet(newTweet.getText().toString());
                Intent intent = new Intent(getApplication(), MainActivity.class);
                intent.putExtra("TWEET_DATA", tweet);
                startActivity(intent);
            }
        });
    }
}
