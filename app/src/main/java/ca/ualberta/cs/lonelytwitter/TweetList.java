package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by watts1 on 1/26/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();

    public void add(Tweet tweet){

        if(this.hasTweet(tweet))
        {
            throw new IllegalArgumentException();

        } else {
            tweets.add(tweet);

        }

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets()
    {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet tweet, Tweet t1) {
                return tweet.getDate().compareTo(t1.getDate());
            }
        });
        return new ArrayList<Tweet>(tweets);

    }

    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public void getCount() {
        tweets.size();
    }

}
