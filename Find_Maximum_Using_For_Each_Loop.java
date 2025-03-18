package revision;

public class Find_Maximum_Using_For_Each_Loop {
    public static int findMax(int[] n){
        int maximum = n[0];
        for (int n1 : n){
            if (n1 > maximum){
                maximum = n1 ;
            }
        }
        return maximum;
    }
    public static void main(String[] args){
        int mark[] = {125, 132, 95, 116, 110};
        int max = findMax(mark);
        System.out.println(max);
    }
}
