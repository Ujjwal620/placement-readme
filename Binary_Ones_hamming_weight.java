package revision;
class HammingWeight{
    int Hamming(int n){
        int count = 0 ;
        while(n > 0){
            if ((n & 1) == 1){
                count++ ;
            }
            n = n >> 1 ;
        }
        return count ;
    }
}
public class Binary_Ones_hamming_weight {
    public static void main(String[] args) {
        HammingWeight h = new HammingWeight();
        System.out.println(h.Hamming(15));
    }
}
