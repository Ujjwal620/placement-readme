package revision;
class Radix{

}
public class Radix_Sort {
    public static void main(String[] args) {
        /*
        Radix Sort -: ( Bucket Sort )
            1. Multi digits
            2. constant length

            int[] arr = { 325 , 236 , 008 , 091 , 007 }

            1's :   091  325  236  007  008

            2's :   007  008  325  236  091

            3's :   007  008  091  236  325

            steps:
                1. find the max
                    max = 325
                2. 0 - 9 (10 buckets)
         */


        /*
            How do we control the number of passes (rounds) (iterations) in the radix sort algorithm ?
            max = 325
            for(int exp = 1 ; max/exp > 1 ; exp *= 10){
                countSort(arr , size , exp ) ;
            }
         */
    }
}
