package revision;
class Factorial{
    int fact(int i){
        if (i==0 || i==1){
            return 1;
        }
        else
            return fact(i-1)*i ;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact(4));
    }
}
