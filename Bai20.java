package chuong1;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        double sum = 0;
        int power = 1;
        int factorial = 1;

        for (int i = 1; i <= 2 * n + 1; i++) {
            power *= x;
            factorial *= i;

            if (i % 2 == 1) {
                sum += (double) power / factorial;
            }
        }

        System.out.println(sum);
    }
}
