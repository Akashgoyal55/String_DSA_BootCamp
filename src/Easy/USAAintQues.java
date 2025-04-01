package Easy;

public class USAAintQues {

    static int intResult(String firstPublicKey, String secondPublicKey) {

        firstPublicKey = firstPublicKey.toLowerCase();
        secondPublicKey = secondPublicKey.toLowerCase();

        int count = 0;

        for (int i=0; i<=firstPublicKey.length() - secondPublicKey.length(); i++) {

            //edge case (check)
            if (firstPublicKey.substring(i, i+secondPublicKey.length()).equals(secondPublicKey)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String firstPublicKey = "TimisplayinginthehouseofTimwiththetoysofTim";
        String secondPublicKey = "Tim";

        System.out.println(intResult(firstPublicKey, secondPublicKey));
    }
}
