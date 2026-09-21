import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入出生年月日:");
        int year = sc.nextInt();
        int mon = sc.nextInt();
        int day = sc.nextInt();
        int cnt = 0;
        for(int i = year; i <= year + 90; i++){
            if((i % 4 == 0 && i % 100 != 0 )||(i % 400 == 0)){
                cnt++;
            }
        }
        System.out.println("经历"+cnt+"个闰年");
    }
}
