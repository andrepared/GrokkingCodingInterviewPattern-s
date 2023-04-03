package slidingWindow;

import java.util.HashMap;

class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (t == "") {
            return "";
        }
//         Creating the two hash maps
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> rCount = new HashMap<>();
        // Populating rCount hashmap
        for (int c = 0; c < t.length(); c++) {
            char c1 = t.charAt(c);
            rCount.put(c1, rCount.getOrDefault(c1, 0) + 1);
        }


        // Setting up the conditional variables
        int l = 0;
        int r = 0;
        int current = 0;
        int required = rCount.size();

        int resLen = Integer.MAX_VALUE;

        int start = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            // Populating the window hashmap
            if (rCount.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);

                if (window.get(c).equals(rCount.get(c))) {
                    current++;
                }
            }

            // Adjusting the sliding window
            while (current == required) {
                // update our result
                if (r - l<resLen) {
                    start = l;
                    resLen = r - l;
                }

                char d = s.charAt(l);
                l++;

                if (rCount.containsKey(d)) {
                    if (window.get(d).equals(rCount.get(d))) {
                        current--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(start, start + resLen);
    }

    public static void main(String[] args) {
        // Driver code
        String[] s = {"PATTERN", "LIFE", "ABRACADABRA", "STRIKER", "DFFDFDFVD"};
        String[] t = {"TN", "I", "ABC", "RK", "VDD"};
        for (int i = 0; i<s.length; i++) {
            System.out.println((i + 1) + ".\ts: " + s[i] + "\n\tt: " + t[i] + "\n\tThe minimum substring containing " +
                    t[i] + " is: " + minWindow(s[i], t[i]));
//            System.out.println(PrintHyphens.repeat("-", 100));
        }

    }
}
