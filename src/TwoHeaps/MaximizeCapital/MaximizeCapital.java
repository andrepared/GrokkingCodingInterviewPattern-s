package TwoHeaps.MaximizeCapital;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args) {
        int[] c = { 1, 2, 1, 7, 2 };
        int[] k = { 2, 3, 3, 2, 4 };
        int[][] capitals = {
                {1, 2, 2, 3},
                {1, 3, 4, 5, 6},
                {1, 2, 3, 4},
                {6, 7, 8, 10},
                {2, 3, 5, 6, 8, 12}
        };
        int[][] profits = {
                {2, 4, 6, 8},
                {1, 2, 3, 4, 5},
                {1, 3, 5, 7},
                {4, 8, 12, 14},
                {1, 2, 5, 6, 8, 9}
        };
        for (int i = 0; i<k.length; i++) {
            System.out.println((i + 1) + ".\tGiven capitals: " + Arrays.toString(capitals[i]));
            System.out.println("  \tAdding capital values...");
            maximumCapital(c[i], k[i], capitals[i], profits[i]);
        }
    }
}
