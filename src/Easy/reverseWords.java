package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseWords {
    public static String reverseWord(String s){
        String[] wordParts = s.split("\\."); // String array contains split string with dots
        List<String> words = new ArrayList<>(); // Created list to store the actual words

        for (int i=0; i<wordParts.length; i++){
            if(!wordParts[i].isEmpty()){
                words.add(wordParts[i]);
            }
        }
        Collections.reverse(words);
        return String.join(".", words);
    }
    public static void main(String[] args) {
        String s = "..I.Like..Coding.";
        System.out.println(reverseWord(s));
    }
}
