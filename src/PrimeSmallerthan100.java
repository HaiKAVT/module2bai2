import java.util.Scanner;

public class PrimeSmallerthan100 {
    public static void main(String[] args) {
        System.out.println("in ra các số nguyên tố nhỏ hơn 100");
        int N = 2;
        for (int j = 1; j < 100; j++) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}

