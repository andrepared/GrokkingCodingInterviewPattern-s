package TwoHeaps.MaximizeCapital;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaximizeCapital
{
    public static int maximumCapital(int c, int k, int[] capitals, int[] profits)
    {
        PriorityQueue<Integer> CapitalminHeap = new PriorityQueue<Integer>();

        int i = 0;
        // Insert all capital's values to a min-heap
        while(i<capitals.length)
        {
            CapitalminHeap.add(capitals[i]);
            i++;
        }
        printCapitalsMinHeap(CapitalminHeap);
        return 0;
    }
    static void printCapitalsMinHeap(PriorityQueue<Integer> capitals)
    {
        List<Integer> l = new ArrayList<>();
        while(!capitals.isEmpty())
        {
            l.add(capitals.peek());
            capitals.poll();
        }
        System.out.println("\t"+ l.toString());
    }
}
