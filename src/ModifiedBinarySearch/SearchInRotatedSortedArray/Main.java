package ModifiedBinarySearch.SearchInRotatedSortedArray;

import java.util.List;

public class Main
{
    public static int binarySearch (List<Integer> nums, int target)
    {
        int start = 0;
        int end = nums.size() -1;
        int mid = 0;
        if(start > end) return -1;

        while(start<=end)
        {
            // Finding the mid, using integer division.
            mid = start + (end -start) / 2;
            // Target value is present at the middle of the array.

        }
    }
}
