package revision;
class Square_Root_Binary{
    int binary_Search(int n){
        int s = 0 ;
        int e = n ;
        int ans = -1 ;
        while(s <= e){
            int mid = s + (e-s)/2 ;
            int square = mid * mid ;
            if (square == n){
                return mid ;
            }
            else if(square < n){
                ans = mid ;
                s = mid + 1 ;
            }
            else {
                e = mid - 1 ;
            }
        }
        return ans ;
    }
}
public class DSA_Search {
    public static void main(String[] args) {
        /*
            binary search                                   - 30 %
            recursion + backTracking + dynamic programming  - 20 %
            arrays + string + search + sort + algorithms    - 20 %
            tree + graph + heap + tries                     - 20 %
            bit making + greedy + special algorithm         - 10 %
         */

        /*
            Binary Search :-
                * square root (integral part) of a number using binary search
         */
        Square_Root_Binary s = new Square_Root_Binary();
        int v = s.binary_Search(35);
        System.out.println("Square Root = "+ v);

    }
}
