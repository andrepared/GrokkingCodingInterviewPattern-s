package MergeIntervals.EmployeeFreeTime;

import java.util.ArrayList;
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

public class main
{
    public static List< Interval > employeeFreeTime(ArrayList< ArrayList <Interval>> schedule)
    {
        
    }
}
