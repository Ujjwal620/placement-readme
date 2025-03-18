package revision;
class FormulaSquare{
    double side;
    FormulaSquare(double s){
        this.side=s;
    }
    double AreaOfSquare(){
        return side*side;
    }
    double PerimeterOfSquare(){
        return 4*side;
    }
    double DiameterOfSquare(){
        return side*Math.sqrt(2) ;
    }
}
public class Square_Formula {
    public static void main(String[] args) {
        FormulaSquare f = new FormulaSquare(16);
        System.out.println("Area is : "+ f.AreaOfSquare());
        System.out.println("Perimeter is : "+ f.PerimeterOfSquare());
        System.out.println("Diameter is : "+ f.DiameterOfSquare());
    }
}
