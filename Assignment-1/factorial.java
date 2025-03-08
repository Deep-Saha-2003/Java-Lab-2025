// 6) Print factorial of a  given number
public class factorial {
    public static long factorialnumber(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("\nFactorial of " + num + " is: " + fact);
        return fact;
    }
    public static void main(String[] args) {
        factorialnumber(10);
    }
}