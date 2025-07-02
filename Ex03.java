import java.util.Scanner;

public class Ex03 {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SC.nextInt();
        n = calcPell(n);
        System.out.println(n);
    }

    public static int calcPell(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return 2*calcPell(n-1) + calcPell(n-2);
        }
    }
}
