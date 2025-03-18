package revision;
class Pattren_Pattern9{
    void Col(int coll){
        int i, j ;
        for (i=1; i<=3; i++){
            for (j=1; j<=coll; j++){
                if ((i+j)%4==0 || (i==2 && j%4==0)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
public class self {
    public static void main(String[] args) {
        Pattren_Pattern9 p = new Pattren_Pattern9();
        p.Col(25);
    }
}
