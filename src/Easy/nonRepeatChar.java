package Easy;

import java.util.HashMap;
// We have been given a string and out task is to find the first non-repeating char
public class nonRepeatChar {
    public static char nonRepChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        // first loop - to store the frequency of the char in the map
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // second loop to get the first non-repeating char
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch)==1){
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("The first non-repeating char is "+ nonRepChar(s));
    }
}
