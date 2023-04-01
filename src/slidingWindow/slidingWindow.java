package slidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class slidingWindowMaximum
{
public static List<Integer> findMaxSlidingWindow(List<Integer> nums, int windowSize){
    /**
     *
     */
    List<Integer> result = new ArrayList<Integer>();
    // Initializing doubly ended queue for storing indices.
    Deque<Integer> window = new ArrayDeque<Integer>();
    // if windowSize is greater than array size, set windowSize to array size
    if (windowSize>nums.size())
        windowSize = nums.size();

    // iterate though the entire array
    for (int i=0; i<windowSize;i++)
    {
        System.out.println("\tIteration " + (i+1)+ " Window: " + window);
        // For every element, remove the previous smaller element from the window
        while(!window.isEmpty() && nums.get(i)>=nums.get(window.peekLast())){
            System.out.println("\t\tnums[" + i + " ]= " + nums.get(i) + "is greater than or equal to nums.[window[-1]] = " + nums.get(window.peekLast()));
            window.removeLast();
            System.out.println("\tWindow after popping: " + window);
        }
        window.addLast(i);
    }
    result.add(nums.get(window.peek()));
//    for (int i = windowSize; i<nums.size(); i++) {
//        while ((!window.isEmpty()) && nums.get(i) >= nums.get(window.peekLast())) {
//            window.removeLast();
//        }
//        if ((!window.isEmpty()) && window.peek()<= (i - windowSize))
//            window.removeFirst();
//        window.addLast(i);
//        result.add(nums.get(window.peek()));

    return result;
}
}
public class slidingWindow {
    public static void main(String args[]) {
        List<Integer> targetList = Arrays.asList(3, 3, 3, 3, 2, 4, 3, 2, 3, 18);
        List<List<Integer>> numLists = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1),
                Arrays.asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10),
                Arrays.asList(1, 5, 8, 10, 10, 10, 12, 14, 15, 19, 19, 19, 17, 14, 13, 12, 12, 12, 14, 18, 22, 26, 26, 26, 28, 29, 30),
                Arrays.asList(10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67),
                Arrays.asList(4, 5, 6, 1, 2, 3),
                Arrays.asList(9, 5, 3, 1, 6, 3),
                Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16),
                Arrays.asList(-1, -1, -2, -4, -6, -7),
                Arrays.asList(4, 4, 4, 4, 4, 4)
        );
        for (int i = 0; i<numLists.size(); i++) {
            System.out.println(i + 1 + ".\tOriginal array:\t" + numLists.get(i));
            System.out.println("\tWindow size:\t" + targetList.get(i));
            System.out.println("\n\tMax:\t" + findMaxSlidingWindow(numLists.get(i), targetList.get(i)));
            System.out.println(PrintHyphens.repeat("-", 100));
        }
    }
}
/**
 *class SlidingWindowMaximum {
 *
 * 	public static List<Integer> findMaxSlidingWindow(List<Integer> nums, int windowSize) {
 * 		List<Integer> result = new ArrayList<Integer>();
 * 		Deque<Integer> window = new ArrayDeque<Integer> ();
 *
 * 		if (windowSize > nums.size())
 * 			windowSize = nums.size();
 *
 * 		for (int i = 0; i<windowSize; i++) {
 * 			while ((!window.isEmpty()) && nums.get(i) >= nums.get(window.peekLast())) {
 * 				window.removeLast();
 *                        }
 * 			window.addLast(i);
 ** 		}
 * 		result.add(nums.get(window.peek()));
 * 		for (int i = windowSize; i<nums.size(); i++) {
 * 			while ((!window.isEmpty()) && nums.get(i) >= nums.get(window.peekLast())) {
 * 				window.removeLast();* 			}
 * 			if ((!window.isEmpty()) && window.peek()<= (i - windowSize))
 * 				window.removeFirst();
 * 			window.addLast(i);
 * 			result.add(nums.get(window.peek(        ;
 * 		}
 * 		return res    t;
 * 	}
 *
 * 	public static void main(String args[]) {
 * 		List<Integer> targetList = Arrays.asList(3, 3, 3, 3, 2, 4, 3, 2, 3, 18);
 * 		List<List<Integer>> numLists = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
 * 		                                    Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1),
 * 											Arrays.asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10),
 * 											Arrays.asList(1, 5, 8, 10, 10, 10, 12, 14, 15, 19, 19, 19, 17, 14, 13, 12, 12, 12, 14, 18, 22, 26, 26, 26, 28, 29, 30),
 * 											Arrays.asList(10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67),
 * 											Arrays.asList(4, 5, 6, 1, 2, 3),
 * 											Arrays.asList(9, 5, 3, 1, 6, 3),
 * 											Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16),
 * 											Arrays.asList(-1, -1, -2, -4, -6, -7),
 * 											Arrays.asList(4, 4, 4, 4, 4, 4)
 * 		);
 * 		for (int i = 0; i<numLists.size(); i++) {
 * 			System.out.println(i + 1 + ".\tOriginal array:\t" + numLists.get(i));
 * 			System.out.println("\tWindow size:\t" + targetList.get(i));
 * 			System.out.println("\n\tMax:\t" + findMaxSlidingWindow(numLists.get(i), targetList.get(i)));
 * 			System.out.println(PrintHyphens.repeat("-", 10        ;
 *    }
 * 	}
 * }
 */
