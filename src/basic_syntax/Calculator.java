package basic_syntax;
public class Calculator {
    static double PI=3.14159;
    public static double add(double x,double y){
        return x+y;
    }
    public static double subtract(double x,double y){
        return x-y;
    }
    public static double calculateCircleArea(double r){
        return PI*r*r;
    }
}
class Test1{
    public static void main(String[] args) {
        double sum=Calculator.add(7,1);
        System.out.println("和："+sum);
        double difference=Calculator.subtract(7,1);
        System.out.println("差："+difference);
        double circleArea=Calculator.calculateCircleArea(5);
        System.out.println("圆的面积："+circleArea);
    }
}