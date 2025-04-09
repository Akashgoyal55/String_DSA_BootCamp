package SlidingWindow;
/*
* Here we have been given an array and sum (k)
* We have to find the largest subArray whose sum is equal to given sum (k)
 */
public class varSizeWindow {
    static int largestSubArray(int[] arr, int k){
        int start = 0;
        int end = 0;

        int sum = 0;
        int max = 0;

        while(end<arr.length-1) {
            sum = sum + arr[end];

            if(sum<k){ // cond 1
                end++;
            }
            if(sum==k){ // cond 2

                if(end-start+1>max) {
                    max = end-start+1;
                }
                end++;
            }

            if(sum>k){ // cond 3

                while(sum>k){
                    sum = sum - arr[start];
                    start++;
                    end++;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;

        System.out.println("The largest subarray having sum k is: " + largestSubArray(arr, k));

    }
}
