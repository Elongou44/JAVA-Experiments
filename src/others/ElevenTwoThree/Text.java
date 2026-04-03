package ElevenTwoThree;

public class Text {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new MyThread(),"t1");
        Thread t2=new Thread(new MyThread(),"t2");
        Thread t3=new Thread(new MyThread(),"t3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        synchronized ("1") {
            for (int i = 1; i <=4; i++) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程"+Thread.currentThread().getName()+i);
            }
        }
    }
}