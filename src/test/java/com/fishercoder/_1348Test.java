package com.fishercoder;

import com.fishercoder.solutions._1348;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1348Test {
    private static _1348.Solution1.TweetCounts tweetCounts;

    @Test
    public void test1() {
        tweetCounts = new _1348.Solution1.TweetCounts();

        tweetCounts.recordTweet("tweet3", 0);
        tweetCounts.recordTweet("tweet3", 60);
        tweetCounts.recordTweet("tweet3", 10);
        assertEquals(Arrays.asList(2), tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59));
        assertEquals(Arrays.asList(2, 1), tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60));
        tweetCounts.recordTweet("tweet3", 120);
        assertEquals(Arrays.asList(4), tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 0, 210));
    }

    @Test
    public void test2() {
        tweetCounts = new _1348.Solution1.TweetCounts();

        tweetCounts.recordTweet("tweet0", 33);
        tweetCounts.recordTweet("tweet1", 89);
        tweetCounts.recordTweet("tweet2", 99);
        tweetCounts.recordTweet("tweet3", 53);
        tweetCounts.recordTweet("tweet4", 3);
        assertEquals(Arrays.asList(0), tweetCounts.getTweetCountsPerFrequency("hour", "tweet0", 89, 3045));
        tweetCounts.recordTweet("tweet0", 28);
        tweetCounts.recordTweet("tweet0", 91);
        tweetCounts.recordTweet("tweet0", 9);
        tweetCounts.recordTweet("tweet1", 6);
    }

    @Test
    public void test3() {
        tweetCounts = new _1348.Solution1.TweetCounts();

        tweetCounts.recordTweet("tweet0", 13);
        tweetCounts.recordTweet("tweet1", 16);
        tweetCounts.recordTweet("tweet2", 12);
        tweetCounts.recordTweet("tweet3", 18);
        tweetCounts.recordTweet("tweet4", 82);
        tweetCounts.recordTweet("tweet3", 89);
        assertEquals(Arrays.asList(0), tweetCounts.getTweetCountsPerFrequency("day", "tweet0", 89, 9471));
        assertEquals(Arrays.asList(2, 0), tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 13, 4024));
    }
}