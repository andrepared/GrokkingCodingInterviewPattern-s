package TwoHeaps.MaximizeCapital.SlidingWindow;

import java.util.*;

class SlidingWindow{
    public static double[] medianSlidingWindow(int[] nums, int k) {
        // Will store the medians
        List<Double> medians = new ArrayList<Double>();
        // Hash-map will keep track of invalid numbers
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        //max heap
        PriorityQueue<Integer> smallList = new PriorityQueue<Integer>(Collections.reverseOrder());
        //min heap
        PriorityQueue<Integer> largeList = new PriorityQueue<Integer>();

        // Index of current incoming element being processed
        int i = 0;

        // Initialize the smallList heap
        while (i < k) {
            smallList.add(nums[i]);
            i++;
        }

        // Initialize the largeList heap
        for (int j = 0; j < k / 2; j++) {
            largeList.add(smallList.peek());
            smallList.poll();
        }

        // Start an infinite loop
        while (true) {
            if ((k&1) == 1) {
                medians.add((double)smallList.peek());
            } else {
                double temp = ((double)smallList.peek() + (double)largeList.peek()) * 0.5;
                medians.add(temp);
            }

            // Break the loop if all of the elements are processed
            if (i >= nums.length) {
                break;
            }

            // Outgoing element
            int outNum = nums[i - k];
            // Incoming element
            int inNum = nums[i];
            i++;
            // Balance factor
            int balance = 0;

            // Number `outNum` exits window
            if (outNum <= smallList.peek()) {
                balance += -1;
            } else {
                balance += 1;
            }

      /* If the outgoing element is not present in the hash-map
      store the `outNum` in the hash-map with value 1,
      otherwise increment the count of `outNum` in the hash-map.*/
            if (hashMap.get(outNum) != null) {
                int tempVal = hashMap.get(outNum) + 1;
                hashMap.put(outNum, tempVal);
            } else {
                hashMap.put(outNum, 1);
            }

            // number `inNum` enters window
            if (!smallList.isEmpty() && inNum <= smallList.peek()) {
                balance++;
                smallList.add(inNum);
            } else {
                balance--;
                largeList.add(inNum);
            }

            // Re-balance smallList
            if (balance < 0) {
                smallList.add(largeList.peek());
                largeList.poll();
                balance++;
            }

            // Re-balance largeList
            if (balance > 0) {
                largeList.add(smallList.peek());
                smallList.poll();
                balance--;
            }

            // Remove invalid numbers that should be discarded from smallList heap tops
            while (hashMap.get(smallList.peek()) != null && hashMap.get(smallList.peek()) > 0) {
                int tempVal = hashMap.get(smallList.peek()) - 1;
                hashMap.put(smallList.peek(), tempVal);
                smallList.poll();
            }

            // Remove invalid numbers that should be discarded from largeList heap tops
            while (!largeList.isEmpty() && hashMap.get(largeList.peek()) != null && hashMap.get(largeList.peek()) > 0) {
                int tempVal = hashMap.get(largeList.peek()) - 1;
                hashMap.put(largeList.peek(), tempVal);
                largeList.poll();
            }
        }
        // Return medians
        double[] arr = medians.stream().mapToDouble(Double::doubleValue).toArray();
        return arr;
    }

    public static void main(String[] args) {

        int [][]arr = {{1, 3, -1, -3, 5, 3, 6, 7}, {1,2}, {4, 7, 2, 21}, {22, 23, 24, 56, 76, 43, 121 ,1 ,2 ,0 ,0 ,2 ,3 ,5}, {1, 1, 1, 1, 1}};
        int[] k = {3, 1, 2, 5, 2};
        for(int i=0; i<k.length; i++){
            System.out.print(i+1);
            System.out.println(".\tInput array =" + Arrays.toString(arr[i]) + ", k = " + k[i]);
            double[] output = medianSlidingWindow(arr[i], k[i]);
            System.out.println("\tMedians =" + Arrays.toString(output));
        }



    }
}