package com.fishercoder;

import com.fishercoder.solutions._355;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/10/17.
 */
public class _355Test {
    private static _355.Twitter twitter ;

    @BeforeClass
    public static void setup() {
        twitter = new _355.Twitter();
    }

    @Test
    public void test1(){
        twitter.postTweet(1, 5);
        List<Integer> user1newsFeed = twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
        assertEquals(5, (int) user1newsFeed.get(0));

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        user1newsFeed = twitter.getNewsFeed(1);
        assertEquals(2, user1newsFeed.size());
        assertEquals(6, (int) user1newsFeed.get(0));
        assertEquals(5, (int) user1newsFeed.get(1));

        twitter.unfollow(1, 2);
        user1newsFeed = twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
    }
}
