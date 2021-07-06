package com.ictexpertsgroup.code;

import java.util.*;

public class FraudulentActivityNotifications {

    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        int totalNotifications = 0;
        for (int i = d; i < expenditure.size(); i++) {
            Double median = 0d;
            int index = 0;
            int start=i-d;
            int end = start+d-1;
            List<Integer> trailExp = expenditure.subList(start, end);
            Collections.sort(trailExp);

            SortedSet <Integer> sortedSet = new TreeSet(trailExp);
//            Integer[] numberArray = sortedSet.toArray( new Integer[sortedSet.size()] );
            if (d % 2 == 0) {
                index = (d / 2) - 1;
                median = new Double((trailExp.get(index) + trailExp.get(index + 1))) / 2;
//                median = new Double((numberArray[index] + numberArray[index + 1])) / 2;

            } else {
                index = (int) Math.ceil(d / 2);
                median = new Double(trailExp.get(index));
//                median = new Double(numberArray[index]);
            }

            if (expenditure.get(i) >= median * 2) {
                totalNotifications++;
            }
        }

        return totalNotifications;

    }

    public static void main(String[] args) {
//      Integer [] a = {10, 20, 30, 40, 50};
        Integer[] a = {2,3, 4, 2, 3, 6, 8, 4, 5};
        List<Integer> exp = Arrays.asList(a);
        System.out.println(activityNotifications(exp, 5));

    }
}
