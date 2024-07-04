package com.solvd.practicalInterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class MapProcessing {

    private static Date dateFromString(String str) {
        return new Date(Integer.parseInt(str.split("-")[0]),
                Integer.parseInt(str.split("-")[1]),
                Integer.parseInt(str.split("-")[2]));
    }

    private static List<String> getLastTwoDays(Map<String, Map<String, Map<String, Integer>>> viewsParams) {
        List<String> dates = viewsParams.keySet().stream().
                sorted(Comparator.comparing(MapProcessing::dateFromString)).collect(Collectors.toList());
        List<String> lastDates = new ArrayList<String>();
        if (!dates.isEmpty()) {
            lastDates.add(dates.get(dates.size() - 1));
            if (dates.size() > 1) {
                lastDates.add(dates.get(dates.size() - 2));
            }
        }
        return lastDates;
    }

    private static int getCntViewsByDate(String date, Map<String, Map<String, Map<String, Integer>>> viewsParams) {
        Map<String, Map<String, Integer>> viewsDataByDay = viewsParams.get(date);
        int cntViews = 0;
        for (Map<String, Integer> viewWay : viewsDataByDay.values()) {
            cntViews += viewWay.get("pageviews");
        }
        return cntViews;
    }

    public static int getTotalNumberOfViewForTheLastTwoDays(Map<String, Map<String, Map<String, Integer>>> viewsParams) {
        List<String> lastDays = getLastTwoDays(viewsParams);
        if (lastDays.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (String date : lastDays) {
            sum += getCntViewsByDate(date, viewsParams);
        }
        return sum;
    }
}
