package TenOneRun;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个数");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        Add add=new Add(a,b);
        Thread addAction = new Thread(add);
        addAction.start();
        Multiplication multiplication=new Multiplication(a,b);
        Thread  multiplicationAction= new Thread(multiplication);
        multiplicationAction.start();
    }
}
class Add implements Runnable{
    double a;
    double b;
    public Add(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(a+"+"+b+"="+(a+b));
        }
    }
}
class Multiplication implements Runnable{
    double a;
    double b;
    public Multiplication(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(a+"*"+b+"="+(a*b));
        }
    }
}