package basic_syntax;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
public class DateDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat date=new SimpleDateFormat("yyyy年MM月dd日");
        String firstDate=sc.nextLine();
        String secondDate=sc.nextLine();
        try {
            Date firstDate1=date.parse(firstDate);
            Date secondDate1=date.parse(secondDate);
            long difference = ChronoUnit.DAYS.between(firstDate1.toInstant(), secondDate1.toInstant());
            System.out.println(difference);
        } catch (ParseException e) {
            System.out.println("输入的日期格式有误");
        }
    }
}
