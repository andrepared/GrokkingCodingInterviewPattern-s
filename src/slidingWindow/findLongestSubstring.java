package slidingWindow;

import java.util.Hashtable;

public class findLongestSubstring
{
    public static int findLongestSubstring(String string)
    {
        // Check the length of input string
        if(string.length() == 0)
        {
            return 0;
        }
        int n = string.length();
        int strCurrent = 0, longest = 0, currLength = 0, i = 0;
        Hashtable<Character, Integer> window = new Hashtable<Character, Integer>();
        // Traverse input string to find the longest substring
        // without repeating characters.
        for (;i<n;i++){
            // If the current element is not present in the hash map
            if (!window.containsKey(string.charAt(i))){
                window.put(string.charAt(i),i);
            } else {
                // If the current element is present in the hash map, it means that this element
                // may have appeared before. Check if the current element occurs before or after `stCurr`.
                if (window.get(string.charAt(i))>= strCurrent){
                    currLength = i - strCurrent;
                    if (longest < currLength){
                        longest = currLength;
                    }
                    strCurrent = window.get(string.charAt(i)) + 1;
                }
                // Update the last occurance of the element in the hash table.
                window.replace(string.charAt(i), i);
            }
        }
        // Update the longest substring's length and starting index.
        if (longest < i-strCurrent){
            longest = i-strCurrent;
        }
        return longest;
    }

}
