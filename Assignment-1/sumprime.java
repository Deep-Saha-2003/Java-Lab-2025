// 13) check whether a number can be expressed as sum of two prime numbers.
public class sumprime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void checkprime(int a) {
        boolean sum = false;
        for (int i = 2; i <= a / 2; i++) {
            if (isPrime(i) && isPrime(a - i)) {
                sum = true;
                break;
            }
        }
        System.out.println("A number " + a + " can be expressed as sum of two primes: " + (sum ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        checkprime(30);
    }
}