package chuong1;

import java.util.Scanner;

public class Bai2 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập n: ");
    int n = sc.nextInt();

    int S = 0;
    for (int i = 1; i <= n; i++) {
        S = S + i * i;
    }

    System.out.println("S = " + S);
}
}
