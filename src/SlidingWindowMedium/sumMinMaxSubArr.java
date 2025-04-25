package SlidingWindowMedium;
/*
* Here we have been an array and window size k
* We have to find the sum of minimum and maximum elements of all subarray of size k
 */
public class sumMinMaxSubArr {

    // BRUTE FORCE
//    public static int sumMinMaxSubArray(int[] arr, int k){
//        int ans = 0;
//        int n = arr.length;
//
//        // 1st loop to iterate to the window size (k)
//        for (int i=0; i<=n-k; i++){
//            int min = arr[i];
//            int max = arr[i];
//
//            // 2nd loop to find the min and max of current subArray of size k
//            for (int j=i+1; j<i+k; j++){
//                if(arr[j]<min){
//                    min = arr[j];
//                }
//                if(arr[j]>max){
//                    max = arr[j];
//                }
//            }
//            ans = ans + min +max;
//        }
//        return ans;
//    }




    public static void main(String[] args) {
        int[] arr = {2,5,-1,7,-3,-1,-2};
        int k = 4;

    }
}
