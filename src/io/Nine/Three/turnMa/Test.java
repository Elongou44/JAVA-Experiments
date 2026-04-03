package Nine.Three.turnMa;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Test {
    public static void main(String[] args) throws Exception {
                FileInputStream fileInputStream=new FileInputStream("src/Nine/Three/turnMa/gbk_text.txt");
                InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"gbk");
                FileOutputStream fileOutputStream=new FileOutputStream("src/Nine/Three/turnMa/utf8_text.txt");
                OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"utf-8");
                char[] chars=new char[100];
                int len=inputStreamReader.read(chars);
                while (len!=-1){
                    String str=new String(chars,0,len);
                    outputStreamWriter.write(str);
                    len=inputStreamReader.read(chars);
                }
                inputStreamReader.close();
                outputStreamWriter.close();
    }
}
