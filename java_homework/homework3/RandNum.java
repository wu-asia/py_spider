import java.lang.Math;
import java.util.Random;
public class RandNum {
    public static void main(String[] args){
        int n = 500;
        int[] arr = new int[7];
        Random rand = new Random(); 
        int max = 6;
        int min = 1;
        for(int i = 0; i < n; i++){
            int randNum = rand.nextInt(max - min + 1) + min;
            arr[randNum]++;
        }
        for(int i = min; i < max; i++){
            System.out.println("骰子的点数为:" + i + "出现的次数是:" + arr[i]);
        }
    }
}
