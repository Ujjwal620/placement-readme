package revision;
import java.util.Scanner;
public class Menu_Using_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.println("Enter your choice -->");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("You have choosen option 1. ");
                    break ;
                case 2 :
                    System.out.println("You have choosen option 2. ");
                    break ;
                case 3 :
                    System.out.println("You have choosen option 3. ");
                    break ;
                case 4 :
                    System.out.println("Exiting the program..... ");
                    break ;
                default:
                    System.out.println("Invalid entry ! Please try again !");
            }
        }while(choice != 4) ;
    }
}
