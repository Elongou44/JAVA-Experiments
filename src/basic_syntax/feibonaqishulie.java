package basic_syntax;

import java.util.Scanner;

public class feibonaqishulie {
    public static int F(int n) {
        if (n <= 1) {
            return n;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("斐波那契数列的第" + n + "项是: " + F(n));
    }
}