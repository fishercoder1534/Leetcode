package com.fishercoder.solutions.thirdthousand;

public class _2728 {
    public static class Street {
        //dummy class to make compilation possible
        public Street(int[] doors) {

        }

        public void openDoor() {

        }

        public void closeDoor() {

        }

        public boolean isDoorOpen() {
            return false;
        }

        public void moveRight() {

        }

        public void moveLeft() {

        }
    }

    public static class Solution1 {
        public int houseCount(Street street, int k) {
            //close all doors
            for (int i = 0; i < k; i++) {
                street.closeDoor();
                street.moveRight();
            }
            //open one door
            street.openDoor();
            int houses = 1;
            for (int i = 0; i < k; i++) {
                street.moveRight();
                if (street.isDoorOpen()) {
                    return houses;
                }
                houses++;
            }
            return houses;
        }

    }
}
