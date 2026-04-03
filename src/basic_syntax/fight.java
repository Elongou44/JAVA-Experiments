package basic_syntax;

public class fight {
    public static void main(String[] args) {
        Tank t1=new Tank();
        t1.setBulletAmount(3);
        t1.setSpeed(50);
        t1.speedUp(15);
        t1.speedDown(10);
        System.out.println("当前坦克的炮弹数是："+t1.getpd());
        System.out.println("当前坦克运行速度是："+t1.getsp());
        t1.fire();
        t1.fire();
        t1.fire();
        t1.fire();
        System.out.println("当前坦克的炮弹数是："+t1.getpd());
    }
}
class Tank{
    private int pd;
    private int sp;
    public void setBulletAmount(int pd) {
        this.pd = pd;
    }
    public int getpd() {
        return pd;
    }
    public void setSpeed(int sp) {
        this.sp = sp;
    }
    public int getsp() {
        return sp;
    }
    public void speedUp(int a){
        sp = sp+a;
    }
    public void speedDown(int a){
        if(sp-a<0){
            System.out.println("坦克速度不能为0");
        }
        sp =sp -a;
    }
    public void fire(){
        if (pd==0)
        {
            System.out.println("没有炮弹。请补充！");
        }
        else {
            pd =pd-1;
            System.out.println("打出一发炮弹");
        }
    }
}