package Car_duixiang_shuzu;
import java.util.Scanner;
public class Car {
    String Brand;
    double Price;
    String Color;
     public Car(String Brand, double Price, String Color) {
        this.Brand = Brand;
        this.Price = Price;
        this.Color = Color;
    }
    public void Way(){
        System.out.print(Brand+" ");
        System.out.print(Price+" ");
        System.out.println(Color);
    }
}
class Begin{
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        Car[] cars=new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("请输入第" + (i + 1) + "部汽车的品牌: ");
            String brand = a1.next();
            System.out.println("请输入价格: ");
            double price = a1.nextDouble();
            System.out.println("请输入颜色: ");
            String color = a1.next();
            cars[i]=new Car(brand,price,color);
        }
        for (Car car : cars) {
            car.Way();
        }
    }
}
