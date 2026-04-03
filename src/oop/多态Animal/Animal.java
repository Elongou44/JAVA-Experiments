package oop.多态Animal;
public abstract class Animal {
    public abstract void cry();
}
class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        show(cat);
        show(dog);
    }
    public static void show(Animal animal) {
        animal.cry();
        if (animal instanceof Cat) {
            ((Cat) animal).catchMouse();
        } else if (animal instanceof Dog) {
            ((Dog) animal).lookHome();
        }
    }
}