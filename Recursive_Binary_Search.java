package revision;
class Recursive{
    int Binary_Sea(int[] arr, int n , int s, int e, int key){
        // Edeg case -> Start is always less than or equal to end
        if (s <= e){
            int mid = s + (e - s)/2 ;
            if (arr[mid] == key){
                return mid ;
            }
            else if (arr[mid] < key){
                return Binary_Sea(arr, n , mid+1, e, key);
            }
            else {
                return Binary_Sea(arr, n , s , mid-1, key);
            }
        }
        return -1;
    }
}
public class Recursive_Binary_Search {
    public static void main(String[] args) {
        /*
            In binary search which are the values that keep changing during the execution of the algorithm !

            the start & end value keep changing

            therefore we can apply recursion to search for the key

            n * log(n)

         */
        Recursive r = new Recursive();
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
        int v = r.Binary_Sea(arr , arr.length, 0 , arr.length-1 , 6) ;
        System.out.println(v);
    }
}
