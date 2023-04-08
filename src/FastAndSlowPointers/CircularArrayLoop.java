package FastAndSlowPointers;

import java.util.*;

public class CircularArrayLoop
{
    public static boolean circularArrayLoop(int[] nums)
    {
        // Set slow and fast pointer at first element.
        int slow=0, fast=0;
        int size=nums.length;
        for(int i=1;i<=size;i++)
        {
            // save slow pointer's value before moving.
            int prev = slow;
            // move slow pointer one step.
            slow = nextStep(slow, nums[slow], size);
            // Check if cycle is impossible, then set both pointers to next value
            // and move to the next iteration.
            if(isNotCycle(nums, prev, slow))
            {
                fast = i;
                slow = i;
                continue;
            }
            // This flag indicates whether we need to move to the next iteration.
            boolean nextIter = false;
            // Number of moves of fast pointer.
            int moves = 2;
            for (int j=0;j<moves;j++)
            {
                // Save fast pointer's value before moving
                prev = fast;
                // Move fast pointer check cycle after every move.
                fast = nextStep(fast, nums[fast], size);
                // If cycle is not possible, set slow and fast to next element, set "nextIter" to true and
                // break this loop
                if(isNotCycle(nums, prev, fast))
                {
                    fast = i;
                    slow = i;
                    nextIter = true;
                    break;
                }
            }
            // Move to the next iteration
            if (nextIter)
            {
                continue;
            }
            // If both pointers are set at same position after moving both, a cycle is detected
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    private static int nextStep(int pointer, int value, int size)
    {
        int result = (pointer+value)%size;
        if(result == 0)
        {
            result += size;
        }
        return result;
    }
    private static boolean isNotCycle(int[] nums, int prev, int pointer)
    {
        // If signs of both pointers are different or moving a pointer takes back to the same value,
        // then the cycle is not possible, we return True, otherwise return FALSE.
        if ((nums[prev] >= 0 && nums[pointer]<0) || (Math.abs(nums[pointer] % nums.length) == 0))
        {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[][] input = {
                {-2, -3, -9},
                {-5, -4, -3, -2, -1},
                {-1, -2, -3, -4, -5},
                {-1, -2, -3, -4, -5, 6},
                {1, 3, -2, -4, 1},
                {2, 1, -1, -2, 2},
                {2, 1, -1, -2},
                {3, -2, -1, 1},
                {1, 2, -3, 3, 4, 7, 1}
        };
        for (int i = 0; i<input.length; i++) {
            System.out.println((i + 1) + ".\tCircular array = " + Arrays.toString(input[i]) + "\n");
            boolean result = circularArrayLoop(input[i]);
            System.out.println("\tFound Loop = " + result);
            System.out.println(new String(new char[100]).replace('\0', '-'));
            //System.out.println(PrintHyphens.repeat("-", 100));
        }
    }
}
