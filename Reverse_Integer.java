package revision;
class Reverse{
    int num = 0 ;

    int rev(int n){
        while (n != 0){
            int digit = n % 10 ;
            num = num * 10 + digit ;
            n = n/10 ;
        }

        return num ;
    }
}
public class Reverse_Integer {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        System.out.println(r.rev(120));
    }
}
