package com.fishercoder;

import com.fishercoder.solutions._355;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/10/17.
 */
public class _355Test {
    private static _355.Solution1.Twitter solution1Twitter;
    private static _355.Solution2.Twitter solution2Twitter;

    @BeforeClass
    public static void setup() {
        solution1Twitter = new _355.Solution1.Twitter();
        solution2Twitter = new _355.Solution2.Twitter();
    }

    @Before
    public void cleanUp() {
        solution1Twitter = new _355.Solution1.Twitter();
        solution2Twitter = new _355.Solution2.Twitter();
    }

    @Test
    public void test1() {
        solution1Twitter.postTweet(1, 5);
        List<Integer> user1newsFeed = solution1Twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
        assertEquals(5, (int) user1newsFeed.get(0));

        solution1Twitter.follow(1, 2);
        solution1Twitter.postTweet(2, 6);
        user1newsFeed = solution1Twitter.getNewsFeed(1);
        assertEquals(2, user1newsFeed.size());
        assertEquals(6, (int) user1newsFeed.get(0));
        assertEquals(5, (int) user1newsFeed.get(1));

        solution1Twitter.unfollow(1, 2);
        user1newsFeed = solution1Twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
    }

    @Test
    public void test2() {
        solution2Twitter.postTweet(1, 5);
        List<Integer> user1newsFeed = solution2Twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
        assertEquals(5, (int) user1newsFeed.get(0));

        solution2Twitter.follow(1, 2);
        solution2Twitter.postTweet(2, 6);
        user1newsFeed = solution2Twitter.getNewsFeed(1);
        assertEquals(2, user1newsFeed.size());
        assertEquals(6, (int) user1newsFeed.get(0));
        assertEquals(5, (int) user1newsFeed.get(1));

        solution2Twitter.unfollow(1, 2);
        user1newsFeed = solution2Twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
    }

    @Test
    public void test3() {
        solution2Twitter.postTweet(1, 1);
        List<Integer> user1newsFeed = solution2Twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
        assertEquals(1, (int) user1newsFeed.get(0));

        solution2Twitter.follow(2, 1);
        user1newsFeed = solution2Twitter.getNewsFeed(2);
        assertEquals(1, user1newsFeed.size());
        assertEquals(1, (int) user1newsFeed.get(0));

        solution2Twitter.unfollow(2, 1);
        user1newsFeed = solution2Twitter.getNewsFeed(2);
        assertEquals(0, user1newsFeed.size());
    }

    @Test
    public void test4() {
        solution1Twitter.postTweet(1, 1);
        List<Integer> user1newsFeed = solution1Twitter.getNewsFeed(1);
        assertEquals(1, user1newsFeed.size());
        assertEquals(1, (int) user1newsFeed.get(0));

        solution1Twitter.follow(2, 1);
        user1newsFeed = solution1Twitter.getNewsFeed(2);
        assertEquals(1, user1newsFeed.size());
        assertEquals(1, (int) user1newsFeed.get(0));

        solution1Twitter.unfollow(2, 1);
        user1newsFeed = solution1Twitter.getNewsFeed(2);
        assertEquals(0, user1newsFeed.size());
    }

    @Test
    public void test5() {
        List<Integer> user1newsFeed = solution2Twitter.getNewsFeed(1);
        assertEquals(0, user1newsFeed.size());
    }

    @Test
    public void test6() {
        solution2Twitter.follow(1, 5);
        List<Integer> user1newsFeed = solution2Twitter.getNewsFeed(1);
        assertEquals(0, user1newsFeed.size());
    }
}
