package revision;
import java.util.* ;
public class Find_Prime_Using_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime ;
        int num = sc.nextInt();
        if (num < 2)
            isPrime = false ;
        else
            isPrime = true ;
        for (int i=2 ; i<=(num / i); i++){
            if (num % i == 0)
                isPrime = false ;
                break;
        }
        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is not a Prime Number.");
    }
}
