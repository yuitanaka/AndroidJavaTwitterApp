package com.example.yui.mytweeterapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yui on 西暦18/12/25.
 */

public class TweetAdapter extends BaseAdapter {
    Context context;
    // ナニコレ
    LayoutInflater layoutInflater = null;
    ArrayList<TweetListItem> tweetList;

    public TweetAdapter(Context context){
        this.context = context;
        // ナニコレ
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public void setTweetList(ArrayList<TweetListItem> tweetList){
        this.tweetList = tweetList;
    }

    @Override
    public int getCount(){
        return tweetList.size();
    }

    @Override
    public Object getItem(int position){
        return tweetList.get(position);
    }

    @Override
    public long getItemId(int position){
        return tweetList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        convertView = layoutInflater.inflate(R.layout.item_tweet_list, parent, false);

        ((TextView)convertView.findViewById(R.id.userName)).setText(tweetList.get(position).getUserName());
        ((TextView)convertView.findViewById(R.id.tweet)).setText(tweetList.get(position).getTweet());

        return convertView;
    }
}
