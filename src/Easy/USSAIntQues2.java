package Easy;

public class USSAIntQues2 {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,2};

        double sum = 0;

        // calculating the mean of the array
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        double mean = sum/ arr.length;



    }
}
