package SlidingWindow;

import java.util.HashMap;

/*
* Here we have to find the largest substring having k unique characters
* At the end we have to return the size of the substring which has the k unique chars
 */
public class largestSubString {
    public static int uniqueChars(String s, int k){
        int start = 0;
        int end = 0;

        int ans = -1;

        HashMap<Character, Integer> map = new HashMap<>(); // to store the unique chars and their count

        while(end<s.length()){
            // calculation
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            // condition 1
            if(map.size()<k){
                end++;
            }

            //condition 2
            if(map.size()==k){
                ans = Math.max(ans, end-start+1);
                end++;
            }

            // condition 3
            if(map.size()>k){

                while(map.size()>k){
                    char first = s.charAt(start);
                    map.put(first, map.get(first)-1);

                    if(map.get(first)==0){
                        map.remove(first);
                    }
                    start++;
                }
                end++;

            }
        }
        return ans;
    }




    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        System.out.println(uniqueChars(s, k));

    }
}