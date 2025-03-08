// 5) print given limit  0,-1,1,-4,1,8.........
public class sequence {
    public static void numbersequence(int numlimit) {
        System.out.println(" The Sequence of given limit " + numlimit + ":");
        for (int i = 0, a = 0; i <= numlimit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "," + (a) + " ");
            } else {
                System.out.print(i + "," + (a += i) + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        numbersequence(30);
    }
}
