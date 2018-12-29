package com.example.yui.mytweeterapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
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

        // Tweetデータ追加処理
        TweetListItem tweetItem = (TweetListItem) getIntent().getSerializableExtra("TWEET_DATA");
        if(tweetItem != null){
            updateTweetList(tweetItem);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent(getApplication(), TweetDetailActivity.class);
                // putExtraで自作クラスを受け渡す場合は SeriallizableかParcelableクラスを実装しなければならない。
                intent.putExtra("TWEET_DATA", tweetList.get(position));
                startActivity(intent);
            }
        });

        // 新規ツイートボタン処理
        Button newTweetButton = (Button)findViewById(R.id.new_tweet_button);
        newTweetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), NewTweetActivity.class);
                startActivity(intent);
            }
        });

    }

    public void updateTweetList(TweetListItem item){
        // これ何
        TweetAdapter tweetAdapter = new TweetAdapter(MainActivity.this);
        tweetAdapter.setTweetList(tweetList);

        tweetList.add(item);

        tweetAdapter.notifyDataSetChanged();
        listView.setAdapter(tweetAdapter);
    }
}
