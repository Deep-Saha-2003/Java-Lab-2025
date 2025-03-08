// Print 8 positive number and also fibonacci numbers
public class number {
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
    public static void fibonaccisequence() {
        System.out.println("The sequence of first 8 primes: ");
        
        int count = 0, num = 2;
        int first = 0, second = 1;

        // Print the first 8 prime numbers
        System.out.print("The Prime numbers are: ");
        while (count < 8) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println("The sequence of first 8 positive primes in present: ");
        count = 0;
        while (count < 8) {
            int next = first + second;
            if (isPrime(next)) {
                System.out.print(next + " ");
                count++;
            }
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fibonaccisequence();
    }
}
