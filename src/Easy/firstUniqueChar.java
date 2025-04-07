package Easy;

import java.util.HashMap;

/*
* Here we have been given a string and, we have to find the first unique char in it
 */
public class firstUniqueChar {
    static int firstUniqueCharacter(String s){
        // we will be using HashMap to store the char and keep the track of count of the char
        HashMap<Character, Integer> map = new HashMap<>();

        // first pass - to count the frequencies
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0)+1);
        }

        // second pass - to check the first unique character
        for (int i=0; i<s.length(); i++) {
            if(map.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("The first unique char is : " + firstUniqueCharacter(s));

    }
}
