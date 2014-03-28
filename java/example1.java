import java.util.ArrayList;
/**
 * Write a program to determine all pairs of positive integers (a,b)
 * such that a < b < 1000 and (a^2+b^2+1)/(ab) is an Integer.
 */
public class example1 {
    public static void main(String[] args) {
        ArrayList result = new ArrayList();

        // Loop through all possible values of b < 1000
        for(int b = 0; b < 1000; b++) {
            // Loop through all possible values of a < b
            for(int a = 0; a < b; a++) {
                // Calculate the result of (a^2 + b^2 + 1)/(ab)
                double calculatedResult = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a * b);
                // Cast the result to an Integer and check if they are equivalent
                if (calculatedResult == (int)calculatedResult) {
                    result.add("[" + a + "," + b + "]");
                }
            }
        }

        System.out.println("Result: " + result);
    }
}
