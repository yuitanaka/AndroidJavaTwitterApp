package com.example.yui.mytweeterapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<TweetListItem> tweetList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.tweet_list);

        // これ何
        TweetAdapter tweetAdapter = new TweetAdapter(MainActivity.this);



        tweetAdapter.setTweetList(tweetList);
        TweetListItem tweet = new TweetListItem();
        tweet.setId(1);
        tweet.setUserName("yui");
        tweet.setTweet("My Tweeter!! Good Job!!");
        tweetList.add(tweet);
        tweetList.add(tweet);
        tweetAdapter.notifyDataSetChanged();
        listView.setAdapter(tweetAdapter);

    }
}
