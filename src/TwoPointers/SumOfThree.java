package TwoPointers;

import java.util.Arrays;

public class SumOfThree
{
    public static boolean findSumThree(int nums[], int target)
    {
        // Sort the input Array
        Arrays.sort(nums);
        int low, high, triples;    // pointers

        // Fix one integer at a time and find the other two
        for(int i=0; i<nums.length-2;i++)
        {
            // Initialize the two pointers
            low = i+1;
            high = nums.length-1;


            // Traverse the array to find the triplet
            while(low<high)
            {
                triples = nums[i] + nums[low] + nums[high];

                if (triples == target)
                {
                    return true;
                }
                // The sum of the triple is less than the target, move the counter forward.
                else if (triples < target)
                {
                    low++;
                }
                else {
                    high--;
                }
            }
        }
            return false;
    }

    public static void main(String[] args) {
        int[][] numsList = {{3, 7, 1, 2, 8, 4, 5},
                {-1, 2, 1, -4, 5, -3},
                {2, 3, 4, 1, 7, 9},
                {1, -1, 0},
                {2, 4, 2, 7, 6, 3, 1}};

        int[] testList = {10, 7, 20, -1, 8};

//
//        for (int i=0; i<testList.length; i++) {
//            System.out.print(i+1);
//            System.out.println(".\tInput array: " + Arrays.toString(numsList[i]));
//
//            if (findSumOfThree(numsList[i], testList[i])) {
//                System.out.println("\tSum for " + testList[i] + " exists ");
//            } else {
//                System.out.println("\tSum for " + testList[i] + " does not exist ");
//            }
//
//            System.out.println(PrintHyphens.repeat("-", 100));
//        }

    }
    }
}
