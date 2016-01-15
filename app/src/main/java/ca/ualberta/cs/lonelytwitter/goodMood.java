package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by husain3 on 1/12/16.
 */
public class goodMood extends Mood{

    public goodMood() {
        super();
    }


    public goodMood(Date date) {
        super(date);
    }

    public String getMood()
    {
        return "good";
    }



}
