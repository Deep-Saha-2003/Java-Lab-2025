// 14) The given number is palindrome number or not.
public class palindrome {
    public static void checknumber(int a) {
        int original = a, reverse = 0;
        while (a != 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a /= 10;
        }
        System.out.println("Is the number is : " + original + " a palindrome ?? " + (original == reverse ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        checknumber(50);
    }
}