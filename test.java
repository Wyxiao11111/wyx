interface Countable{
    public void count();
}
class DrawingTablet implements Countable{
    private static int counter = 0;
    public void count(){
        counter++;
        System.out.println("第"+counter+"个对象。");
    }
}
class Line extends Graphics{
    private DrawingTablet dra;
    private Graphics gra;
    public Line(DrawingTablet dra){
        this.dra = dra;
    }
    public Line(Graphics gra){
        this.gra = gra;
        gra.getInfo();
    }
    public void count(){
        dra.count();
    }
}
public class test {
    public static void main(String args[]) {
        for (int x = 1; x < 11; x++) {
            DrawingTablet d = new DrawingTablet();
            Line a = new Line(d);
            Graphics e = new Graphics(x,x);
            Line f = new Line(e);
            a.count();
        }
    }
}
