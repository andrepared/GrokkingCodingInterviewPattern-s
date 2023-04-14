package ModifiedBinarySearch.SearchInRotatedSortedArray;

import java.util.Arrays;
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
            if (nums.get(mid) == target) return mid;
            // If the target value is greater than the mid, ignore the first half.
            else if (nums.get(mid)>target) return start = mid +1;
            // If the target value is less than the mid, ignore the 2nd half.
            else if (nums.get(mid)<target) return end = mid -1;
        }
        return -1;
    }
    public static void main(String args[]) {
        List < Integer > targetList = Arrays.asList(3, 60, 15, 11);
        List < List < Integer >> numList = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7), Arrays.asList(10, 20, 30, 40, 50, 60), Arrays.asList(11, 15, 200, 432, 765, 1000), Arrays.asList(3, 5, 7, 9, 11, 13));
        for (int i = 0; i < targetList.size(); i++) {
            System.out.println((i + 1) + ".\tSorted array: " + numList.get(i) + "\n\ttarget " + targetList.get(i) + " found at index " + binarySearch(numList.get(i), targetList.get(i)));

        }
    }
}
