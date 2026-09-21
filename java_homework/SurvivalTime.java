import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

public class SurvivalTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份:");
        int year = sc.nextInt();
        System.out.print("输入月份:");
        int mon = sc.nextInt();
        System.out.print("输入天数:");
        int day = sc.nextInt();

        // 你原来写的：获取当前日期、当前时间
        LocalDate date = LocalDate.now();
        int liveYear = date.getYear();
        int liveMonth = date.getMonthValue();
        int liveDay = date.getDayOfMonth();
        LocalTime nowTime = LocalTime.now();
        int liveHour = nowTime.getHour();
        int liveMin = nowTime.getMinute();
        int liveSec = nowTime.getSecond();

        System.out.print("输入小时:");
        int hour = sc.nextInt();
        System.out.print("输入分钟:");
        int min = sc.nextInt();
        System.out.print("输入秒:");
        int sec = sc.nextInt();
        sc.close();

        // 合并：当前日期+当前时间 → 当前完整时间
        LocalDateTime now = LocalDateTime.of(date, nowTime);
        // 合并：出生年月日时分秒 → 出生完整时间
        LocalDateTime birth = LocalDateTime.of(year, mon, day, hour, min, sec);

        // 日历差值：年、月、日
        Period period = Period.between(birth.toLocalDate(), now.toLocalDate());
        int surYear = period.getYears();
        int surMonth = period.getMonths();
        int surDay = period.getDays();

        // 时间差值：时、分、秒、毫秒
        Duration duration = Duration.between(birth, now);
        long surHour = duration.toHoursPart();
        long surMin = duration.toMinutesPart();
        long surSec = duration.toSecondsPart();
        long surMs = duration.toNanosPart() / 1_000_000;
        long totalMs = duration.toMillis();

        System.out.println("今日日期:" + date);
        System.out.println("今日时间:" + nowTime);
        System.out.println("\n已生存："+surYear+"年 "+surMonth+"月 "+surDay+"日 "+surHour+"时 "+surMin+"分 "+surSec+"秒 "+surMs+"毫秒");
        System.out.println("总毫秒数："+totalMs);
    }
}