package basic_syntax;

public class FuQing1 {
    String name;
    int age;
    public FuQing1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void a1() {
        System.out.println(name+age);
    }
}
class Student1 extends FuQing1{
    String id="12345";

    public Student1(String name, int age) {
        super(name,age);
    }
    public void c1(){
        System.out.println(name+age+id);
    }
}
class FangFa1{
    public static void main(String[] args) {
        FuQing1 b1 = new FuQing1("mama",40);
        Student1 b2=new Student1("lily",18);
        b1.a1();
        b2.c1();
    }
}