package Easy;

public class mostRepeatArrNo {
    // method to find the most repeating number in the array
    public static int mostRepeat(int[] arr){
        int maxCount = 0; // initially
        int maxNumber = 0;

        for(int i=0; i<arr.length; i++) {
            int count = 0;

            for (int j=0; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if(count > maxCount) {
                maxCount = count;
                maxNumber = arr[i];
            }
        }
        return maxNumber;

    }



    public static void main(String[] args) {
        int[] arr = {2,5,6,6,5,8,9,8,9,8};
        System.out.println("The most repeated number in the aray is " + mostRepeat(arr));

    }
}
