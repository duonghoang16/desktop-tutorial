package chuong1;
import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        double sum = 1;
        int power = 1;
        int factorial = 1;

        for (int i = 1; i <= 2 * n; i++) {
            power *= x;
            factorial *= i;

            if (i % 2 == 0) {
                sum += (double) power / factorial;
            }
        }

        System.out.println(sum);
    }
}

