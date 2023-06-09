package ModifiedBinarySearch.SearchInRotatedSortedArray;

import java.util.Arrays;
import java.util.List;

//public class Main
//{
//    public static int binarySearch (List<Integer> nums, int start, int end, int target)
//    {
//        if(start > end) return -1;
//
//        // Finding the mid using integer division.
//        int mid = start + (end -start) / 2;
//            // Target value is present at the middle of the array.
//            if (nums.get(mid) == target) return mid;
//            // If the target value is greater than the mid, ignore the first half.
//            else if (nums.get(mid)>target) return binarySearch(nums, mid+1, end, target);
//            // If the target value is less than the mid, ignore the 2nd half.
//            else return binarySearch(nums, start, mid-1, target);
//
//
//    }
//    public static void main(String args[]) {
//        List < Integer > targetList = Arrays.asList(3, 60, 15, 11);
//        List < List < Integer >> numList = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7), Arrays.asList(10, 20, 30, 40, 50, 60), Arrays.asList(11, 15, 200, 432, 765, 1000), Arrays.asList(3, 5, 7, 9, 11, 13));
//        for (int i = 0; i < targetList.size(); i++) {
//            System.out.println((i + 1) + ".\tSorted array: " + numList.get(i) + "\n\ttarget " + targetList.get(i) + " found at index " + binarySearch(numList.get(i), targetList.get(i)));
//
//        }
//    }
//}
class Main {

    public static int binarySearch(List < Integer > nums, int start, int end, int target) {
        if (start > end) return - 1;
        int mid = start + (end - start) / 2;
        if (nums.get(mid) == target) return mid;
        if (nums.get(start) <= nums.get(mid)) {
            if (nums.get(start) <= target && target < nums.get(mid)) {
                return binarySearch(nums, start, mid - 1, target);
            }
            else {
                return binarySearch(nums, mid + 1, end, target);
            }
        }
        else {
            if (nums.get(mid) < target && target <= nums.get(end)) return binarySearch(nums, mid + 1, end, target);
            else return binarySearch(nums, start, mid - 1, target);
        }
    }

    public static int binarySearchRotated(List < Integer > nums, int target) {
        return binarySearch(nums, 0, nums.size() - 1, target);
    }

    public static void main(String args[]) {
        List < Integer > targetList = Arrays.asList(3, 6, 3, 6);
        List < List < Integer >> numList = Arrays.asList(Arrays.asList(6, 7, 1, 2, 3, 4, 5), Arrays.asList(6, 7, 1, 2, 3, 4, 5), Arrays.asList(4, 5, 6, 1, 2, 3), Arrays.asList(4, 5, 6, 1, 2, 3));
        for (int i = 0; i < targetList.size(); i++) {
            System.out.println((i + 1) + ".\tSorted array: " + numList.get(i) + "\n\ttarget " + targetList.get(i) + " found at index " + binarySearchRotated(numList.get(i), targetList.get(i)));
                   }
    }
}