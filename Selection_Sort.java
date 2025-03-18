package revision;

import java.util.Arrays;

public class Selection_Sort {
    public static void Sort(int[] arr,int n){
        for (int i=0; i<arr.length-1; i++){
            int min = i ;
            for (int j=i+1; j<arr.length; j++){

                if (arr[j] < arr[min]){
                    min = j ;
                }
                if (min != i){
                    int temp = arr[i] ;
                    arr[i] = arr[min] ;
                    arr[min] = temp ;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1 , 3 , 6 , 2 , 9 , 5};
        Sort(arr , arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
