package chuong1;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        double sum = 0;
        int power = 1;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            power *= x;
            factorial *= i;
            sum += (double) power / factorial;
        }

        System.out.println(sum);
    }
}
