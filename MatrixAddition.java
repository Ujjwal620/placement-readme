package revision;
import java.util.Scanner ;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Row of the matrix ");
        int row = sc.nextInt();
        System.out.println("Enter column of the matrix ");
        int column = sc.nextInt();
        int[][] matrix1 = new int[row][column] ;
        int[][] matrix2 = new int[row][column] ;
        int[][] result = new int[row][column] ;
        System.out.println("Enter the elements of the matrix 1 : ");
        for (int i = 0; i < row ; i++){
            for (int j =0 ; j< column; j++){
                matrix1[i][j] = sc.nextInt() ;
            }
        }
        System.out.println("Matrix 1 is : ");
        for (int i = 0; i < row ; i++){
            for (int j =0 ; j< column; j++){
                System.out.print(matrix1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Enter the elements of the matrix 2 : ");
        for (int i = 0; i < row ; i++){
            for (int j =0 ; j< column; j++){
                matrix2[i][j] = sc.nextInt() ;
            }
        }
        System.out.println("matrix 2 is : ");
        for (int i = 0; i < row ; i++){
            for (int j =0 ; j< column; j++){
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Addition of two matrices : ");
        for (int i = 0; i < row ; i++){
            for (int j =0 ; j< column; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j] ;
            }
        }
        System.out.println("Result  : ");
        for (int i = 0; i < row ; i++){
            for (int j =0 ; j< column; j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
