// 10) Display alphabets (A-Z) using loop.
public class alphabets {
    public static void printalphabets() {
        System.out.println("The alphabets from ( A to Z ) is :");
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printalphabets();
    }
}