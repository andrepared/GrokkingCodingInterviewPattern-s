package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.put;

public class RepeatedDNA {
    public static List<Integer> findRepeatedSequences(String s, int k)
    {
        int windowSize = k;
        if(s.length()<=windowSize){
         return new ArrayList<Integer>();
        }
        // parameters of rolling hash
        int base = 4;
        int hiPlaceValue = (int) Math.pow(base, windowSize);
        // mapping of a character into an integer
        Map<Character, Integer> mapping = new HashMap<Character, Integer>() {
            {
                put('A', 1);
                put('C', 2);
                put('G', 3);
                put('T', 4);
            }
        };
        List<Integer> numbers = new ArrayList<>();
        for (int i=0;i<s.length();i++)
            numbers.add(mapping.get(s.charAt(i)));
        return numbers;
    }
}
