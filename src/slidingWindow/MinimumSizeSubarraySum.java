package slidingWindow;

class MinimumSubArraySum {
//    public static int minSubArrayLen(int target, int[] nums) {
//        // Initializing windowSize to a max number
//        int windowSize = Integer.MAX_VALUE;
//        int currSubArrSize = 0;
//        // Initialize start pointer to 0 and sum to 0
//        int start = 0;
//        int totalSum = 0;
//
//        // Iterate over the input array
//        for (int end = 0; end < nums.length; end++) {
//            totalSum += nums[end];
//            // check if we can remove elements from the start of the subarray
//            // while still satisfying the target condition
//            while (totalSum >= target) {
//                // Finding size of current subarray
//                currSubArrSize = (end + 1) - start;
//                windowSize = Math.min(windowSize, currSubArrSize);
//                totalSum -= nums[start];
//                start += 1;
//            }
//
//        }
//
//        if (windowSize != Integer.MAX_VALUE) {
//            return windowSize;
//        } else {
//            return 0;
//        }
//    }
//    public static void main(String[] args) {
//        int[] target = {7, 4, 11, 10, 5, 15};
//        int[][] inputArr = {
//                {2, 3, 1, 2, 4, 3},
//                {1, 4, 4},
//                {1, 1, 1, 1, 1, 1, 1, 1},
//                {1, 2, 3, 4},
//                {1, 2, 1, 3},
//                {5, 4, 9, 8, 11, 3, 7, 12, 15, 44}
//        };
//        for (int i = 0; i < target.length; i++) {
//            System.out.print(i + 1);
//            System.out.println(".\tminSubarraylen(" + target[i] + ", " + Arrays.toString(inputArr[i]) + ") : " + minSubArrayLen(target[i], inputArr[i]));
//            System.out.println(PrintHyphens.repeat("-", 100));
//        }
//    }
}