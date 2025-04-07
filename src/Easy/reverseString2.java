package Easy;
// Here we have been given a string and we have to reverse it
public class reverseString2 {
    public static void main(String[] args) {

        String s = "hello";

        // first convert the string to char array
        char[] chars = s.toCharArray();

        int start = 0;
        int end = chars.length-1;

        while(start<=end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;

            // converting the char array back to string
            String ans = new String(chars);

            System.out.println("This is the reverse string: " + ans);
        }
    }
}
