package com.fishercoder.solutions;

public class _1507 {
    public static class Solution1 {
        public String reformatDate(String date) {
            String[] dates = date.split(" ");
            return dates[2] + "-" + getMonth(dates[1]) + "-" + getDay(dates[0]);
        }

        private String getDay(String day) {
            String formatedDay = day.substring(0, day.length() - 2);
            if (formatedDay.length() == 1) {
                return "0" + formatedDay;
            }
            return formatedDay;
        }

        private String getMonth(String month) {
            String result = "";
            switch (month) {
                case "Jan":
                    result = "01";
                    break;
                case "Feb":
                    result = "02";
                    break;
                case "Mar":
                    result = "03";
                    break;
                case "Apr":
                    result = "04";
                    break;
                case "May":
                    result = "05";
                    break;
                case "Jun":
                    result = "06";
                    break;
                case "Jul":
                    result = "07";
                    break;
                case "Aug":
                    result = "08";
                    break;
                case "Sep":
                    result = "09";
                    break;
                case "Oct":
                    result = "10";
                    break;
                case "Nov":
                    result = "11";
                    break;
                case "Dec":
                    result = "12";
                    break;
                default:
                    result = "";
            }
            return result;
        }

    }
}
