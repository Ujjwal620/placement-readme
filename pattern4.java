package revision;

public class pattern4 {
    public static void main(String[] args) {
        for (int i=0; i<4; i++) {
            for (int j = i; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
