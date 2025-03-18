package revision;

import java.util.Arrays;

public class Insertion_Sort {
    public static void Sort(int[] arr){
        for (int i=1 ; i<arr.length ; i++){
            int temp = arr[i] ;
            int j = i - 1 ;
            while(j>= 0 && arr[j] > temp){
                // shift operation
                arr[j+1] = arr[j] ;
                j-- ;
            }
            arr[j+1] = temp ;
        }
    }
    public static void main(String[] args) {
        /*
            8  5  2  9  6  1
            5  8  2  9  6  1
            2  5  8  9  6  1
            2  5  6  8  9  1
            1  2  5  6  8  9
         */
        int[] arr = {8 , 5 , 2 , 9 , 6 , 1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
