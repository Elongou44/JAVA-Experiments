package Eight.twe.Inout;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Test {
    public static void main(String[] args) throws Exception {
        FileOutputStream out=new FileOutputStream("src/Nine/twe/Inout/prime.dat");
        for (int i = 1; i <= 100; i++) {
            if (Number(i)){
                out.write(i);
            }
        }
        out.close();
        FileInputStream input=new FileInputStream("src/Nine/twe/Inout/prime.dat");
        int i=input.read();
        while (i!=-1){
            System.out.print(i+" ");
            i=input.read();
        }
        input.close();
    }
    public static boolean Number(int number){
        if (number <= 1) {
            return false; // 1不是素数
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // 如果number能被i整除，则不是素数
            }
        }
        return true;
    }
}
