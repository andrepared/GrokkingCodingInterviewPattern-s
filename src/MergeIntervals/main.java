package MergeIntervals;

import java.util.ArrayList;
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
    }
}
