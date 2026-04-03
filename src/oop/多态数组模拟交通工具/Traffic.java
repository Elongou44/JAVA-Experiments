package oop.多态数组模拟交通工具;
public abstract class Traffic {
    private String brand;
    public Traffic(String brand) {
        this.brand = brand;
    }
    public abstract void drive();
}
class Car extends Traffic{
    String model;
    @Override
    public void drive() {
        System.out.println("汽车正在路上行驶");
    }
    public Car(String brand,String model){
        super(brand);
        this.model = model;
    }
    public void speed() {
        System.out.println("车加速了");
    }
}
class Bicycle extends Traffic{
    int num;
    @Override
    public void drive() {
        System.out.println("自行车正在路上行驶");
    }
    public Bicycle(String brand,int num){
        super(brand);
        this.num=num;
    }
    public void ride(int people){
        System.out.println("自行车被"+people+"个人骑");
    }
}
class Test {
    public static void main(String[] args) {
        Traffic[] traffic = new Traffic[2];
        Car car = new Car("小米", "SU7");
        Bicycle bicycle = new Bicycle("广理粉色战车", 2);
        traffic[0] = car;
        traffic[1] = bicycle;
        for (Traffic a : traffic) {
            a.drive();
            if (a instanceof Car) {
                ((Car) a).speed();
            } else if (a instanceof Bicycle) {
                ((Bicycle) a).ride(1);
            }
        }
    }
}