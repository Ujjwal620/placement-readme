package revision;
class Shape{
    public void Triangle(){
        System.out.println("This is Triangle.");
    }
    public void Square(){
        System.out.println("This is square.");
    }
    public void Rectangle(){
        System.out.println("This is Rectangle.");
    }
}
public class Shapes {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.Rectangle();
        s.Square();
        s.Triangle();
    }
}
