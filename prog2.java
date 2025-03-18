package revision;

public class prog2 {
    public static void main(String[] args) {
        int i, j ;
        for (i = 0; i<=5; i++){
            for (j=0; j<=6 ; j++){

                if (i==5 && j%3!=0 || i==4 && j%3==0 || j-i==3 || i+j==3){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
        for(i=0; i<=5; i++){
            for (j=0; j<=6; j++){
                if (i==0 & j%3!=0  || i==1 && j%3==0 || i-j==2 || i+j == 8){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
