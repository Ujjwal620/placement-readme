package revision;

public class pattern_1_using_array {
    public static void main(String[] args) {
        int two2[][]=new int [4][5];
        int k = 0;
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                two2[i][j] = k ;
                k++;
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                System.out.print(two2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
