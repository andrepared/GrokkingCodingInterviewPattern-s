package MergeIntervals.InsertIntervals;


import MergeIntervals.Interval;

import java.util.*;

public class INterval
{
    int start;
    int end;
    boolean closed;

    public INterval(int start, int end)
    {
        this.start = start;
        this.end = end;
        this.closed=true;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

}
