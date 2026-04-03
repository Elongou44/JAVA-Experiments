package io.Nine.Two.printSteam;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("src/Ten/Two/printSteam/文本.txt");
        ps.println("美国有香蕉，中国有削苹果核!");
        ps.println("这是使用Java打印流输出到文件的文本。");
    }
}
