package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _1396 {
    public static class Solution1 {
        public class UndergroundSystem {

            class StationAndTime {
                String stationName;
                int t;

                public StationAndTime(String stationName, int t) {
                    this.stationName = stationName;
                    this.t = t;
                }

                public String getStation() {
                    return this.stationName;
                }

                public int getTime() {
                    return this.t;
                }
            }

            Map<String, double[]> averageTimeMap;
            Map<Integer, LinkedList<StationAndTime>> travelerMap = new HashMap<>();

            public UndergroundSystem() {
                averageTimeMap = new HashMap<>();
                travelerMap = new HashMap<>();
            }

            public void checkIn(int id, String stationName, int t) {
                if (!travelerMap.containsKey(id)) {
                    travelerMap.put(id, new LinkedList<>());
                }
                travelerMap.get(id).add(new StationAndTime(stationName, t));
            }

            public void checkOut(int id, String stationName, int t) {
                LinkedList<StationAndTime> list = travelerMap.get(id);
                StationAndTime stationAndTime = list.getLast();
                String startToEndStation = stationAndTime.getStation() + "->" + stationName;
                int duration = t - stationAndTime.getTime();
                if (!averageTimeMap.containsKey(startToEndStation)) {
                    averageTimeMap.put(startToEndStation, new double[]{duration, 1});
                } else {
                    double[] pair = averageTimeMap.get(startToEndStation);
                    double newAverage = (double) (pair[0] * pair[1] + duration) / (double) (pair[1] + 1);
                    averageTimeMap.put(startToEndStation, new double[]{newAverage, pair[1] + 1});
                }
            }

            public double getAverageTime(String startStation, String endStation) {
                return averageTimeMap.get(startStation + "->" + endStation)[0];
            }
        }
    }
}
