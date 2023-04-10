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
    }
}
