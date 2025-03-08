// 16) To find sum of all integers greater then 100 and less than 200 that are divisible by 7.
public class integernum {
    public static void integersumdivisible() {
        int numsum = 0;
        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                numsum += i;
            }
        }
        System.out.println("The Sum of all integers greater than 100 and less than 200 divisible by 7 is: " + numsum);
    }
    public static void main(String[] args) {
        integersumdivisible();
    }
}
