// 1) print first 10 numbers in fibonacci sequence.
public class fibo {

    public static void fibonacci () {
        int a = 10;
        int first = 0, second = 1, next, sum = first + second;
        System.out.print("First 10 number in fibonacci : ");
        System.out.print(first + " " + second + " ");
        
        for (int i = 3; i <= a; i++) {
            next = first + second;
            System.out.print(next + " ");
            sum += next;
            first = second;
            second = next;
        }
        System.out.println("Total of first 10 Fibonacci numbers: " + sum);
    }
    public static void main(String[] args) {
        fibonacci ();
    }
}