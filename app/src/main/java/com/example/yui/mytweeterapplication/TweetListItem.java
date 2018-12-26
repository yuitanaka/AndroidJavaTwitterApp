package com.example.yui.mytweeterapplication;

import java.io.Serializable;

/**
 * Created by yui on 西暦18/12/25.
 */

public class TweetListItem implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userName;
    private String tweet;
    private String userImage;

    public  long getId(){
        return serialVersionUID;
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
