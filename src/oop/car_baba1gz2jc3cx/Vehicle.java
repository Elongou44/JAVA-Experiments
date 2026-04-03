package car_baba1gz2jc3cx;

public class Vehicle {
    String type;
    int wheels; //车轮个数
    double weight; //车重
    public Vehicle(String type,int wheels,double weight) {
        this.wheels = wheels;
        this.weight = weight;
        this.type = type;
    }

    public void show(){
        System.out.println("车型："+type);
        System.out.print("车轮："+wheels+",车重："+weight);
    }
}
class Truck extends Vehicle{
    double load;
    public Truck(String type,int wheels, double weight,double load) {
        super(type,wheels,weight);
        this.load=load;
    }
    @Override
    public void show(){
        super.show();
        System.out.print(",载重量："+load);
    }
}
class Minibus extends Truck{
    int passenger;
    public Minibus(String type,int wheels, double weight,double load,int passenger) {
        super(type,wheels,weight,load);
        this.passenger=passenger;
    }
    @Override
    public void show(){
        System.out.println();
        System.out.println();
        System.out.println("子车型：面包车");
        super.show();
        System.out.print("，载人："+passenger);
    }
}
class Begin{
    public static void main(String[] args) {
        Truck truck=new Truck("卡车",6,7500,80);
        Minibus minibus=new Minibus("卡车",4,3000,30,4);
        truck.show();
        minibus.show();
    }
}
