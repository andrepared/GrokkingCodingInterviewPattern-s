package MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main
{
    public static List<Interval> mergeIntervals(List <Interval> intervals)
    {
        List<Interval> result = new ArrayList <Interval> ();

        // if the list is empty
        if(intervals.size() == 0)
        {
            System.out.println("The list is empty");
            return result;
        }
        // Adding pair in the result list
        result.add(new Interval(intervals.get(0).getStart(), intervals.get(0).getEnd()));
        for (int i=1;i<intervals.size();i++)
        {
            // Getting the recent added interval in the result list
            Interval lastAddedInterval = result.get(result.size()-1);
            // Getting and initializing input pair
            int currStart = intervals.get(i).getStart();
            int currEnd = intervals.get(i).getEnd();
            System.out.println("\n\t\t\tCurrent input interval: [" + currStart + ", " + currEnd + "]\n");
            int prevEnd = lastAddedInterval.getEnd();
        }
        return result;
    }
    public static String intervalListtoStr(List <Interval> l1)
    {
        String resultStr = "[";
        for (int i = 0; i < l1.size() - 1; i++)
        {
        resultStr += "[" + l1.get(i).getStart() + ", " + l1.get(i).getEnd() + "], ";
    }
        resultStr += "[" + l1.get(l1.size() - 1).getStart() + ", " + l1.get(l1.size() - 1).getEnd() + "]";
        resultStr += "]";
        return resultStr;
    }

    public static void main(String[] args) {
        List < Interval > l1 = Arrays.asList(new Interval(1, 5), new Interval(3, 7), new Interval(4, 6));
        List < Interval > l2 = Arrays.asList(new Interval(1, 5), new Interval(4, 6), new Interval(6, 8), new Interval(11, 15));
        List < Interval > l3 = Arrays.asList(new Interval(3, 7), new Interval(6, 8), new Interval(10, 12), new Interval(11, 15));
        List < Interval > l4 = Arrays.asList(new Interval(1, 5));
        List < Interval > l5 = Arrays.asList(new Interval(1, 9), new Interval(3, 8), new Interval(4, 4));
        List < Interval > l6 = Arrays.asList(new Interval(1, 2), new Interval(3, 4), new Interval(8, 8));
        List < Interval > l7 = Arrays.asList(new Interval(1, 5), new Interval(1, 3));
        List < Interval > l8 = Arrays.asList(new Interval(1, 5), new Interval(6, 9));
        List < Interval > l9 = Arrays.asList(new Interval(0, 0), new Interval(1, 18), new Interval(1, 3));
        List < List < Interval >> allIntervals = Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9);
        for (int i = 0; i < allIntervals.size(); i++) {
            System.out.println(i + 1 + ". Intervals to merge: " + intervalListtoStr(allIntervals.get(i)));
            List < Interval > result = mergeIntervals(allIntervals.get(i));
    }
}}
