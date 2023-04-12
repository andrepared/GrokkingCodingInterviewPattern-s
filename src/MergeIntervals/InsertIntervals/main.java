package MergeIntervals.InsertIntervals;

import MergeIntervals.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static List<INterval> insertInterval(List<INterval> existingIntervals, INterval newInterval) {
        // Read the starting and ending of the new interval, into separate variables
        int newStart = newInterval.getStart();
        int newEnd = newInterval.getEnd();
        System.out.println("The new interval starts at " + newStart + " and ends at " + newEnd + ".");
        // Initialize variables to help in iterationg over the existing intervals list
        int i = 0;
        int n = existingIntervals.size();
        List<INterval> output = new ArrayList<INterval>();
        // Append all intervals that start and end before the new interval to the output list.
        System.out.println("Let's start adding these intervals into our output list one by one, until we come across an overlapping interval.");

        while (i < n && existingIntervals.get(i).getStart() < newStart) {
            output.add(existingIntervals.get(i));
            System.out.println("We can add " + (i + 1) + " intervals in our new list without merging any intervals yet:");
            i += 1;
        }
        if (output.size() == 0 || output.get(output.size() - 1).getEnd() < newStart) {
            output.add(newInterval);
        }
        else
        {
            output.get(output.size()-1).setEnd(Math.max(output.get(output.size()-1).getEnd(), newEnd));
        }
        while(i<n)
        {
            INterval ei = existingIntervals.get(i);
            int start = ei.getStart();
            int end = ei.getEnd();
            if (output.get(output.size()-1).getEnd() < start) output.add(ei);
            else output.get(output.size()-1).setEnd(Math.max(output.get(output.size() -1).getEnd(), end));
            i +=1;
        }
        return output;

    }

    public static void main(String[] args) {
        Interval newInterval = new Interval(5, 7);
        List < Interval > existingIntervals = Arrays.asList(new Interval(1, 2), new Interval(3, 5), new Interval(6, 8));
//        List < Interval > output = insertInterval(existingIntervals, newInterval);
//        System.out.println("Existing intervals: " + display(existingIntervals));
//        System.out.println("New interval: [" + newInterval.getStart() + ", " + newInterval.getEnd() + "]");
//        System.out.println("\nNew intervals list: " + display(output));
    }
}
