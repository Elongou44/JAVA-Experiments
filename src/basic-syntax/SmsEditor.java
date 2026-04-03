package basic-syntax;
public class SmsEditor {
    public static void main(String[] args) {
        StringBuffer sms=new StringBuffer();
        sms.append("Hello, this is a new message.");
        sms.insert(7,"world!");
        sms.delete(13,23);
        sms.replace(17,24,"notification");
        System.out.println(sms);
    }
}
