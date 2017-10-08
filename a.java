public class 最大公因数 {
    public static void main (String[] args) {
        int a=987654321;
        int b=123456789;
        int t = a;
        int s = b;
        int c = 1;
        while(c!=0){
            c=t%s;
          t = s;
          s = c;}
        System.out.println(t);
    }
    }
