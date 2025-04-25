package Easy;

import java.util.HashMap;

public class romanToDecimal {
    public static int romanDecimal(String s){
        // We are creating a hashmap to store a key value pair
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        for (int i=0; i<s.length(); i++){
            int current = map.get(s.charAt(i));
            if(i+1<s.length() && current<map.get(s.charAt(i+1))){
                ans = ans - current;
            }else{
                ans = ans+current;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "IX";
        System.out.println(romanDecimal(s));
    }
}
