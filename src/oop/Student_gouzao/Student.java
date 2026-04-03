package oop.Student_gouzao;

public class Student {
    private String name;//姓名
    private int age;//年龄
    private String degree;//学位
    public Student(String name, int age, String degree) {//构造函数
        this.name = name;
        this.age = age;
        this.degree = degree;
    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public String getDegree() {
//        return degree;
//    }
//    public void setDegree(String degree) {
//        this.degree = degree;
//    }
    public void show(){ //输出方法
        System.out.print("姓名："+name+" 年龄："+age+" 学科："+degree);
    }
}
class Underdgraduate extends Student{  //创建本科生类继承student类
    String specialty; //专业
    public Underdgraduate(String name, int age, String degree,String specialty) {
        super(name, age, degree); //调用父类
        this.specialty=specialty;
    }
    @Override
    public void show(){
        super.show();//调用父类方法
        System.out.print(" 专业："+specialty);
    }
}
class Graduate extends Student{ //创建研究生类继承student类
    String direction;
    public Graduate(String name, int age, String degree,String direction) {
        super(name, age, degree);//调用父类方法
        this.direction=direction;
    }
    @Override
    public void show(){
        super.show();
        System.out.print(" 研究方向："+direction);
    }
}
class Begin{
    public static void main(String[] args) {
        Underdgraduate underdgraduate=new Underdgraduate("张三",23,"本科","应用化学");
        Graduate graduate=new Graduate("李四",27,"硕士","网络工程");
        underdgraduate.show();
        System.out.println();
        graduate.show();
    }
}