package com.example.yui.mytweeterapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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

        // Tweetデータ追加処理
        TweetListItem tweet = new TweetListItem();
        tweet.setUserName("yui");
        tweet.setTweet("My Tweeter!! Good Job!!");
        tweetList.add(tweet);
        TweetListItem tweet2 = new TweetListItem();
        tweet2.setUserName("yui");
        tweet2.setTweet("My Second Tweet!! Marveras!!");
        tweetList.add(tweet2);
        tweetAdapter.notifyDataSetChanged();
        listView.setAdapter(tweetAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent(getApplication(), TweetDetailActivity.class);
                // putExtraで自作クラスを受け渡す場合は SeriallizableかParcelableクラスを実装しなければならない。
                intent.putExtra("TWEET_DATA", tweetList.get(position));
                startActivity(intent);
            }
        });

    }
}
