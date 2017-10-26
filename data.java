public class data {
    public static void main(String args[]){
        int data [] = new int [3];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        get(data);
    }
    public static void get (int temp[]){
        for (int x = 0; x < temp.length;x ++){
            System.out.println(temp[x]);
        }
    }
}
