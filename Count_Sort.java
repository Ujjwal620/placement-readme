package revision;
class Count{
    void sort(int arr[], int size){
        int k = arr[0] ;
        for (int i=1 ; i < size; i++){
            if (arr[i] > k){
                k = arr[i] ;
            }
        }
        // create a count array 0 to max (0 to 9) 10 elements
        int[] count = new int[10];
        for (int i =0 ; i< 10 ; i++){
            count[i] = 0 ;
        }

        // Calculate the frequency for each element
        for (int i = 0 ; i < size ; i++){
            count[arr[i]]++ ;
        }

        // sajin = index 0 (skip) start from 1 till max
        for (int i = 1 ; i <=k ; i++){
            count[i]+= count[i-1];
        }

        // Create a Output array
        int output[] = new int[size];

        // start from the end of the array (right to left)
        for (int i = size-1 ; i >= 0 ; i--){
            output[--count[arr[i]]] = arr[i];
        }

        // copy the output back to the input
        for (int i = 0 ; i < size ; i++){
            arr[i] = output[i];
        }

    }
}
public class Count_Sort {
    public static void main(String[] args) {
        /*
            Count Sort Algorithm
            ----------------------
            { 3 , 1 , 3 , 2 , 1 , 4 , 6 , 4 , 3 }
            non - compare algorithm

            * single digit
            * whole number 0 to 9

            steps :
                1. find the max = 6
                2. create a count array 0 to max
                   Array element - frequency
                    0            - 0
                    1            - 2
                    2            - 1
                    3            - 3
                    4            - 2
                    5            - 0
                    6            - 1
                3. Calculate the frequency of each element
                4. Cumulative Count (add all frequency and it should be equal to length of the array.)
                            0  2  3  6  8  8  9
                    index:  0  1  2  3  4  5  6

                5. O/P array
                6. start from Right to Left
         */
        int[] arr = {3 , 1 , 3, 2 , 1 , 4 , 6 , 4 , 3};
        System.out.println("Before Sort : ");
        for (int i=0 ; i< arr.length ; ++i){
            System.out.print(arr[i]+"  ");
        }

        Count c = new Count();
        c.sort(arr , arr.length);

        System.out.println("\nAfter Sort :");
        for (int i= 0; i < arr.length ; ++i){
            System.out.print(arr[i]+"  ");
        }
    }
}
