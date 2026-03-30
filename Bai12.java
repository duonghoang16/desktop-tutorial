package chuong1;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int power = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            power *= x;
            sum += power;
        }

        System.out.println(sum);
    }
}
