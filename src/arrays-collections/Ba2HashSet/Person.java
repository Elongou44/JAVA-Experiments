package Ba2HashSet;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
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
    public static void main(String[] args) {
        HashSet<Person> students=new HashSet<>();
        students.add(new Person("张三",20));
        students.add(new Person("张三",45));
        students.add(new Person("削核",21));
        for(Person student:students){
            System.out.println(student);
        }
    }
}
