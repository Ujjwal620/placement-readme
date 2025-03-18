package revision;

public class Pattern9_plac {
    public static void main(String[] args) {
        int i, j ;
        for (i=0; i<3; i++){
            for (j=0; j<13; j++){
                if (i+j==2 || j-i==2 ||j+i==6 || j-i==6 || i+j==10 || j-i==10){
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