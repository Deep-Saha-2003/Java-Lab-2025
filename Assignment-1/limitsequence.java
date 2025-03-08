// 4) Print the sequence - 0,2,1,4,1,8,2,16.......
public class limitsequence {
    public static void limitsequence(int limit) {
        System.out.println("\nSequence up to limit " + limit + ":");
        for (int i = 0, a = 0; a <= limit; i++, a = (int) Math.pow(2, i)) {
            System.out.print(i + "," + a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        limitsequence(30);
    }
}