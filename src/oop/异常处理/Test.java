package 异常处理;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入被除数：");
        int bcs=sc.nextInt();
        System.out.println("请输入被除数：");
        int cs=sc.nextInt();
        try {
            program(bcs,cs);
        } catch (Exception e) {
            System.out.println("发生了一个算数异常：除数不能为0");
        }
    }
    public static void program (int a,int b){
        try {
            int shang=a/b;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
