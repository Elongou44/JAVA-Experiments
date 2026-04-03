package basic-syntax;

import java.util.Random;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int r=random.nextInt(100)+1;
        System.out.println("前排提示，本次随机数为："+r);
        System.out.println("猜一个1到100之间的数字");
        while(true){
            String input=sc.nextLine();
            try {
                int inputTurn=Integer.parseInt(input);
                if(inputTurn<1||inputTurn>100){
                    System.out.println("输入的数字不在1到100之间，请重新输入");
                }
                else{
                    if(inputTurn>r){
                        System.out.println("太大了，再试一次");
                    } else if (inputTurn<r) {
                        System.out.println("太小了，再试一次");
                    }else{
                        System.out.println("恭喜你，猜对了！");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个有效的数字，请重新输入：");
            }
        }
    }
}
