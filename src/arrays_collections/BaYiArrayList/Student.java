package arrays_collections.BaYiArrayList;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student(String name, int grade, int number) {
        this.name = name;
        this.grade = grade;
        this.number = number;
    }
}
class Test{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("小亮", 99,1));
        list.add(new Student("削平核", -250,2));
        list.add(new Student("小向", 90,3));
        list.add(new Student("小勇", 75,4));
        int score = list.get(0).getGrade();
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getGrade() < score) {
                score = list.get(i).getGrade();
                index = i;
            }
        }
        list.remove(index);
        for (Student student : list) {
            System.out.println("Number："+student.getNumber()+", Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
    }
}