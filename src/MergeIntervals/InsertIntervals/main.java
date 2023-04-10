package MergeIntervals.InsertIntervals;

import MergeIntervals.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main
{
    public static void insertInterval(List<Interval> existingIntervals, Interval newInterval)
    {
        // Read the starting and ending of the new interval, into separate variables
        int newStart = newInterval.getStart();
        int newEnd = newInterval.getEnd();
        System.out.println("The new interval starts at " + newStart + " and ends at " + newEnd + ".");
        // Initialize variables to help in iterationg over the existing intervals list
        int i = 0;
        int n = existingIntervals.size();
        List <Interval> output = new ArrayList<Interval>();
        // Append all intervals that start and end before the new interval to the output list.
        System.out.println("Let's start adding these intervals into our output list one by one, until we come across an overlapping interval.");

        while(i<n && existingIntervals.get(i).getStart() < newStart)
        {
            output.add(existingIntervals.get(i));
            System.out.println("We can add " + (i + 1) + " intervals in our new list without merging any intervals yet:");
            i += 1;
        }

    }

    public static void main(String[] args) {
        Interval newInterval = new Interval(5, 7);
        List < Interval > existingIntervals = Arrays.asList(new Interval(1, 2), new Interval(3, 5), new Interval(6, 8));
        insertInterval(existingIntervals, newInterval);
    }
}
