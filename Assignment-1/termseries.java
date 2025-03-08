// 9) print the sum of n term series 1/1!+1/2!+1/3!.......
public class termseries {
    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
    public static void totalSeries(int b) {
        double sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += 1.0 / factorial(i); // Add 1/i! to the sum
        }
        System.out.println("Total of Sum of this series 1/1! + 1/2! + ... : " + sum);
    }

    public static void main(String[] args) {
        totalSeries(10);
    }
}