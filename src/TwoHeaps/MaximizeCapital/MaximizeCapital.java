package TwoHeaps.MaximizeCapital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MaximizeCapital
{
    public static int maximumCapital(int c, int k, int[] capitals, int[] profits)
    {
        int n = capitals.length;
        int currentCapital = c;
        PriorityQueue<int[]> CapitalminHeap = new PriorityQueue<Integer>((a,b) -> a[0] - b[0]);
        for (int i =0;i<n;i++)
        {
            CapitalminHeap.offer(new int[] {capitals[i], i});
        }
        PriorityQueue<int[]> ProfitsMaxHeap = new PriorityQueue<>((a,b) -> b[0] - a[0]);

        int i = 0;
        // Calculate capital of all the required number of projects
        // containing max profit
        while(i<k)
        {
            // select projects(in the range of the current capital)
            // then push them onto the max-heap
            while(!CapitalminHeap.isEmpty() && CapitalminHeap.peek()[0] <= currentCapital)
            {
                int[] j = CapitalminHeap.poll();
                ProfitsMaxHeap.offer(new int[]{profits[j[1]], j[1]});
            }
            // check if the max-heap is empty
            if (ProfitsMaxHeap.isEmpty())
            {
                break;
            }
            // Select those projects from the max-heap that contain the max profit
            int x = ProfitsMaxHeap.poll()[0];
            System.out.println("\t\tUpdated capital = " + currentCapital + " + " +x);
            currentCapital += x;
            i++;
        }
        return currentCapital;
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
