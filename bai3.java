package chuong1;
import java.util.Scanner;

public class Bai3 { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập n: ");
    int n = sc.nextInt();

    double S = 0;
    for (int i = 1; i <= n; i++) {
        S = S + 1.0 / i;

}
    System.out.println("S = " + S);
}
}