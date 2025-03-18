package revision;

import java.util.Arrays;
class sortArray{
    void sort(int arr[], int n){

            int n0=0;
            int n1=0;
            int n2=0;
            for (int i=0;i<n;++i)
            {
                if(arr[i]==0){
                    n0++;
                }
                else if(arr[i]==1) {
                    n1++;
                }
                else{
                    n2++;
                }
            }
            int index=0;
            while(n0>0){
                arr[index++]=0;
                n0--;
            }
            while(n1>0){
                arr[index++]=0;
                n1--;
            }
            while(n2>0){
                arr[index++]=0;
                n2--;
            }
    }
}

public class sorting_array_plac {
    public static void main(String[] args) {
        /*
        booble sort
        -----------------------------------------
        int arr[] = {2 , 1 , 0 , 1 , 2, 1 , 0};
        int temp ;
        for(int i=0; i<arr.length ; i++){
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted : ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
         */

        // Merge Sort --->

        /*
            int arr[] = { 2 , 1 , 0 , 1 , 2 , 1 , 0 };
            Arrays.sort(arr); // Merge sort
            System.out.println(Arrays.toString(arr));
         */

        // without any algorithm
        int[] arr = {2, 1 , 0 , 1 , 2 , 1 , 0};
        sortArray s = new sortArray();
        s.sort(arr, arr.length);
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
