// 2) print primes from 1 - 1000.
public class prime {
    public static void main(String[] args) {
        System.out.println("\nprint Prime numbers from 1 to 1000:");
        for (int a = 2; a <= 1000; a++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(a + " ");
            }
        }
    }
}