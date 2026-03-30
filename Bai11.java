package chuong1;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }

        System.out.println(sum);
    }
}