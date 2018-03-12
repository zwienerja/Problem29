import java.util.ArrayList;
import java.math.BigInteger;
public class Problem29 {

    public static void main(String [] args) {
        ArrayList<BigInteger> terms = new ArrayList<>();
        BigInteger currentTerm;

        for(int i = 2; i <= 100; i++) {
            for(int k = 2; k <= 100; k++) {
                currentTerm = BigInteger.valueOf(i).pow(k);
                if(!terms.contains(currentTerm))
                    terms.add(currentTerm);
            }
        }
        System.out.println("The number of terms is " + terms.size());
    }
}

