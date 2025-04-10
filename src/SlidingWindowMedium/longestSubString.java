package SlidingWindowMedium;

import java.util.HashMap;

/*
* Here we are given a string
* We have to find the longest substring without repeating characters
* At the end, return the size of the longest substring having unique or no repeat characters
 */
public class longestSubString {
    public static int longestSubStringWithUniqueChars(String s){
        int start = 0;
        int end = 0;
        int ans = -1; // storing the answer, size of the longest substring

        HashMap<Character, Integer> map = new HashMap<>();

        while(end<s.length()){
            // Calculation
            char c = s.charAt(end); // store the end char in the map
            map.put(c, map.getOrDefault(c, 0)+1);

            if(map.size()>end-start+1){ // condition 1
                end++;
            }
            if(map.size()==end-start+1) { // condition 2
                ans = Math.max(ans, end-start+1); // found one possible answer
                end++;
            }
            else if(end-start+1>map.size()) { // condition 3
                char ch = s.charAt(start);
                map.put(ch, map.getOrDefault(ch, 0)-1); // remove the start element from the window
                start++;
            }
            end++;

        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The longest substring without repeating character is " + longestSubStringWithUniqueChars(s));
    }
}
