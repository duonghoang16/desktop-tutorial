package chuong1;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        double sum = 0;
        int power = 1;
        int sum2 = 1;

        for (int i = 1; i <= n; i++) {
            power *= x;
            sum2 += power;
            sum += (double) power / sum2;
        }

        System.out.println(sum);
    }
}
