package MergeIntervals.EmployeeFreeTime;

import java.util.*;

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
        for (int i = 0; i < intervals.size(); i +=) {
            if (intervals.get(i).getStart() > prevEnd) {
                ans.add(new Interval(prevEnd, intervals.get(i).getStart()));
            }
            // if the current interval's ending time is later than the current prev_end, update it
            prevEnd = Math.max(prevEnd, intervals.get(i).getEnd());
        }
        return ans;

    }

    public static void main(String[] args) {
//        List < List < List < Interval >>> inputs1 = (List < List < List < Interval >>>)Arrays.asList(Arrays.asList(Arrays.asList(new Interval(1, 2), new Interval(5, 6)), Arrays.asList(new Interval(1, 3)), Arrays.asList(new Interval(4, 10))), Arrays.asList(Arrays.asList(new Interval(1, 3), new Interval(6, 7)), Arrays.asList(new Interval(2, 4)), Arrays.asList(new Interval(2, 5), new Interval(9, 12))), Arrays.asList(Arrays.asList(new Interval(2, 3), new Interval(7, 9)), Arrays.asList(new Interval(1, 4), new Interval(6, 7))), Arrays.asList(Arrays.asList(new Interval(3, 5), new Interval(8, 10)), Arrays.asList(new Interval(4, 6), new Interval(9, 12)), Arrays.asList(new Interval(5, 6), new Interval(8, 10))), Arrays.asList(Arrays.asList(new Interval(1, 3), new Interval(6, 9), new Interval(10, 11)), Arrays.asList(new Interval(3, 4), new Interval(7, 12)), Arrays.asList(new Interval(1, 3), new Interval(7, 10)), Arrays.asList(new Interval(1, 4)), Arrays.asList(new Interval(7, 10), new Interval(11, 12))), Arrays.asList(Arrays.asList(new Interval(1, 2), new Interval(3, 4), new Interval(5, 6), new Interval(7, 8)), Arrays.asList(new Interval(2, 3), new Interval(4, 5), new Interval(6, 8))), Arrays.asList(Arrays.asList(new Interval(1, 2), new Interval(3, 4), new Interval(5, 6), new Interval(7, 8), new Interval(9, 10), new Interval(11, 12)), Arrays.asList(new Interval(1, 2), new Interval(3, 4), new Interval(5, 6), new Interval(7, 8), new Interval(9, 10), new Interval(11, 12)), Arrays.asList(new Interval(1, 2), new Interval(3, 4), new Interval(5, 6), new Interval(7, 8), new Interval(9, 10), new Interval(11, 12)), Arrays.asList(new Interval(1, 2), new Interval(3, 4), new Interval(5, 6), new Interval(7, 8), new Interval(9, 10), new Interval(11, 12))));
//        int i = 1;
//
//        ArrayList<ArrayList<ArrayList<Interval>>> inputs = new ArrayList<ArrayList<ArrayList<Interval>>>();
//        for(int j = 0; j < inputs1.size(); j++)
//        {
//            inputs.add(new ArrayList<ArrayList<Interval>>());
//            for(int k = 0; k < inputs1.get(j).size(); k++)
//            {
//                inputs.get(j).add(new ArrayList<Interval>());
//                for(int g = 0; g < inputs1.get(j).get(k).size(); g++)
//                {
//                    inputs.get(j).get(k).add(inputs1.get(j).get(k).get(g));
//                }
//            }
//        }
//    }
    }
}