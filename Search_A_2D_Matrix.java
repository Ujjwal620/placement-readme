package revision;
import java.util.* ;
public class Search_A_2D_Matrix {
    public static boolean Search(int[][] arr , int key){
        int row = arr.length;
        if (row == 0) {
            return false ;
        }
        int col = arr[0].length ;


        int low = 0 ;
        int high = (row * col ) - 1 ;
        while(low <= high){
            int mid = low + ( (low + high) / 2 ) ;
            int element = arr[mid/col][mid % col] ;
            if (element == key){
                return true;
            }
            else if(element < key){
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*
            mxn matrix will be given

         */
        Scanner sc = new Scanner(System.in);

        int m , n ;
        System.out.println("Enter M and N value : ");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("enter the input for the matrix : ");
        for (int i=0; i<m ; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("My Matrix : ");
        for (int i=0; i<m ; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        Search_A_2D_Matrix s = new Search_A_2D_Matrix();
        boolean result =  s.Search(matrix , target);
        if (result){
            System.out.println("Target found");
        }
        else {
            System.out.println("Target not found");
        }
    }
}
