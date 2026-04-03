package others.gouzaoshangping;

public class Goods {
    String id;
    String name;
    double price;
    int count;
    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public void way1(){
        System.out.println(id+","+name+","+price+","+count);
    }
}
class Begin{
    public static void main(String[] args) {
        Goods[] arr=new Goods[3];
        arr[0]=new Goods("001","娃哈哈",3.5,100);
        arr[1]=new Goods("002","德芙",6.8,99);
        arr[2]=new Goods("003","罗浮山泉",2.0,999);
        for(Goods a1 : arr){
            a1.way1();
        }
    }
}