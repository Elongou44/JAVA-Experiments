package multithreading.TenTwoThread;
public class Test {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        MyThread2 myThread2=new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}
class MyThread1 extends Thread{
    double sum=0;
    @Override
    public void run() {
        for (int i = 1; i <=10000 ; i++) {
            sum=sum+i;
        }
        System.out.println(String.format("%.1f",sum));
    }
}
class MyThread2 extends Thread{
    double sum=1;
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            sum=sum*i;
        }
        System.out.println(sum);
    }
}