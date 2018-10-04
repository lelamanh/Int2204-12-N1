/*
    class FindMinOfArray

 */

public class FindMinOfArray {

    /*
        method findMinOfArray
        @param arr [] int

        return value int min of array
     */

    public static int findMinOfArray(int [] arr){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
