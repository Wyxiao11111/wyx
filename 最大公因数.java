import java.util.*;
public class 最大公因数 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int a = input.nextInt();
        int b = input.nextInt();
        int t = a;
        int s = b;
        int c = 1;
        while(c!=0){
            c=t%s;
            t = s;
            s = c;}
        System.out.println("这两个数的最大公因数是"+t);
    }
}