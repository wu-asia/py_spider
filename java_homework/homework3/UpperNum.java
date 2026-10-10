
import java.util.Scanner;
public class UpperNum {
    public static void main(String[] args){
        System.out.print("输入一个数字:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) > s.charAt(i + 1)){
                System.out.println("这个数不是升序数");
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("这个数是升序数");
    }
}
