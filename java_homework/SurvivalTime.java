import java.util.Scanner;
import java.time.LocalDate;
public class SurvivalTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份:");
        int year = sc.nextInt();
        System.out.print("输入月份:");
        int mon = sc.nextInt();
        System.out.print("输入天数:");
        int day = sc.nextInt();
        LocalDate today = LocalDate.now();
        System.out.print("今日日期:" + today);
    }
}
