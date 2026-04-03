package oop.自定义异常;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student stu=new Student();
        System.out.print("请输入学生姓名: ");
        String name = sc.nextLine();
        stu.setName(name);
        while(true){
            try {
                System.out.print("请输入学生年龄: ");
                int age = Integer.parseInt(sc.nextLine());
                stu.setAge(age);
                break;
            }
            catch (AgeOutOfRange e){
                System.out.println("年龄范围有误，需要15~45之间的年龄");
            }
            catch(NumberFormatException e){
                System.out.println("年龄输入不符合规范");
            }
        }
        while (true){
            try {
                System.out.print("请输入学生手机号码: ");
                String phoneNumber = sc.nextLine();
                stu.setPhoneNumber(phoneNumber);
                break;
            }
            catch(NumOutOfRange e){
                System.out.println("手机号码必须是长度为11位的数字");
            }
        }
        System.out.println(stu.toString());
    }
}
class Student{
    private String name;
    private int age;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws AgeOutOfRange{
        if(age<=15||age>=45){
            throw new AgeOutOfRange("年龄范围有误，需要15~45之间的年龄");
        }
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) throws NumOutOfRange{
        if (phoneNumber.length() != 11 || !phoneNumber.matches("\\d+")) {
            throw new NumOutOfRange("手机号码必须是长度为11位的数字");
        }
        this.phoneNumber = phoneNumber;
    }
    public String toString() {
        return "Student{name="+name+",age="+age+",phone="+phoneNumber+"}";
    }
}
class AgeOutOfRange extends Exception{
    public AgeOutOfRange() {
        super();
    }
    public AgeOutOfRange(String message) {
        super(message);
    }
}
class NumOutOfRange extends Exception{
    public NumOutOfRange() {
        super();
    }
    public NumOutOfRange(String message) {
        super(message);
    }
}
