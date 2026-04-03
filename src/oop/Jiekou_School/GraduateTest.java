package Jiekou_School;
interface TeacherInterface {
    public abstract void getPay();
    public abstract void setPay();
}
interface StudentInterface{
    public abstract void getFee();
    public abstract void setFee();
}
class Graduate implements TeacherInterface,StudentInterface{
    String name;
    String gender;
    int age;
    double fee;
    double pay;
    public Graduate(String name, String gender, int age, double fee, double pay) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.fee = fee;
        this.pay = pay;
    }
    @Override
    public void getPay() {}
    @Override
    public void setPay() {}
    @Override
    public void getFee() {}
    @Override
    public void setFee() {}
    public void loanStatus(){
        if (pay*12-fee*2<2000) System.out.println("你需要贷款");
        else System.out.println("你的收入足够支配");
    }
}
public class GraduateTest{
    public static void main(String[] args) {
        Graduate graduate=new Graduate("张三","男",25,50000,8000);
        graduate.loanStatus();
    }
}