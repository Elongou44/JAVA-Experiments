public class gouzaoshangpin {
    public static void main(String[] args) {
        Xinxi[] arr= new Xinxi[3];
        arr[0]=new Xinxi("001","娃哈哈",3.5,100);
        arr[1]=new Xinxi("002","德芙",6.8,99);
        arr[2]=new Xinxi("003","罗浮山泉",2.0,999);
        for (Xinxi xinxi : arr) {
            System.out.println("商品信息：" + xinxi.getid() + "," +
                    xinxi.getname() + "," + xinxi.getprice()+ "," + xinxi.getcount());}
    }
}
class Xinxi{
    private String id;
    private String name;
    private double price;
    private int count;
    public Xinxi(String id,String name,double price,int count){
        this.id=id;
        this.name=name;
        this.price=price;
        this.count=count;
    }
    public String getid() {
        return id;
    }
    public void setid(String id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    public int getcount() {
        return count;
    }
    public void setcount(int count) {
        this.count = count;
    }
}