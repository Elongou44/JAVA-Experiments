package ElevenOneDaoJiShi;

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        CountdownThread countdownThread=new CountdownThread(lock);
        PrintThread printThread=new PrintThread(lock);
        System.out.println("开始10秒倒计时");

        printThread.start();
        countdownThread.start();
    }
}
class CountdownThread extends Thread{
    public final Object lock;
    public CountdownThread(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 10; i >=1 ; i--) {
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            lock.notifyAll();
        }
    }
}
class PrintThread extends Thread{
    public final Object lock;
    public PrintThread(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("倒计时结束");
        }
    }
}