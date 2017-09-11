package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 355. Design Twitter
 *
 * Design a simplified version of Twitter where users can post tweets,
 * follow/unfollow another user and is able to see the 10 most recent tweets in the user's news feed. Your design should support the following methods:
 postTweet(userId, tweetId): Compose a new tweet.
 getNewsFeed(userId): Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
 follow(followerId, followeeId): Follower follows a followee.
 unfollow(followerId, followeeId): Follower unfollows a followee.

 Example:

 Twitter twitter = new Twitter();

 // User 1 posts a new tweet (userId = 5).
 twitter.postTweet(1, 5);

 // User 1's news feed should return a list with 1 tweet userId -> [5].
 twitter.getNewsFeed(1);

 // User 1 follows user 2.
 twitter.follow(1, 2);

 // User 2 posts a new tweet (userId = 6).
 twitter.postTweet(2, 6);

 // User 1's news feed should return a list with 2 tweet ids -> [6, 5].
 // Tweet userId 6 should precede tweet userId 5 because it is posted after tweet userId 5.
 twitter.getNewsFeed(1);

 // User 1 unfollows user 2.
 twitter.unfollow(1, 2);

 // User 1's news feed should return a list with 1 tweet userId -> [5],
 // since user 1 is no longer following user 2.
 twitter.getNewsFeed(1);
 */
public class _355 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/48100/java-oo-design-with-most-efficient-function-getnewsfeed
         */
        public static class Twitter {

            private static int timestamp = 0;
            private Map<Integer, User> map;

            class Tweet {
                public int time;
                public int id;
                public Tweet next;
                /**have a pointer,
                 * so we could be more memory efficient when retrieving tweets,
                 * think about merging k sorted lists*/

                public Tweet(int id) {
                    this.id = id;
                    time = timestamp++;
                    next = null;
                }
            }

            /**
             * the meat part of this OO design problem,
             * have a User object itself,
             * have follow() and unfollow() method embedded inside it
             */
            class User {
                public int id;
                public Set<Integer> followed;
                public Tweet tweetHead;

                public User(int id) {
                    this.id = id;
                    followed = new HashSet<>();
                    followed.add(id);//follow oneself first
                    this.tweetHead = null;
                }

                public void follow(int followeeId) {
                    followed.add(followeeId);
                }

                public void unfollow(int followeeId) {
                    followed.remove(followeeId);
                }

                public void postTweet(int tweetId) {
                    //every time we post, we prepend it to the head of the tweet
                    Tweet head = new Tweet(tweetId);
                    head.next = tweetHead;
                    tweetHead = head;//don't forget to overwrite tweetHead with the new head
                }
            }

            /**
             * Initialize your data structure here.
             */
            public Twitter() {
                map = new HashMap();
            }

            /**
             * Compose a new tweet.
             */
            public void postTweet(int userId, int tweetId) {
                /**update oneself newsFeed first and also all of his followers' newsFeed*/
                if (!map.containsKey(userId)) {
                    User user = new User(userId);
                    map.put(userId, user);
                }
                map.get(userId).postTweet(tweetId);
            }

            /**
             * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
             */
            public List<Integer> getNewsFeed(int userId) {
                List<Integer> newsFeed = new LinkedList<>();
                if (!map.containsKey(userId)) {
                    return newsFeed;
                }
                Set<Integer> users = map.get(userId).followed;
                PriorityQueue<Tweet> heap = new PriorityQueue<>(users.size(), (a, b) -> b.time - a.time);
                for (int user : users) {
                    Tweet tweet = map.get(user).tweetHead;
                    //it's super important to check null before putting into the heap
                    if (tweet != null) {
                        heap.offer(tweet);
                    }
                }

                int count = 0;
                while (!heap.isEmpty() && count < 10) {
                    Tweet tweet = heap.poll();
                    newsFeed.add(tweet.id);
                    count++;
                    if (tweet.next != null) {
                        heap.offer(tweet.next);
                    }
                }

                return newsFeed;
            }

            /**
             * Follower follows a followee. If the operation is invalid, it should be a no-op.
             */
            public void follow(int followerId, int followeeId) {
                if (!map.containsKey(followeeId)) {
                    User user = new User(followeeId);
                    map.put(followeeId, user);
                }

                if (!map.containsKey(followerId)) {
                    User user = new User(followerId);
                    map.put(followerId, user);
                }

                map.get(followerId).follow(followeeId);
            }

            /**
             * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
             */
            public void unfollow(int followerId, int followeeId) {
                if (!map.containsKey(followerId) || followeeId == followerId) {
                    return;
                }
                map.get(followerId).unfollow(followeeId);
            }
            /**
             * Your Twitter object will be instantiated and called as such:
             * Twitter obj = new Twitter();
             * obj.postTweet(userId,tweetId);
             * List<Integer> param_2 = obj.getNewsFeed(userId);
             * obj.follow(followerId,followeeId);
             * obj.unfollow(followerId,followeeId);
             */
        }
    }

    public static class Solution2 {
        public static class Twitter {

            Map<Integer, User> map;
            private int timestamp;

            private class User {
                private int userId;
                private Set<Integer> followed;
                private Tweet tweetHead;

                public User(int userId) {
                    this.userId = userId;
                    this.followed = new HashSet<>();
                    this.followed.add(userId);
                    this.tweetHead = null;
                }

                public void postTweet(int tweetId) {
                    Tweet tweet = new Tweet(tweetId);
                    tweet.next = tweetHead;
                    tweetHead = tweet;
                }

                public void follow(int followeeId) {
                    followed.add(followeeId);
                }

                public void unfollow(int followeeId) {
                    followed.remove(followeeId);
                }

            }

            private class Tweet {
                int time;
                int id;
                Tweet next;

                public Tweet(int id) {
                    this.id = id;
                    time = timestamp++;
                    next = null;
                }
            }

            /** Initialize your data structure here. */
            public Twitter() {
                map = new HashMap<>();
                timestamp = 0;
            }

            /** Compose a new tweet. */
            public void postTweet(int userId, int tweetId) {
                if (!map.containsKey(userId)) {
                    User user = new User(userId);
                    map.put(userId, user);
                }
                map.get(userId).postTweet(tweetId);
            }

            /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
            public List<Integer> getNewsFeed(int userId) {
                List<Integer> result = new LinkedList<>();
                if (!map.containsKey(userId)) {
                    return result;
                }
                Set<Integer> followeeSet = map.get(userId).followed;
                PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);
                for (int followeeId : followeeSet) {
                    if (map.containsKey(followeeId)) {
                        Tweet tweet = map.get(followeeId).tweetHead;
                        if (tweet != null) {
                            maxHeap.offer(tweet);
                        }
                    }
                }

                int count = 0;
                while (!maxHeap.isEmpty() && count++ < 10) {
                    Tweet tweet = maxHeap.poll();
                    if (tweet != null) {
                        result.add(tweet.id);
                        if (tweet.next != null) {
                            maxHeap.offer(tweet.next);
                        }
                    }
                }
                return result;
            }

            /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
            public void follow(int followerId, int followeeId) {
                if (!map.containsKey(followerId)) {
                    map.put(followerId, new User(followerId));
                }
                if (!map.containsKey(followeeId)) {
                    map.put(followeeId, new User(followeeId));
                }
                map.get(followerId).follow(followeeId);
            }

            /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
            public void unfollow(int followerId, int followeeId) {
                if (!map.containsKey(followerId) || followeeId == followerId) {
                    return;
                }
                map.get(followerId).unfollow(followeeId);
            }
        }
    }
}
