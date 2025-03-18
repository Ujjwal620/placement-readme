package revision;
class Draw_Erase{
    void draw(){
        System.out.println("Draw");
    }
    void Erase(){
        System.out.println("Erase");
    }
}
class Squares extends Draw_Erase{
    @Override
    void draw() {
        System.out.println("Draw Square.");
    }

    @Override
    void Erase() {
        System.out.println("Erase square.");
    }
}
class Triangles extends Draw_Erase{
    @Override
    void draw() {
        System.out.println("Draw Triangle.");
    }

    @Override
    void Erase() {
        System.out.println("Erase Triangle.");
    }
}
public class Shape_Draw_Erase {
    public static void main(String[] args) {
        Draw_Erase d = new Draw_Erase();
        d.draw();
        d.Erase();

        Triangles t = new Triangles();
        t.Erase();
        t.draw();

        Squares s = new Squares();
        s.draw();
        s.Erase();
    }
}
