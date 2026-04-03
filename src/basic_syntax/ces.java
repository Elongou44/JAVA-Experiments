package basic_syntax;

public class ces{
    private String brand;
    private String type;
    public ces(){

    }
    public ces(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void start(){
        System.out.println(1);
    }
    public void run(){
        System.out.println(2);
    }
}
class Test{
    public static void main(String[] args) {
        ces ces1=new ces();
        ces ces2=new ces("ces2","ces2");
        ces1.setBrand("ces1");
        ces2.start();
        ces2.run();
    }
}