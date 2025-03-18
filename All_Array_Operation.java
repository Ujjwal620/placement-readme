package revision;
import java.util.Scanner;
public class All_Array_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array : ");
        int[] arr = new int[size];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse of the Array : ");
        for (int i=arr.length - 1 ; i>=0; i--){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\n--------------------------\n");
        System.out.println("Sum of the array");
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i] ;
        }
        System.out.println("sum : "+ sum);
        System.out.println("----------------------------\n");
        System.out.println("Index of all elements : ");
        for (int i=0; i< arr.length; i++){
            System.out.println(i + ".  "+ arr[i]);
        }
        System.out.println("------------------------\n");
        System.out.println("maximum number in the array : ");
        int max = 0 ;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i] ;
            }
        }
        System.out.println("Maximum Number is : "+ max);
        System.out.println("-------------------------\n");
        System.out.println("Minimum number in the array : ");
        int min = arr[0] ;
        for (int i=0; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Number is : "+ min);
        System.out.println("------------------------------\n");
        System.out.println("Sorting the elements : ");
        int temp ;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
        }
        System.out.println("sorted Array :");
        for (int i =0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
