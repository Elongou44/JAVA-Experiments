package basic_syntax;

import java.util.Random;
import java.util.Scanner;

public class dianmingsuiji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] name = new String[5];
        for (int i = 0; i < 5; i++)
            name[i] = sc.nextLine();
        int number = random.nextInt(5);
        System.out.println("随机了第"+(number+1)+"位学生"+name[number]);
    }
}
