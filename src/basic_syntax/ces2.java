package basic_syntax;

public class ces2 {
}
abstract class Animal{
    private int age;
    public Animal(int age){
        this.age=age;
    }
    public void drinkwater(){
        System.out.println("water");
    }
    public abstract void eat();
}
interface swim{
    public void swim();
}
class Dog extends Animal implements swim{
    public Dog(int age) {
        super(age);
    }
    public void eat(){
        System.out.println(1);
    }
    public void swim(){
        System.out.println(1);
    }
}
class Sheep extends Animal implements swim{
    public Sheep(int age) {
        super(age);
    }
    public void eat(){
        System.out.println(2);
    }
    public void swim(){
        System.out.println(2);
    }
}
class breeder{
    public void breed(Animal animal) {
        animal.eat();
        animal.drinkwater();
        if (animal instanceof swim) {
            ((swim) animal).swim();
        }
    }
}
class Test01{
    public static void main(String[] args) {
        Animal dog=new Dog(1);
        new breeder().breed(dog);
        Animal sheep=new Sheep(2);
        new breeder().breed(sheep);
    }
}