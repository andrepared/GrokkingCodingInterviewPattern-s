package MergeIntervals.EmployeeFreeTime;

import java.util.*;

public class Interval
{
    int start;
    int end;
    boolean closed;

    public Interval(int start, int end)
    {
        this.start = start;
        this.end=end;
        this.closed = true;
    }

    public int getStart()
    {
        return start;
    }
    public int getEnd()
    {
        return end;
    }

    public void setClosed(boolean closed)
    {
        this.closed = closed;
    }
    
}
