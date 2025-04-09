package SlidingWindow;
/*
* Here we have given an array and int k (k = sum)
* We have to find the longest subarray which has a sum of k
* At the end we have to return the size of that longest subarray having sum k
 */
public class largestSubarrayOfSumK {
    public static int longestSubArray(int[] arr, int k) {
        int start = 0;
        int end = 0;

        int sum = 0;
        int ans = 0;

        while(end<arr.length){
            // calculation here
            sum = sum + arr[end];

            // condition 1
            if(sum<k){
                end++;
            }

            //condition 2
            else if(sum==k){ // this can be our possible ans, so we will store this window somewhere

                // condition a = answer (using calcualtion)
                if(end-start+1>ans){
                    ans = end-start+1;
                }
                //slide the window
                end++;
            }

            //condition 3
            if(sum>k){
                sum = sum - arr[start];
                start++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;

        System.out.println(longestSubArray(arr, k));
    }
}
