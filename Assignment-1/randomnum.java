// 15) To genarate 5 random number between 1 to 100.
public class randomnum {
    public static void fivenumbers() {
        System.out.println("The random 5 numbers between 1 and 100 is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((int) (Math.random() * 100 + 1) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fivenumbers();
    }
}