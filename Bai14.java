package chuong1;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int power = x;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += power;
            power *= x * x;
        }

        System.out.println(sum);
    }
}
