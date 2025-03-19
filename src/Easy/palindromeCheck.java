package Easy;

public class palindromeCheck {
    public static boolean isPalindrome(String s){
        
        s = s.toLowerCase();
        //using two pointers technique
        int start = 0;
        int end = s.length()-1;

        while(start < end) {

            while(start<end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            // edge condition to check the palindrome
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
