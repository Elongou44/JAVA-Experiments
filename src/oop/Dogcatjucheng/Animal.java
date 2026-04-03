package oop.Dogcatjucheng;
public class Animal {
    String name;
    String color;
    String species;
    public Animal(String name,String color,String species){
        this.name=name;
        this.color=color;
        this.species=species;
    }
    public void Eat(){
        System.out.println(name+"正在吃饭");
    }
    public void LookHome(){
        System.out.println(name+"正在看家");
    }
    public void CatchMouse(){
        System.out.println(name+"正在抓老鼠");
    }
}
class Dog extends Animal{
    public Dog(String name, String color, String species) {
        super(name, color, species);
    }
}
class Cat extends Animal{
    public Cat(String name, String color, String species) {
        super(name, color, species);
    }
}
class Begin{
    public static void main(String[] args) {
        Dog dog=new Dog("旺财","黑色","哈士奇");
        Cat cat=new Cat("汤姆","蓝灰色","英国短毛猫");
        dog.Eat();
        dog.LookHome();
        cat.Eat();
        cat.CatchMouse();
    }
}
