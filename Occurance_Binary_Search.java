package revision;
class Occurance{
    int First_Occurence(int[] arr, int n , int key){
        int s = 0 ;
        int e = n-1 ;
        int ans = -1 ;
        while(s <= e){
            int mid = s + (e - s)/2 ;
            if (arr[mid] == key){
                ans = mid ;
                e = mid - 1;

            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else {
                e = mid - 1 ;
            }
        }
        return ans ;
    }
    int Last_Occurence(int[] arr, int n, int key){
        int s = 0 ;
        int e = n-1 ;
        int ans = -1 ;
        while(s <= e){
            int mid = s + ( e - s)/2 ;
            if (arr[mid] == key){
                ans = mid ;
                s = mid + 1 ;
            }
            else if (arr[mid] < key){
                s = mid + 1 ;
            }
            else {
                e = mid - 1 ;
            }
        }
        return ans ;
    }
    int Total_Occurrence(int[] arr, int n , int key){
        int first = First_Occurence(arr , n , key );
        int second = Last_Occurence(arr ,  n , key );
        return second-first+1 ;
    }
}
public class Occurance_Binary_Search {
    public static void main(String[] args) {
        /*
            First Occurrence / Last Occurrence / Total Number Of Occurrence of an element in an array  - log(N)

            int arr = { 1 , 2 ,3 , 1 , 2 ,3 , 1 , 2 , 3}

            arr[mid] == key
            ans = mid
            s = mid + 1
            e = mid - 1

            arr[mid] < key
            s = mid + 1

            arr[mid] > key
            e = mid - 1
         */
        Occurance o = new Occurance();
        int[] arr = { 1 , 1 , 1 , 2 , 3 , 4 , 5 ,5 , 5 ,5 , 5 , 5 , 5 , 5 , 6 };
        /*
            Binary Search used in sorted array .
         */
        int u = o.First_Occurence(arr , arr.length , 5);
        int v = o.Last_Occurence(arr , arr.length, 5);
        int w = o.Total_Occurrence(arr , arr.length, 5);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
    }
}
