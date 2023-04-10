package MergeIntervals.EmployeeFreeTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortById implements Comparator<Interval>
{
    // used for sorting in ascending order of ID
    public int compare(Interval a, Interval b)
    {
        return a.getStart() - b.getStart();
    }
}

public class main {
    public static List<Interval> employeeFreeTime(ArrayList<ArrayList<Interval>> schedule) {
        // Initializing two lists
        List<Interval> ans = new ArrayList<>();
        List<Interval> intervals = new ArrayList<>();
        // Merging all the employee schedules into one list of intervals.
        for (int i = 0; i < schedule.size(); i++)
            for (int j = 0; j < schedule.get(i).size(); j++)
                intervals.add(schedule.get(i).get(j));

            // Sorting all intervals
        Collections.sort(intervals, new SortById());
        // Initialzie prev_end as the endpoint of the first interval
        int prevEnd = intervals.get(0).getEnd();
        // Iterating through the intervals and adding the gaps we find to the answer list
        for (int i=0;i<intervals.size();i+=)
        {
            if(intervals.get(i).getStart()>prevEnd)
            {
                ans.add(new Interval(prevEnd, intervals.get(i).getStart()));
            }
            // if the current interval's ending time is later than the current prev_end, update it
            prevEnd = Math.max(prevEnd, intervals.get(i).getEnd());
        }
        return ans;

    }

    public static void main(String[] args) {
        
    }
}