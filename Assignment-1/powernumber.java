// 11) To calculate the power of a number
public class powernumber {
    public static void calculate(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + "The power of number " + exponent + " is: " + result);
    }
    public static void main(String[] args) {
        calculate(10,11);
    }
}