package arrays_collections.Car_duixiang_shuzu2;
public class Car {
    String brand;
    double price;
    String color;
    public Car(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    public void Way1(){
        System.out.println(brand+" "+price+" "+color);
    }
}
class Begin{
    public static void main(String[] args) {
        Car car1=new Car("法拉利",2000,"红色");
        Car car2=new Car("比亚迪",3000,"蓝色");
        Car car3=new Car("玛莎拉蒂",9999,"白色");
        Car[] cars= new Car[]{car1,car2,car3};
        Car[] arr=new Car[3];
        arr[0]=car1;
        arr[1]=car2;
        arr[2]=car3;
        for(Car a1:arr){
            a1.Way1();
        }
    }
}
