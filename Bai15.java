package chuong1;
import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            sum2 += i;
            sum += 1.0 / sum2;
        }

        System.out.println(sum);
    }
}


