package revision;
class Boxes{
    double w, h, d ;
    Boxes(double w1, double h1, double d1){
        w = w1 ;
        h = h1 ;
        d = d1 ;
    }
    Boxes(){
        w = -1 ;
        h = -1 ;
        d = -1 ;
    }
    Boxes(double len){
        w = h = d = len ;
    }
    double volume(){
        return  w * h * d ;
    }
}
public class OverloadConstructor {
    public static void main(String[] args) {
        Boxes b1 = new Boxes();
        Boxes b2 = new Boxes(2.0) ;
        Boxes b3 = new Boxes(2.0, 3.0, 4.0) ;
        System.out.println("for b1 volume is : "+ b1.volume());
        System.out.println("for b2 volume is : "+ b2.volume());
        System.out.println("for b3 volume is : "+ b3.volume());
    }
}
