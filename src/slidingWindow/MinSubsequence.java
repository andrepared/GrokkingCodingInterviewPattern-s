package slidingWindow;

public class MinSubsequence {
    public static void minWindow(String str1, String str2){
        // save the size of str1 and str2
        int sizeStr1 = str1.length();
        int sizeStr2 = str2.length();
        //initialize the length to a very large number(infinity)
        float length = Float.POSITIVE_INFINITY;
        // initialize the pointers to zerp and the minsubsequence string to
        // 0
        int indexStr1 = 0;
        int indexStr2 = 0;
        String minSubsequence = "";
        int[] arr = new int[2];
        arr[0] = sizeStr1;
        arr[1] = sizeStr2;

//        while (indexS1 < sizeStr1) {
//            // Check if the character pointed by index_s1 in str1
//            // is the same as the character pointed by index_s2 in str2
//            if (str1.charAt(indexS1) == str2.charAt(indexS2)) {
//                // If the pointed character is the same
//                // in both strings increment index_s2
//                System.out.println("\t" + str1.charAt(indexS1) + " is same in both str1 and str2 at index " + indexS1 + " and " + indexS2 + " respectively");
//                indexS2 += 1;
//                // Check if index_s2 has reached the end of str2
//                if (indexS2 == sizeStr2) {
//                    // At this point the str1 contains all characters of str2
//                    int start = indexS1;
//                    int end = indexS1 + 1;
//                }
//            }
//            // Increment pointer index_s1 to check next character in str1
//            indexS1 += 1;
//        }
    }
}
