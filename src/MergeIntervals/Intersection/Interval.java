package MergeIntervals.Intersection;

public class Interval
{
    int start;
    int end;
    boolean closed = false; // By default, the interval is closed.

    public Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
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
    // set the the flag for closed/open
    public void setClosed(boolean closed)
    {
        this.closed = closed;
    }
}
