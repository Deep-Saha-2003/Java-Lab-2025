// 7) print sequence 2,1,4,2,6,6,8,24,10
public class printsequence {
    public static void limitsequence(int seq) {
        System.out.println("The Sequenc is" + seq + ":");
        int fact = 1;
        for (int i = 1; i <= seq; i++) {
            if (i % 2 == 0) {
                fact *= i;
                System.out.print(i + "," + fact + " ");
            } else {
                System.out.print(i + "," + fact + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        limitsequence(10);
    }
}