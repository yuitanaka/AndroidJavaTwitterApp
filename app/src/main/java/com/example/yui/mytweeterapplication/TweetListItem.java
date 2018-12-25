package com.example.yui.mytweeterapplication;

/**
 * Created by yui on 西暦18/12/25.
 */

public class TweetListItem {
    private long id;
    private String userName;
    private String tweet;
    private String userImage;

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setTweet(String tweet){
        this.tweet = tweet;
    }

    public String getTweet(){
        return this.tweet;
    }

    public void setUserImage(){
        userImage = userName + ".jpg";
    }

    public String getUserImage(){
        return userImage;
    }
}
