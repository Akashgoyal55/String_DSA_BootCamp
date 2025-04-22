package Easy;
// here we are given two String, and we have to check if string2 is a rotation of string 1
public class checkRotation{
    public static boolean checkRotation(String s1, String s2){
        //edge case
        if(s1.length()!=s2.length()){
            return false;
        }

        for(int i=0; i<s1.length(); i++){
            String returned = s1.substring(i) + s1.substring(0, i);

            if(returned.equals(s2)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(checkRotation(s1, s2));
    }
}