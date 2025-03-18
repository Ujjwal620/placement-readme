package revision;

import java.util.Scanner ;

public class MarksCalculation {
    public static void main(String[] args) {
        System.out.println("Sum of the marks is : ");
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter number of subjects : ");
        int n = sc.nextInt();
        int sub[] = new int[n];
        System.out.println("Enter marks of All the subjects : ");
        for (int i =0; i<n ; i++){
            sub[i] = sc.nextInt();
        }
        System.out.println("Marks of all subjects :\n ");
        for (int i =0 ; i < n ; i++){
            System.out.println(sub[i]);
        }
        System.out.println("Total marks : ");
        int total = 0 ;
        for (int i = 0 ; i < n ; i++){
            total = total + sub[i] ;
        }
        System.out.println("Total marks is : "+ total);
        System.out.println("Percentage = "+ ( total / 5) +"%");

    }
}

/*
import java.util.Scanner;
class MarksCalculation
{
    public static void main(String[] args)
    {
// System.out.println("Sum Of The Marks Is : ");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter ");
        String enter = sc.nextLine();
        System.out.println("Enter the marks of math :");
        double math = sc.nextDouble();
        System.out.println("Enter the marks of Science :");
        int science = sc.nextInt();
        System.out.println("Enter the marks of Social Science :");
        int social_science = sc.nextInt();
        System.out.println("Enter the marks of Hindi :");
        int hindi = sc.nextInt();
        System.out.println("Enter the marks of English :");
        int english = sc.nextInt();
        double Total = math + science + social_science + hindi + english ;
        System.out.println("Total marks is : " + Total);
        double percentage = Total / 5 ;
        System.out.println("Percentage :" + percentage +"%");
    }
}

 */