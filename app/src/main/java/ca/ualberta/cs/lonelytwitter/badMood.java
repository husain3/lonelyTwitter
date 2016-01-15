package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by husain3 on 1/15/16.
 */
public class badMood extends Mood{

    public badMood() {
        super();
    }


    public badMood(Date date) {
        super(date);
    }

    public String getMood()
    {
        return "bad";
    }



}
