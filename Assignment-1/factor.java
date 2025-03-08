// 12) Display factor of a number.
public class factor {
    public static void factorsnumber (int number) {
        System.out.println("The Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        factorsnumber(10);
    }
}