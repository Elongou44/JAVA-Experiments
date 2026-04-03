package Eight.three.Zimu;
import java.io.FileReader;
public class Test {
    public static void main(String[] args) throws Exception {
        FileReader fileReader=new FileReader("src/Nine/three/Zimu/bigbook.txt");
        int read = fileReader.read();
        int sum=0;
        while (read!=-1){
            if((char)read=='a'){
                sum++;
            }
            if((char)read=='A'){
                sum++;
            }
            read=fileReader.read();
        }
        fileReader.close();
        System.out.println("文件中字母A或者a的数量"+sum);
    }
}
