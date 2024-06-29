package com.fishercoder.solutions.secondthousand;

import java.util.*;
import java.util.concurrent.*;

public class _1242 {
    public interface HtmlParser {
        public List<String> getUrls(String url);
    }

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/web-crawler-multithreaded/solutions/699006/java-blockingqueue-executorservice/
         */
        public List<String> crawl(String startUrl, HtmlParser htmlParser) {
            String targetHostName = getHostName(startUrl);
            List<String> result = new ArrayList<>();
            BlockingQueue<String> queue = new LinkedBlockingQueue<>();
            queue.offer(startUrl);
            Set<String> visited = new HashSet<>();

            Queue<Future> tasks = new LinkedList<>();
            ExecutorService executorService = Executors.newFixedThreadPool(4, r -> {
                Thread t = new Thread(r);
                t.setDaemon(true);
                return t;
            });

            while (true) {
                String url = queue.poll();
                if (url != null) {
                    if (getHostName(url).equals(targetHostName) && visited.add(url)) {
                        result.add(url);
                        tasks.add(executorService.submit(() -> {
                            List<String> urls = htmlParser.getUrls(url);
                            for (String u : urls) {
                                queue.offer(u);
                            }
                        }));
                    }
                } else {
                    if (!tasks.isEmpty()) {
                        //wait for the next task to complete which might add new URLs into the queue
                        Future nextTask = tasks.poll();
                        try {
                            nextTask.get();
                        } catch (InterruptedException | ExecutionException e) {
                        }
                    } else {
                        //exit when all tasks are completed.
                        break;
                    }
                }
            }

            return result;
        }

        private String getHostName(String url) {
            url = url.substring("http://".length());
            String[] parts = url.split("/");
            return parts[0];
        }
    }

    public static void main(String... args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.getHostName("http://news.yahoo.com"));
        System.out.println(solution1.getHostName("http://news.yahoo.com/news"));
        System.out.println(solution1.getHostName("http://news.yahoo.com/us"));
        System.out.println(solution1.getHostName("http://news.yahoo.com"));
    }
}
