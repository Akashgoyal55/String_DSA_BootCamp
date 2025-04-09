package SlidingWindow;
import java.util.*;
/*
* We have been given an array and a window size k
* We have to find the first negative number from each of the subarray
 */
public class firstNegativeSubarr {

    static List<Integer> firstNegatives(int[] arr, int k){
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        int start = 0;
        int end = 0;
        while(end<arr.length){

            // calculation
            if(arr[end]<0){
                queue.add(arr[end]);
            }

            if(end-start+1<k){
                end++; // to hit the window size
            }else if(end-start+1==k){
                result.add(queue.peek());

                queue.remove();

                start++;
                end++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        System.out.println("The first negative number of each subarray is: " + firstNegatives(arr, k));

    }
}
