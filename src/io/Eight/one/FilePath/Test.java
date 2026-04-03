package io.Eight.one.FilePath;
import java.io.File;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入路径");
        Scanner sc = new Scanner(System.in);
        String mypath = sc.nextLine();
        File file = new File(mypath);
        if (file.exists()) {
            Test1(file);
        } else {
            System.out.println("文件或目录不存在");
        }
        sc.close();
    }
    public static void Test1(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getPath());
                    Test1(file); // 递归调用，如果是目录，继续遍历
                }
            }
        }
    }
}