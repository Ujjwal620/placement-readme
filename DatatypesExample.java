package revision;

import java.util.*;
class printa{
    int alll , blll, clll;
    printa(int a, int b , int c){
        this.alll = a;
        this.blll = b;
        this.clll = c ;
    }
    printa(int a, int b){
        a = alll;
        b = blll;

    }
    int Perimeter(){
        return alll +blll +clll ;
    }
    int Perimeter(int a, int b){
        return a+b ;
    }

}
class DatatypesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        printa a = new printa(x , y , z);
        System.out.println(a.Perimeter());


    }
}
