package io.Nine.One.DuixiangIO;
import java.io.*;
public class Person implements Serializable {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Test{
    public void writePerson() throws Exception {
        Person person=new Person("削平果核",250);
        FileOutputStream fileOutputStream=new FileOutputStream("src/Nine/One/DuixiangIO/Person.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(person);
        fileOutputStream.close();
        outputStream.close();
        System.out.println("Person对象已序列化到文件。");
    }
    public void readPerson() throws Exception{
        FileInputStream fileInputStream=new FileInputStream("src/Nine/One/DuixiangIO/Person.txt");
        ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
        Person person= (Person) inputStream.readObject();
        fileInputStream.close();
        System.out.println(person);
    }
    public static void main(String[] args) {
        Test test=new Test();
        try {
            test.writePerson();
            test.readPerson();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
