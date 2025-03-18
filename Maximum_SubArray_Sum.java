package revision;

public class Maximum_SubArray_Sum {
    public static int KadaneAlgo(int[] arr){
        int cmax = arr[0];
        int gmax = arr[0] ;
        for (int i=1 ; i < arr.length ; i++){
            cmax = Math.max(arr[i] , cmax+arr[i]);
            gmax = Math.max(cmax , gmax);
        }
        return gmax;
    }
    public static void main(String[] args) {
        /*
            Kadane's Algorithm
            -----------------------------------------
            int[] arr = { 5 , -8 , 1 , 2 , -1 , 4 } ;

            cmax = arr[0] = 5
            gmax = arr[0] = 5
            currentMax = max(arr[i] , cmax+arr[i])
            globalMax  = max(cmax , gmax)
         */

        // C++ Code
        /*
            #include<iostream>
            using namespace std ;
            int KadaneAlgo(int arr[], int size){
                int cmax = arr[0] ;
                int gmax = arr[0] ;
                for(int i=1 ; i<size ; ++i){
                    cmax = max(arr[i] , cmax+arr[i]);
                    gmax = max(cmax , gmax);
                }
                return gmax;
            }

            int main(){
                int arr[] = { 5 , -8 , 1 , 2 , -1 , 4 };
                int size = sizeof(arr)/ sizeof(arr[0]);
                int maxsum = KadaneAlgo(arr , size);
                cout << maxsum << endl ;
                return 0;
            }
         */

        // java Code :-

        int[] arr = { 5 , -8 , 1 , 2 , -1 , 4 } ;
        int maxsum = KadaneAlgo(arr);
        System.out.println("Max Sum is : "+ maxsum);
    }
}