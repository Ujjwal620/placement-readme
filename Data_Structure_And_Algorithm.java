package revision;

public class Data_Structure_And_Algorithm {
    // linear --- O(n)
    // Binary --- log(n)
    // Recursive Binary --- log(n)
    // jump search
    // interpolation search

    /*
    sorting  -->
        1. bubble
        2. selection -- swap
        3. insertion -- shift
        4. merge -- n(logn)
        5. quick -- n(logn)
        6. NCA -
                (I)  count sort
                (II) radix sort
     */

    // kadane Algorithm
    // Non Repeating Element --->
        public static void main(String[] args) {
            int[] arr = {1 , 2 , 3 , 4 , 3, 2 , 1 };
            int result = 0 ;
            for (int i =0 ; i< arr.length; i++){
               result = result ^ arr[i];
            }
            System.out.println(result);
        }

    // 450 DSA
}
