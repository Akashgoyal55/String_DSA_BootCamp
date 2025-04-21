package Easy;

public class mostRepeatChar {
    public static char getMostFrequentChar(String s) {
        // brute force -  we will use a nested loop
        int maxCount = 0; // highest frequency seen so far
        char maxChar = ' ';

        //using nested loop o(n^2)
        for (int i=0; i<s.length(); i++) {
            int count = 0;

            //inner loop
            for (int j=0; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }


            // updating max
            if (count > maxCount) {
                maxCount = count;
                maxChar = s.charAt(i);
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        String input = "abbccc";
        System.out.println("Most frequent character: " + getMostFrequentChar(input));
    }
}
