import java.util.Scanner;

public class Ex02 {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SC.nextInt();
        n = calcTribonacci(n);
        System.out.println(n);
    }

    public static int calcTribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return calcTribonacci(n-1) + calcTribonacci(n-2) + calcTribonacci(n-3);
        }
    }
}
