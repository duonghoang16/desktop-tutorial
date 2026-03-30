package chuong1;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int t = 1;

        for (int i = 1; i <= n; i++) {
            t *= x;
        }

        System.out.println(t);
    }
}

