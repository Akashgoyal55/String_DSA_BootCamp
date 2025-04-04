package SlidingWindow;
/*
* Whenever in the question an array/string is given and asked to find the subarray/substring
* In that case we just have to use the concept of sliding window
* Q) We have been given an array and a window size, we have to find the maximum out of those windows sum
 */
public class Main {

    static int findSum(int[] arr, int k) {
        int start = 0; // we need two pointers to create a window both starts from index 0
        int end = 0;
        int currSum = 0; //need to keep track of the sum we get
        int maxSum = 0;

        while (end < arr.length) {

            currSum = currSum + arr[end];

            if (end - start + 1 < k) {
                end++;  // need to hit the window size so move forward
            } else if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, currSum);

                currSum = currSum - arr[start];  // remove the first element and move window forward
                start++;
                end++;
            }

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,9,12};
        int k = 3;
        System.out.println("The maximum sum of the subArray of window size " + k + " is" + findSum(arr,k));
    }
}
