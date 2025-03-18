package revision;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int temp;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2 , 5 , 3 , 1 , 6 , 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
