package TwoPointers;
import java.util.*;

class ReverseWords {

    public static String reverseWords(String s) {
        // trim spaces and convert string to string builder
        char[] s1 = s.toCharArray();
        String s2 = cleanSpaces(s1, s1.length);
        StringBuilder builder = new StringBuilder(s2);

        // reverse the whole string using the strRev() function
        strRev(builder, 0, builder.length() - 1);

        // reverse every word
        int n = builder.length();
        int start = 0, end = 0;
        // Find the start index of each word by detecting spaces.
        while (start < n) {
            // Find the end index of the word.
            while (end < n && builder.charAt(end) != ' ')
                ++end;
            // Let's call our helper function to reverse the word in-place.
            strRev(builder, start, end - 1);
            // moving to the next word
            start = end + 1;
            ++end;
        }

        return builder.toString();
    }
    // Function to reverse the whole string
    public static void strRev(StringBuilder sb, int startRev, int endRev) {
        // Starting from the two ends of the list, and moving
        // in towards the centre of the string, swap the characters
        while (startRev < endRev) {
            char temp = sb.charAt(startRev); // temp store for swapping
            sb.setCharAt(startRev++, sb.charAt(endRev));
            sb.setCharAt(endRev--, temp);
        }
    }
    // trim leading, trailing and multiple spaces
    static String cleanSpaces(char[] a, int n) {
        // Convert character array to string
        String str = new String(a, 0, n);

        // Trim extra spaces at the beginning and end of the string
        // And replace multiple spaces with a single space
        str = str.replaceAll("\\s+", " ").trim();

        return str;
    }


    public static void main(String[] args) {
        String[] inputs = {
                "Hello World", "We love Python",
                "The quick brown fox jumped over the lazy dog.",
                "Hey", "To be or not to be", "AAAAA", " Hello     World "};

        for(int i=0; i<inputs.length; i++){
            System.out.print(i+1);
            System.out.println(".\tActual string:\t\t"+ inputs[i]);
            System.out.println("\tReversed String:\t"+ reverseWords(inputs[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }

    }
}