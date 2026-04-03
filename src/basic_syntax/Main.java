package basic_syntax;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //在此输入您的代码...
        String string = scan.next().toLowerCase();
        char[] arr = string.toCharArray();
        Arrays.sort(arr); //0 1 21
        for(char a:arr){
            System.out.print(a);
        }
    }
}