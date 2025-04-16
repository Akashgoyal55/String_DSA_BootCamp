package SlidingWindowMedium;

public class maxSumSubArr {
    public static int maxSum(int[] arr, int k){
        int start = 0;
        int end = 0;
        int sum = 0;
        int ans = -1;

        while(end<arr.length){ // main loop
            sum = sum + arr[end]; // calculation

            if(end-start+1<k) { // condition 1 - we have to hit the window size first
                end++;
            }
            else if(end-start+1==k){ // condition 2 - one possible answer is found
                ans = Math.max(ans, sum);
                // remove the sum of the start element and move the window ahead
                sum = sum-arr[start];
                start++;
                end++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println("The maximum sum of the subarray of size " + k + " is :" + maxSum(arr, k));
    }
}
