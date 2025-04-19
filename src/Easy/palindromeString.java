package Easy;

import java.util.Arrays;

public class palindromeString {
    public static boolean checkPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        while(start<end){

            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(checkPalindrome(s));
    }
}
