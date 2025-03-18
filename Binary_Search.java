package revision;
class Binary{
    int search(int[] arr, int n, int key){
        int s = 0;
        int e = n-1 ;
        while(s <= e){
            int mid = (s + e)/ 2 ;
            if (arr[mid]==key){
                return mid;
            }
            else if (arr[mid] < key) {
                s = mid + 1 ;
            }
            else {
                e = mid - 1;
            }
        }
        return -1 ;
    }
}
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr= { 2 , 4 , 6 , 7 , 9 , 13} ;
        Binary b = new Binary();

        System.out.println("Array Index : "+b.search(arr , 6 , 9));
    }
}
