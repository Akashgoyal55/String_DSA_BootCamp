package SlidingWindowMedium;
import java.util.*;
// Here we have been given an array and window size k
// We have to find the first negative number from each subarray of size k
public class firstNegative {
//    public static List<Integer> firstNegativeSubArr(int[] arr, int k){
//        List<Integer> result = new ArrayList<>();
//        int n = arr.length;
//        for(int i=0; i<=n-k; i++){
//            boolean foundNegative = false;
//
//            for (int j=i; j<i+k; j++){
//                if(arr[j]<0){
//                    result.add(arr[j]);
//                    foundNegative = true;
//                    break;
//                }
//            }
//            if(!foundNegative){
//                result.add(0);
//            }
//        }
//        return result;
//    }

    // OPTIMIZE APPROACH
    public static List<Integer> firstNegativeSubArr(int[] arr, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        int start = 0;
        int end = 0;

        while(end<arr.length){
            if(arr[end]<0){  // add current item index if it's negative
                deque.addLast(end);
            }
            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
                // we'll get some answer here
                if(!deque.isEmpty()){
                    result.add(arr[deque.peekFirst()]);
                }else{
                    result.add(0);
                }
            }
            if(!deque.isEmpty() && deque.peekFirst()==start){
                deque.pollFirst();
            }
            start++;
            end++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-8,2,3,-6,1};
        int k = 2;
        System.out.println(firstNegativeSubArr(arr, k));
    }
}
